package Algoritmer.Oving8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
        graph2.dijkstra(graph2.node2[startNode]);
        graph2.toString(startNode);
    }
}