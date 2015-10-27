package Algoritmer.Oving10;

import java.util.Arrays;

/**
 * Created by Roger on 22.10.2015.4
 *
 */
public class Cars {
    private Car[] cars;

    public Cars(Car[] cars) {
        this.cars = cars;
    }

    public String getResults() {
        sortList();
        String out = "Rank - Poeng - Navn \n";
        for (int i = 0; i < cars.length; i++) {
            out += (i + 1) + "   -   " + printCar(i) + "\n";
        }
        return out;
    }

    private void sortList() {
        Arrays.sort(cars);
    }

    public String printCar(int i) {
        return cars[i].getSum() + "     - " + cars[i].getName();
    }

    public String getSortTable() {
        String out = "";
        for (int i = 0; i < cars.length; i++) {
            out += cars[i].getName() + "  -   " + cars[i].getTable() + "\n";
        }
        return out;
    }

    public static void lexSort(String[] a) {
        for (int k = 0; k < a.length - 1; k++) {
            String t = a[k + 1];
            int i = k;

            while (i >= 0 && (a[i].compareTo(t) > 0)) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = t;
        }
    }
}
