package smaating.Advent;

import java.io.*;

/**
 * Created by Roger on 05/12/2015.
 */
public class Andre {
    int l;
    int w;
    int h;

    public int box(int l, int w, int h){

        
        return ((2*l*w) + (2*w*h) + (2*h*l));
    }

    public int extra(int l) {
        return l;
    }

    public static void main(String[] args) {
        Andre a = new Andre();

        File file = new File("andre.txt");
        BufferedReader bufferedReader = null;
        try {
            Reader read = new FileReader(file);
            bufferedReader = new BufferedReader(read);
            //a.box(bufferedReader.readLine().replace("x",""));

        } catch (IOException e) {
            System.out.println("Fant ikke fil");
        }

        /*for (int i = 0; i < input.length(); i++) {
            int total = a.box()+a.extra();
        }*/
    }
}


