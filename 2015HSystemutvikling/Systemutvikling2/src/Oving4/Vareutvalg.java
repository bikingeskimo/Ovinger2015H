package Oving4;

import java.lang.Double;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nilstes
 */
public class Vareutvalg {
    
    static Map<String, Double> varer = new HashMap<String, Double>() {{
        put("Vaskemaskin", 4999.90);
        put("Brødrister", 4999.90);
        put("PC", 3999.90);
        put("Mobil", 7999.90);            
    }};
    
    public static Double getPris(String vare) {
        return varer.get(vare);
    }

    public static List<String> getVareliste() {
        return new ArrayList<>(varer.keySet());
    }
}
