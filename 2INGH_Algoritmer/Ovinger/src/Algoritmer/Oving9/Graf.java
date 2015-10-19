package Algoritmer.Oving9;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Graf {
    int N, K;
    Node []node;

    public void ny_ugraf(BufferedReader br) throws IOException {
        StringTokenizer st =
                new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        node = new Node[N];

        for (int i = 0; i < N; ++i) {
            node[i] = new Node(i);
        }
        K = Integer.parseInt(st.nextToken());

        for (int i=0; i < K; ++i) {
            st = new
                    StringTokenizer(br.readLine());
            int fra =
                    Integer.parseInt(st.nextToken());
            int til =
                    Integer.parseInt(st.nextToken());

            Kant k = new
                    Kant(node[til], node[fra].kant1);
            node[fra].kanter.add(k);

            //Kant k2 = new
              //      Kant(node[fra], node[til].kant1);
            //node[til].kanter.add(k2);
        }
    }
    public void ny_vgraf(BufferedReader br) throws IOException {
        StringTokenizer st =
                new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        node = new Node[N];

        for (int i = 0; i < N; ++i)
            node[i] = new Node(i);
        K = Integer.parseInt(st.nextToken());
        for (int i=0; i < K; ++i) {
            st = new
                    StringTokenizer(br.readLine());
            int fra =
                    Integer.parseInt(st.nextToken());
            int til =
                    Integer.parseInt(st.nextToken());
            int vekt =
                    Integer.parseInt(st.nextToken());
            Vkant k = new Vkant(node[til],
                    (Vkant)node[fra].kant1, vekt);
            node[fra].kant1 = k;
        }
    }

    public int antallNoder(){
        return node.length;
    }

    public boolean harKant(int fra, int til){
        for (int i = 0; i < node[fra].kanter.size(); i++) {
            if(node[fra].kanter.get(i).til.equals(node[til])) return true;
        }
        return false;
    }


}


