package Algoritmer.Oving7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Roger on 28.09.2015.
 */


public class Oving7 {
    public static void main(String[] args) throws IOException{
        File fil1 = new File("fil1.txt");                           //bruker L7g1-4, men kaller dem fil1, fil2 osv
        File fil2 = new File("fil2.txt");
        File fil3 = new File("fil3.txt");
        File fil4 = new File("fil4.txt");

        BufferedReader br = new BufferedReader(new FileReader(fil1));
        Graph graph = new Graph();
        graph.newGraph(br);
        graph.bfs(graph.node[5]);
        System.out.println(graph.toString());
    }
}

class Graph {
    int N,K;
    Node []node;

    public void newGraph(BufferedReader br)throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        node = new Node[N];

        for (int i = 0; i < N; i++){
            node[i] = new Node();
            node[i].setNr(i);
        }
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            Kant k = new Kant(node[to], node[from].kant);
            node[from].kant = k;
        }
    }

    public void putInQueue(Node s){
        for (int i = N; i-->0;){
            node[i].d = new Last();
        }
        ((Last)s.d).dist = 0;
    }

    public void bfs(Node s){
        putInQueue(s);
        Queue queue = new Queue(N - 1);
        queue.putInQueue(s);
        while (!queue.empty()){
            Node n = (Node) queue.nextInQueue();
            for (Kant k = n.kant; k != null; k = k.next){
                Last f = (Last)k.to.d;
                if (f.dist == f.infinity){
                    f.dist = ((Last)n.d).dist + 1;
                    f.last = n;
                    queue.putInQueue(k.to);
                }
            }
        }
    }

    public String toString(){
        String str = "Node	Forgjenger 	Distanse \n";
        for(int i = 0; i<node.length; i++){
            if(((Last)node[i].d).last != null){
                str += "" + i + "	" + ((Last)node[i].d).last.getNr() + " 	" + ((Last)node[i].d).dist + "\n";
            }else{
                str += "" + i + "		" + ((Last)node[i].d).dist + "\n";
            }
        }
        return str;
    }
}


class Node{
    Kant kant;
    Object d;
    int nr;

    public void setNr(int nr){
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }
}

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

class Queue {
    private Object[] tab;
    private int start = 0;
    private int stop = 0;
    private int number = 0;

    public Queue(int str){
        tab = new Object[str];
    }

    public boolean empty(){
        return number == 0;
    }

    public boolean full(){
        return number == tab.length;
    }

    public void putInQueue(Object e){
        if (full()) return;
        tab[stop] = e;
        stop = (stop + 1) % tab.length;
        number++;
    }

    public Object nextInQueue(){
        if (!empty()){
            Object e = tab[start];
            start = (start + 1) % tab.length;
            number--;
            return e;
        }
        else return null;
    }

    public Object checkQueue(){
        if (!empty()) return tab[start];
        else return null;
    }
}