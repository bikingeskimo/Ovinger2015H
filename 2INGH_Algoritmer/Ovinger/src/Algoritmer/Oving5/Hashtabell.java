/**
 * Implementer en hashtabell som kan lagre tekststrenger. Om dere bruker java, er
 * det naturlig � la hashtabell v�re en klasse. Ikke bruk java sin ferdiglagde hashtabell.
 * H�ndter kollisjoner med dobbel hashing. Lag passende hashfunksjoner h1 og h2.
 * De hashfunksjonene vi har sett p� til n�, opererer p� tall. Strenger kan konverteres
 * til heltall ved hjelp av ascii/unicodeverdier. Bruk en l�kke som plukker ut tegnene
 * i en streng og beregner et heltall. Dette tallet kan deretter brukes p� vanlig m�te
 * med hashfunksjonene. Tegnene i strengen b�r vektes ulikt, slik at f.eks. �Caro� og
 * �Cora� f�r ulik n�kkel, selv om navnene har de samme bokstavene.
 *
 * Vedlagt er en fil som heter navn, som inneholder navn p� de som er involvert i
 * dette faget. La programmet legge disse inn i hashtabellen, og implementer oppslag
 * s� vi kan sp�rre hvem som er med i faget. Ikke lag hashtabellen mye st�rre enn
 * n�dvendig. Det selvf�lgelig lov � ha den litt st�rre for � komme opp til n�rmeste
 * toerpotens eller primtall. Men unng� halvfull tabell.
 * La testprogrammet skrive ut lastfaktoren til slutt, og la det skrive ut hver eneste
 * kollisjon som oppst�r under innsetting og s�k. (Skriv ut de to navnene som kolliderer.)
 * Tell opp totalt antall kollisjoner under innsetting, og skriv det ut sammen
 * med lastfaktoren...
 *
 */
package Algoritmer.Oving5;

import java.io.IOException;

/**
 * @author Roger
 *
 */
public class Hashtabell {
	private String[] ht;
    int arraySize;
    int collisions;

    public Hashtabell(int size) {
        ht = new String[size];
        arraySize = size;
    }

    public int stringToInteger(String s){
        int key = 0;

        for (int i = 0; i < s.length(); i++) {
            key += ((int) s.charAt(i)) * (i+1);
        }
        return key;
    }
	
	public int h1(int key) {return key % arraySize;}
	
	public int h2(int key) {return  10 - (key % 10);}

    public void add(String n){
        int key = stringToInteger(n);
        int h1 = h1(key);
        int h2 = h2(key);

        while (ht[h1] != null){
            collisions ++;
            System.out.println(n + " collided with " + ht[h1] + "\n");
            h1 += h2;
            h1 %= arraySize;
        }
        ht[h1] = n;
    }

    public String find(String n){
        int key = stringToInteger(n);
        int hashVal = h1(key);
        int stepSize = h2(key);

        while (ht[hashVal] != null){
            if (ht[hashVal].equals(n)){
                return ht[hashVal];
            }
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        return null;
    }

    public void displayTable(){
        System.out.println("Table: " + "\n");
        for (int j = 0; j < arraySize; j++) {
            if (ht[j] != null){
                System.out.println(ht[j]);
            }/*else {
                System.out.println(" ");
            }*/
        }
        System.out.println("");
    }

    public int getCollisions(){
        return collisions;
    }

    public double getFactor() {
        double elements = 0;
        for (int i = 0; i < arraySize; i++) {
            if (ht[i] != null) {
                elements++;
            }

        }
        return elements / arraySize;
    }


}
