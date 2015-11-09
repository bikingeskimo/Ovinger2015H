package Algoritmer.Oving13;

/**
 * Filen noder.txt inneholder 604764 noder, formattert slik:
 * nodenr   breddegrad  lengdegrad  "navn"
 *
 * Det er bare noen få kryss som har navn. Navnene trengs ikke for å løse oppgaven, men gjør det
 * lettere å navigere mellom kjente steder. De er også praktiske hvis noen vil tegne opp deler av
 * kartet.
 *
 * noder_med_navn.txt er fin å bruke som testing før du kommer i mål (mindre fil, kjente navn) f.eks. Prinsenkrysset
 *
 *
 * kanter.txt er på 48MB og inneholder 1 334 049 vektede kanter. Format:
 * franode      tilnode     kjøretid    lengde    fartsgrense
 *
 * Lag programmet så det kan finne reiserute og avstanden mellom interessante steder. A* er nesten
 * lik Dijkstras algoritme. Legg inn en if-test så det går an å kjøre ren Dijkstra, uten estimerte
 * avstander også. (Dvs. estimat lik 0.) La programmet telle opp hvor mange noder det sjekker før
 * det finner målnoden, så får vi se hvor mye A* hjelper.
 *
 * Programmet må kunne finne vei mellom to fritt valgte steder i kartmaterialet, og fortelle hvor
 * lang tid det tar å kjøre den aktuelle strekningen. Dette bør stemme med fasit. . .
 * Programmet må kunne gjøre A*-søk (med avstandsestimater) og Dijkstra-søk (uten avstandsestimater).
 * Ta tiden på hver av variantene, og sjekk hvor mange noder som blir prosessert.
 * Forhåpentligvis ser vi at A* behandler færre noder – om det også går raskere vil avhenge av
 * implementasjon, da A* gjør mer arbeid per node på grunn av avstandsberegningene. Hvis de to
 * ender opp med ulike veier, er det feil!
 *
 *
 * Created by Roger on 09/11/2015.
 */
public class Oving13{
    int N, K;
    Node[] node;

    public void initforgj(Node s) {
        for (int i = N; i-- > 0; ) {
            node[i].d = new Last();
        }
        ((Last) s.d).dist = 0;
    }

    public void lag_priko(Node[] t) {
        for (int i = 0; i < N; i++) {
            t[i] = node[i];
        }
    }
    void dijkstra(Node s) {
        initforgj(s);
        Node []pri = new Node[N];
        lag_priko(pri);
        for (int i = N; i > 1; --i) {
            Node n = hent_min(i, pri);
            for (VKant k=(VKant)n.kant1; k != null;
                 k = (VKant) k.neste) forkort(n, k);
        }
    }

    Node hent_min(int ant, Node[] n) {
        int min = 0;
        for (int i = ant; --i > 0; ) {
            if (((Last) n[i].d).dist < ((Last) n[min].d).dist) {
                min = i;
            }
        }
        Node ret = n[min];
        n[min] = n[ant - 1];
        return ret;
    }
    public void forkort(Node n, VKant k) {
        Last nd = (Last) n.d, md = (Last) k.til.d;
        if (md.dist > nd.dist + k.weight) {
            md.dist = nd.dist + k.weight;
            md.last = n;
        }
    }


}
