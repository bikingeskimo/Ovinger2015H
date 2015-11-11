package Algoritmer.Oving13;

import java.util.ArrayList;

/**
 * Created by Roger on 09/11/2015.
 */
public class Node implements Comparable<Node>{
    public ArrayList<Kant> naboer;
    public int minDist = 100000000;
    public Node forrige;

    public int ID;
    public String navn;
    public double latitude;
    public double longtitude;

    public Node(int ID) {
        this.ID = ID;
        naboer = new ArrayList<Kant>();
    }

    public ArrayList<Kant> getNaboer(){
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

    public int compareTo(Node n){
        return Integer.compare(minDist, n.minDist);
    }

}

