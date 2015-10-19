package Algoritmer.Oving9;

class Relasjon {

    static boolean sjekkRefleksiv(Graf graf){
        for (int i = 0; i < graf.antallNoder(); i++) {
            if(!graf.harKant(i,i)) return false;
        }
        return true;
    }

    static boolean sjekkSymmetri(Graf graf){
        for (int i = 0; i < graf.antallNoder(); i++) {
            for (int j = 0; j < graf.antallNoder(); j++) {
                if (graf.harKant(i, j) && !graf.harKant(j, i)) return false;
            }
        }
        return true;
    }

    static boolean sjekkAntiSymmetri(Graf graf){
        for (int i = 0; i < graf.antallNoder(); i++) {
            for (int j = i+1; j < i; j++) {
                if (graf.harKant(i, j) && graf.harKant(j, i)) {
                    if (graf.node[i].getN() != graf.node[j].getN()) return false;
                }
            }
        }

        return true;
    }


    static boolean sjekkTransitiv(Graf graf){
        for (int i = 0; i < graf.antallNoder(); i++) {
            for (int j = 0; j < graf.antallNoder(); j++) {
                for (int k = j; k < graf.antallNoder(); k++) {
                    if ((graf.harKant(i, j) && graf.harKant(j, k))
                            && !graf.harKant(i,k))
                        return false;
                }
            }
        }
        return true;
    }


    static boolean sjekkEkvivalens(Graf g){
        return (sjekkRefleksiv(g)
                && sjekkTransitiv(g)
                && sjekkSymmetri(g));
    }

    static boolean sjekkPartiell(Graf g){
        return (sjekkRefleksiv(g)
                && sjekkTransitiv(g)
                && sjekkAntiSymmetri(g));
    }


}
