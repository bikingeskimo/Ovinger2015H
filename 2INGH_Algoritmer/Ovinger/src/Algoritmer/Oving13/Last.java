package Algoritmer.Oving13;

/**
 * Created by Roger on 09/11/2015.
 */
class Last {
    int dist;
    Node last;
    public static int infinity = 1000000000;

    public int getDist(){
        return dist;
    }

    public Node getLast(){
        return last;
    }
    public Last(){
        dist = infinity;
    }
}
