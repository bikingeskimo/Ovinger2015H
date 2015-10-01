package Algoritmer.Oving5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Oppgave 1
        Hashtabell ht = new Hashtabell(131);

        try (BufferedReader br = new BufferedReader(new FileReader("navn.txt"))){
            String current;
            while ((current = br.readLine()) != null){
                ht.add(current);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        String target = "Bergheim,Roger Schei,rogersbe@student.hist.no";
        System.out.println("Collisions: " + ht.getCollisions());
        System.out.println("Loadfactor: " + ht.getFactor());
        System.out.println(ht.find(target));
        System.out.println("\n");



        //Oppgave 2 og 3
        RandomHash ht2 = new RandomHash(15000000);
        int[] random = new int[1000000];
        Random rnd = new Random();
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < random.length; i++) {
            random[i] = rnd.nextInt((100000000 - 1) + 1) + 1;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < random.length; i++) {
            ht2.insert(random[i]);
        }
        long time = (System.currentTimeMillis() - startTime);
        System.out.println("Time my hash: " + time + " ms");
        System.out.println("Collisions " + ht2.getCollisions());

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < random.length; i++) {
            hash.put(random[i], random[i]);
        }
        long time2 = (System.currentTimeMillis() - startTime2);
        System.out.println("Time Java: " + time2 + " ms");

    }
}
