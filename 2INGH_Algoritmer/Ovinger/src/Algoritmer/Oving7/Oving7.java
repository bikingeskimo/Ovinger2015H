package Algoritmer.Oving7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Roger on 28.09.2015.
 */


public class Oving7 {
    public static void main(String[] args) throws IOException{
        File fil1 = new File("fil1.txt");
        File fil2 = new File("fil2.txt");
        File fil3 = new File("fil3.txt");
        File fil4 = new File("fil4.txt");

        BufferedReader br = new BufferedReader(new FileReader(fil1));
        Graf graf = new Graf();
        graf.ny_ugraf(br);
        graf.bfs(graf.node[3]);
        System.out.println(graf.toString());
    }
}

class Graf{
    int N,K;
    Node []node;

    public void ny_ugraf(BufferedReader br)throws IOException {
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
            int fra = Integer.parseInt(st.nextToken());
            int til = Integer.parseInt(st.nextToken());
            Kant k = new Kant(node[til], node[fra].kant1);
            node[fra].kant1 = k;
        }
    }

    public void initforgj(Node s){
        for (int i = N; i-->0;){
            node[i].d = new Forgj();
        }
        ((Forgj)s.d).dist = 0;
    }

    public void bfs(Node s){
        initforgj(s);
        Kø kø = new Kø(N - 1);
        kø.leggIKø(s);
        while (!kø.tom()){
            Node n = (Node)kø.nesteIKø();
            for (Kant k = n.kant1; k != null; k = k.neste){
                Forgj f = (Forgj)k.til.d;
                if (f.dist == f.uendelig){
                    f.dist = ((Forgj)n.d).dist + 1;
                    f.forgj = n;
                    kø.leggIKø(k.til);
                }
            }
        }
    }

    public String toString(){
        String str = "Node	Forgj 	Dist \n";
        for(int i = 0; i<node.length; i++){
            if(((Forgj)node[i].d).forgj != null){
                str += "" + i + "	" + ((Forgj)node[i].d).forgj.getNr() + " 	" + ((Forgj)node[i].d).dist + "\n";
            }else{
                str += "" + i + "		" + ((Forgj)node[i].d).dist + "\n";
            }
        }
        return str;
    }
}


class Kant{
    Kant neste;
    Node til;

    public Kant(Node n, Kant nst){
        til = n;
        neste = nst;
    }
}

class Node{
    Kant kant1;
    Object d;
    int nr;

    public void setNr(int nr){
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }
}

class Forgj {
    int dist;
    Node forgj;
    public static int uendelig = 1000000000;
    public int finn_dist(){
        return dist;
    }
    public Node finn_forj(){
        return forgj;
    }
    public Forgj(){
        dist = uendelig;
    }
}

class Kø{
    private Object[] tab;
    private int start = 0;
    private int slutt = 0;
    private int antall = 0;

    public Kø(int str){
        tab = new Object[str];
    }

    public boolean tom(){
        return antall == 0;
    }

    public boolean full(){
        return antall == tab.length;
    }

    public void leggIKø(Object e){
        if (full()) return;
        tab[slutt] = e;
        slutt = (slutt + 1) % tab.length;
        antall++;
    }

    public Object nesteIKø(){
        if (!tom()){
            Object e = tab[start];
            start = (start + 1) % tab.length;
            antall--;
            return e;
        }
        else return null;
    }

    public Object sjekkKø(){
        if (!tom()) return tab[start];
        else return null;
    }
}