package Algoritmer.Oving11;

/**
 * Created by Roger on 26.10.2015.
 *
 * Test inputene "", "010", "111" og "0110110010"
 *
 * Test med automat fra 2a og input: "abbb" og "babab"
 *
 */

public class Oving11 {
    String[] inputAlfabet;
    int[] aksepterendeTilstander;
    int[][] nesteTilstandTabell;

    public Oving11(String[] inputAlfabet, int[] aksepterendeTilstander, int[][] nesteTilstandTabell) {
        this.inputAlfabet = inputAlfabet;
        this.aksepterendeTilstander = aksepterendeTilstander;
        this.nesteTilstandTabell = nesteTilstandTabell;
    }

    public boolean sjekkInput(char[] input){
        int tilstand = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < inputAlfabet.length; j++) {
                if (input[i] == inputAlfabet[j].charAt(0)){
                    tilstand = nesteTilstandTabell[j][tilstand];
                }
            }
        }

        for (int i = 0; i < aksepterendeTilstander.length; i++) {
            if(tilstand == aksepterendeTilstander[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] inputalfabet = {"a","b"};
        int[] aksepterendeTilstander = {2};
        int[][] nesteTilstand = {{1,4,2,2,4},{3,2,2,4,4}};


        char[] a1 = {};
        char[] a2 = {0,1,0};
        char[] a3 = {1,1,1};
        char[] a4 = {0,1,1,0,1,1,0,0,1,0};

        char[] d1 = {'a','b','b','b'};
        char[] d2 = {'b','a','b','a','b'};
        char[] d3 = {'b','b','b','a','b'};
        Oving11 oving11 = new Oving11(inputalfabet,aksepterendeTilstander,nesteTilstand);

        System.out.println("null er: " + oving11.sjekkInput(a1));
        System.out.println("010 er: "+ oving11.sjekkInput(a2));
        System.out.println("111 er: "+ oving11.sjekkInput(a3));
        System.out.println("0110110010 er: "+ oving11.sjekkInput(a4));

        System.out.println("abba er: " + oving11.sjekkInput(d1));
        System.out.println("babab er: " + oving11.sjekkInput(d2));
        System.out.println("BJARNE er: " + oving11.sjekkInput(d3));
    }

}
