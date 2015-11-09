package Algoritmer.Oving13;

/**
 * Created by Roger on 09/11/2015.
 */
class Node {
    Node mål;
    int kjøretid;
    int lengde;
    int fartsgrense;

    int ID;
    String navn;
    Kant[] kanter;
    double latitude;
    double longtitude;
    double latCos;




    @Override
    public String toString() {
        return ("Node: " + mål + "Kjøretid: " + kjøretid + "Lengde: " + lengde + "Fartsgrense: " + fartsgrense);
    }



}

