package Algoritmer.Oving13;

import java.io.File;
import java.io.IOException;

/**
 * Created by Roger on 09/11/2015.
 */
public class Kartsøk {
    public int main(int argc, char argv[]){
        System.out.println("A* kartsøk \n");
        File fil = new File("noder.txt");

        Graph2 graph2 = new Graph2();
        try{
            graph2.newGraph(br);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
