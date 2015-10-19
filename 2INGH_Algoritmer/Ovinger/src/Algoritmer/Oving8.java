package Algoritmer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Roger on 07/10/2015.
 */
public class Oving8 {
    public static void main(String[] args) throws IOException {
        File fil = new File("fil5.txt");

        BufferedReader br = new BufferedReader(new FileReader(fil));
        Graph2 graph2 = new Graph2();
        try{
            graph2.newGraph(br);
        }catch (IOException e){
            e.printStackTrace();
        }

        int startNode = 1;
        graph2.dijkstra(graph2.node[startNode]);
        graph2.toString(startNode);
    }
}

class Graph2 {
    int N, K;
    Node[] node;

    public void newGraph(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        node = new Node[N];

        for (int i = 0; i < N; i++) {
            node[i] = new Node();
            node[i].setNr(i);
        }
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            VKant k = new VKant(node[to], (VKant) node[from].kant, weight);
            node[from].kant = k;
        }
    }

    public void putInQueue(Node s) {
        for (int i = N; i-- > 0; ) {
            node[i].d = new Last();
        }
        ((Last) s.d).dist = 0;
    }

    public void dijkstra(Node s) {
        putInQueue(s);
        Node[] pri = new Node[N];
        makePrioritizedQueue(pri);
        for (int i = N; i > 1; i--) {
            Node n = get_min(i, pri);
            for (VKant k = (VKant) n.kant; k != null; k = (VKant) k.next) {
                shorten(n, k);
            }
        }
    }

    public void shorten(Node n, VKant k) {
        Last nd = (Last) n.d, md = (Last) k.to.d;
        if (md.dist > nd.dist + k.weight) {
            md.dist = nd.dist + k.weight;
            md.last = n;
        }
    }

    public void makePrioritizedQueue(Node[] t) {
        for (int i = 0; i < N; i++) {
            t[i] = node[i];
        }
    }

    Node get_min(int ant, Node[] t) {
        int min = 0;
        for (int i = ant; --i > 0; ) {
            if (((Last) t[i].d).dist < ((Last) t[min].d).dist) {
                min = i;
            }
        }
        Node ret = t[min];
        t[min] = t[ant - 1];
        return ret;
    }

    public String toString(int start) {
        String str = "Node  Forgjenger  Distanse ";

        System.out.println(str);

        for (int i = 0; i < node.length; i++) {
            Last f = (Last) node[i].d;
            if (f.last != null) {
                System.out.println(i + "\t" + f.last.nr + "\t\t" + f.dist);
            } else if (i == start) {
                System.out.println(i + "\tstart\t\t" + f.dist);
            } else {
                System.out.println(i + "\tnull\t\t" + "Nåes ikke");
            }
        }
        return "  ";
    }
}

class VKant extends Kant {
    int weight;

    public VKant(Node n, VKant next, int weight) {
        super(n, next);
        this.weight = weight;
    }
}