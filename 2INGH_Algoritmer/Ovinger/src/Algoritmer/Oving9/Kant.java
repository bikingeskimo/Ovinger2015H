package Algoritmer.Oving9;

import java.util.ArrayList;

/**
 *
 * */
//Dette er en generert fil - ikke rediger den

class Node implements Comparable<Node>{
    private int n;


    public Node(int n) {
        this.n = n;
    }

    ArrayList<Kant> kanter = new ArrayList<Kant>();
    Kant kant1;
    Object d; //Andre nodedata

    public int getN() {
        return n;
    }

    @Override
    public int compareTo(Node o) {
        if(this.getN() > o.getN()){ return 1;}
        else if(this.getN() == o.getN()){ return 0;}
        else return -1;
    }
}

class Kant {
    Kant neste;
    Node til;
    public Kant(Node n, Kant nst) {
        til = n;
        neste = nst;
    }
}

class Vkant extends Kant {
    int vekt;
    public Vkant(Node n, Vkant nst, int vkt) {
        super(n, nst);
        vekt = vkt;
    }
}

class Krkant {
    int vekt;
    Node fra;
    Node til;
    boolean i_mst;
}

class Forgj {
    int dist;
    Node forgj;
    static int uendelig = 1000000000;
    public int finn_dist() {return dist;}
    public Node finn_forgj() {return forgj;}
    public Forgj() {
        dist = uendelig;
    }
}
