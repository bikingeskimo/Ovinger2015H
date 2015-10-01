package Algoritmer.Oving5;

/**
 * Created by Roger on 17.09.2015.
 */
public class RandomHash {
    private int[] ht;

    private int size, collisions;

    public RandomHash(int size) {
        ht = new int[size];
        this.size = size;
    }

    public void displayTable(){
        System.out.println("Table: ");
        for (int i = 0; i < size; i++) {
            if (ht[i] != 0){
                System.out.println(ht[i] + " ");
            }else {
                System.out.println(" ");
            }
            System.out.println("");
        }
    }

    public int h1(int key){return key % size;}

    public int h2(int key){return  128 - (key % 128);}

    public void insert(int key){
        int value = h1(key);
        int stepSize = h2(key);

        while (ht[value] != 0){
            collisions++;
            value += stepSize;
            value %= size;
        }
        ht[value] = key;
    }

    public int find(int key){
        int value = h1(key);
        int stepSize = h2(key);

        while (ht[value] != 0) {
            if(ht[value] == key) {
                return ht[value];
            }
            value += stepSize;
            value %= size;
        }
        return -1;
    }
    public int getCollisions(){
        return collisions;
    }

}
