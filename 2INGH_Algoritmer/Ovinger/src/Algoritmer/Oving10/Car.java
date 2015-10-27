package Algoritmer.Oving10;

import java.util.Arrays;

/**
 * Created by Roger on 22.10.2015.
 *
 * Lag en «streng» for hver bil og en leksikografisk ordning av strengen slik at rekkefølgen
 * blir riktig når bilene sorteres ved hjelp av denne leksikografiske ordningen.
 * En av «bokstavene» i strengen må være totalsummen, siden det først og fremst skal
 * sorteres etter denne. Andre «bokstaver» må være poengsummene i de ulike løpene, siden
 * antall heatseire, andreplasser osv. gjenspeiler seg i poengsummene i de ulike løpene.
 *
 * F.eks. skal Gundersen komme foran Hagadokken siden Gundersen har klart å få 18 poeng
 * i et løp, mens Hagadokken bare har oppnådd 14 i sitt beste løp. (Hadde de fått samme
 * poengsum i sine beste løp, måtte vi ha sammenlignet deres nest beste løp osv.) Av samme
 * grunn skal Ulla komme foran Øvergård. Og så må det være noen «bokstaver» som tester
 * poengene oppnådd i siste omgang, nest siste osv. Øie skal komme foran Nordbø siden de
 * har lik poengsum i 4. og 3. løp, men Øie har flere i 2. løp
 *
 */
class Car implements Comparable<Car>{
    int[] points;
    String name;
    int[] table;

    public Car(String name, int[] points) {
        this.points = points;
        this.name = name;
        fillTable();
    }

    public String getName() {
        return name;
    }

    public String getTable() {
        String out = "";
        for (int i = 0; i < table.length; i++) {
            out += table[i] + "-";
        }
        return out;
    }

    public int getSum() {
        int sum = 0;
        for (int i : points) {
            sum += 1;
        }
        return sum;
    }

    public int getRacePoints(int raceNr){
        if (raceNr - 1 > points.length) return 0;
        return points[(raceNr - 1)];
    }

    public int getBestRace(int raceNr){
        if (raceNr - 1 > points.length) return 0;
        int[] help = Arrays.copyOf(points, points.length);
        int i = points.length - 1 - raceNr;
        Arrays.sort(help);
        return help[i];
    }

    private void fillTable(){
        int i = 0;
        table = new int[2 * points.length + 1];
        table[i] = getSum();
        i++;
        for (int j = 0; j < points.length; j++) {
            table[i] = getBestRace(j);
            i++;
        }
    }

    @Override
    public int compareTo(Car c){
        for (int i = 0; i < table.length; i++) {
            if(this.table[i] < c.table[i]) return 1;
            if(this.table[i] > c.table[i]) return -1;
            if(this.table[i] == c.table[i]);
        }
        return 0;
    }

}
