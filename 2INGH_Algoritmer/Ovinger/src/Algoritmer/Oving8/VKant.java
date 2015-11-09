package Algoritmer.Oving8;

/**
 * Created by Roger on 09/11/2015.
 */
class VKant extends Kant {
    int weight;

    public VKant(Node n, VKant next, int weight) {
        super(n, next);
        this.weight = weight;
    }
}
