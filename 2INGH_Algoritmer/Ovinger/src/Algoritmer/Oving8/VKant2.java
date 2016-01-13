package Algoritmer.Oving8;

/**
 * Created by Roger on 09/11/2015.
 */
class VKant2 extends Kant2 {
    int weight;

    public VKant2(Node2 n, VKant2 next, int weight) {
        super(n, next);
        this.weight = weight;
    }
}
