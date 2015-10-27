package Algoritmer.Oving10;

import java.util.Arrays;

/**
 * Created by Roger on 22.10.2015.
 *
 * Lag en �streng� for hver bil og en leksikografisk ordning av strengen slik at rekkef�lgen
 * blir riktig n�r bilene sorteres ved hjelp av denne leksikografiske ordningen.
 * En av �bokstavene� i strengen m� v�re totalsummen, siden det f�rst og fremst skal
 * sorteres etter denne. Andre �bokstaver� m� v�re poengsummene i de ulike l�pene, siden
 * antall heatseire, andreplasser osv. gjenspeiler seg i poengsummene i de ulike l�pene.
 *
 * F.eks. skal Gundersen komme foran Hagadokken siden Gundersen har klart � f� 18 poeng
 * i et l�p, mens Hagadokken bare har oppn�dd 14 i sitt beste l�p. (Hadde de f�tt samme
 * poengsum i sine beste l�p, m�tte vi ha sammenlignet deres nest beste l�p osv.) Av samme
 * grunn skal Ulla komme foran �verg�rd. Og s� m� det v�re noen �bokstaver� som tester
 * poengene oppn�dd i siste omgang, nest siste osv. �ie skal komme foran Nordb� siden de
 * har lik poengsum i 4. og 3. l�p, men �ie har flere i 2. l�p
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
