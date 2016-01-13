package Algoritmer.Oving13;

import java.util.ArrayList;

/**
 * Created by Roger on 09/11/2015.
 */
public class Node1 implements Comparable<Node1>{
    public ArrayList<Kant3> naboer;
    public int minDist = 100000000;
    public Node1 forrige;

    public int ID;
    public String navn;
    public double latitude;
    public double longtitude;

    public Node1(int ID) {
        this.ID = ID;
        naboer = new ArrayList<Kant3>();
    }

    public ArrayList<Kant3> getNaboer(){
        return naboer;
    }

    public int getDist(){
        return minDist;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int compareTo(Node1 n){
        return Integer.compare(minDist, n.minDist);
    }

}

