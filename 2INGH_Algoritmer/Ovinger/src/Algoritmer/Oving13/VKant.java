package Algoritmer.Oving13;

/**
 * Created by Roger on 09/11/2015.
 */
class VKant extends Kant1 {
    int weight;

    public VKant(Node n, VKant next, int weight) {
        super(n, next);
        this.weight = weight;
    }
}
