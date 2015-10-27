package Algoritmer.Oving10;

/**
 * Created by Roger on 22.10.2015.
 *
 * Lag et program som foretar denne sorteringa. Du skal lage en "streng" av heltall (altså
 * IKKE en tekststreng), og selv implementere den leksikografiske sorteringa.
 *
 * Det kan være lurt å starte med en klasse Bil med en tabell av poenger og en compareTometode
 * som forteller om en bil skal komme foran eller bak en annen bil. Deretter kan du
 * lage en klasse som inneholder en tabell av Bil-objekter, og sorterer dem.
 *
 *
 */
public class Oving10 {
    static int[] point1 = {0,0,0,0,13};
    static int[] point2 = {12,13,10,0,0};
    static int[] point3 = {28,16,26,26,25};
    static int[] point4 = {22,18,22,23,17};
    static int[] point5 = {5,8,18,12,0};
    static int[] point6 = {14,10,9,10,0};
    static int[] point7 = {5,0,0,5,0};
    static int[] point8 = {20,28,16,18,19};
    static int[] point9 = {8,0,5,0,0};
    static int[] point10 = {0,0,12,0,0};
    static int[] point11 = {0,5,0,5,0};
    static int[] point12 = {5,7,0,0,0};

    static Car car1 = new Car("Andreassen",point1);
    static Car car2 = new Car("Bråten",point2);
    static Car car3 = new Car("Eneberg",point3);
    static Car car4 = new Car("Gabrielsen",point4);
    static Car car5 = new Car("Gundersen",point5);
    static Car car6 = new Car("Hagadokken",point6);
    static Car car7 = new Car("Nordbø",point7);
    static Car car8 = new Car("Stokke",point8);
    static Car car9 = new Car("Tønsberg",point9);
    static Car car10 = new Car("Ulla",point10);
    static Car car11 = new Car("Øie",point11);
    static Car car12 = new Car("Øvergård",point12);

    static Car[] cars = {car1,car2,car3,car4,car5,car6,car7,car8
            ,car9,car10,car11,car12};

    static Cars race = new Cars(cars);

    public static void main(String[] args) {
        System.out.println("Resultat");
        System.out.println(race.getResults());
        System.out.println("\n\nSortert tabell");
        System.out.println(race.getSortTable());

    }
}
