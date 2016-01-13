package Algoritmer.Oving8;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Roger on 09/11/2015.
 */
class Graph2 {
    int N, K;
    Node2[] node2;

    public void newGraph(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        node2 = new Node2[N];

        for (int i = 0; i < N; i++) {
            node2[i] = new Node2();
            node2[i].setNr(i);
        }
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            VKant2 k = new VKant2(node2[to], (VKant2) node2[from].kant21, weight);
            node2[from].kant21 = k;
        }
    }

    public void putInQueue(Node2 s) {
        for (int i = N; i-- > 0; ) {
            node2[i].d = new Last2();
        }
        ((Last2) s.d).dist = 0;
    }

    public void dijkstra(Node2 s) {
        putInQueue(s);
        Node2[] pri = new Node2[N];
        makePrioritizedQueue(pri);
        for (int i = N; i > 1; i--) {
            Node2 n = get_min(i, pri);
            for (VKant2 k = (VKant2) n.kant21; k != null; k = (VKant2) k.next) {
                shorten(n, k);
            }
        }
    }

    public void shorten(Node2 n, VKant2 k) {
        Last2 nd = (Last2) n.d, md = (Last2) k.to.d;
        if (md.dist > nd.dist + k.weight) {
            md.dist = nd.dist + k.weight;
            md.last = n;
        }
    }

    public void makePrioritizedQueue(Node2[] t) {
        for (int i = 0; i < N; i++) {
            t[i] = node2[i];
        }
    }

    Node2 get_min(int ant, Node2[] t) {
        int min = 0;
        for (int i = ant; --i > 0; ) {
            if (((Last2) t[i].d).dist < ((Last2) t[min].d).dist) {
                min = i;
            }
        }
        Node2 ret = t[min];
        t[min] = t[ant - 1];
        return ret;
    }

    public String toString(int start) {
        String str = "Node1  Forgjenger  Distanse ";

        System.out.println(str);

        for (int i = 0; i < node2.length; i++) {
            Last2 f = (Last2) node2[i].d;
            if (f.last != null) {
                System.out.println(i + "\t" + f.last.nr + "\t\t" + f.dist);
            } else if (i == start) {
                System.out.println(i + "\tstart\t\t" + f.dist);
            } else {
                System.out.println(i + "\tnull\t\t" + "N�es ikke");
            }
        }
        return "  ";
    }
}
