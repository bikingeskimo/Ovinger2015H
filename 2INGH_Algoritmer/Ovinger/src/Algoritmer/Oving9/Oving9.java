package Algoritmer.Oving9;

import java.io.*;
import java.util.Arrays;

class Oving9 {


    public static void main(String[] args) {
        Graf graf = new Graf();

        File file = new File("fil6.txt");
        BufferedReader bufferedReader = null;

        try {
            Reader read = new FileReader(file);
            bufferedReader = new BufferedReader(read);
            graf.ny_ugraf(bufferedReader);

        } catch (IOException e) {
            System.out.println("Fant ikke fil");
        }

        int fra = 3;
        int til = 1;
        System.out.println("Antall noder: "+ graf.antallNoder());
        System.out.println("Har kant fra "+fra+" til "+til+": " + graf.harKant(fra,til));

        System.out.println("Refleksiv? "+ Relasjon.sjekkRefleksiv(graf));
        System.out.println("Symmetrisk? "+ Relasjon.sjekkSymmetri(graf));
        System.out.println("Transitiv? "+ Relasjon.sjekkTransitiv(graf));
        System.out.println("Antisymmetrisk? "+ Relasjon.sjekkAntiSymmetri(graf));
        System.out.println("Ekvivalensrelasjon? "+ Relasjon.sjekkEkvivalens(graf));
        System.out.println("Partiell ordning? "+ Relasjon.sjekkPartiell(graf));




    }
}