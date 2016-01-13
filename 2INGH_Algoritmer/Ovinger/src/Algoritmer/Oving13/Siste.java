package Algoritmer.Oving13;

/**
 * Created by Roger on 09/11/2015.
 */
class Siste {
    int dist;
    Node1 last;
    public static int infinity = 1000000000;

    public int getDist(){
        return dist;
    }

    public Node1 getSiste(){
        return last;
    }
    public Siste(){
        dist = infinity;
    }
}
