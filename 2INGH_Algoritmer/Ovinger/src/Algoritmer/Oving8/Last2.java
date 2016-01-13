package Algoritmer.Oving8;

/**
 * Created by Roger on 09/11/2015.
 */
class Last2 {
    int dist;
    Node2 last;
    public static int infinity = 1000000000;

    public int getDist(){
        return dist;
    }

    public Node2 getLast(){
        return last;
    }
    public Last2(){
        dist = infinity;
    }
}
