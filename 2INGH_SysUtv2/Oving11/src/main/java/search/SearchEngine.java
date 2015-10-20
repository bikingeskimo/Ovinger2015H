package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nilstes
 *
 * Endre SearchEngine slik at den bruker Dependency Injection. PageReader skal injiseres istedetfor � opprettes i konstrukt�ren.
 *
 * Opprett en junit-test for � teste SearchEngine
 *
 */
public class SearchEngine {
    PageReader reader;
    Map<String, Map<String,Integer>> scores = new HashMap<>();
    
    public SearchEngine(UrlPageReader dummyReader) {
        this.reader = dummyReader;
    }
    
    public void indexPage(String url) {
        String[] words = reader.readPage(url);
        for(String word : words) {
            Map<String, Integer> scoresForWord = scores.get(word);
            if(scoresForWord == null) {
                scoresForWord = new HashMap<>();
                scores.put(word, scoresForWord);
            }
            Integer score = scoresForWord.get(url);
            if(score == null) {
                scoresForWord.put(url, 1);
            } else {
                scoresForWord.put(url, score+1);
            }
        }
    }
    
    public List<String> search(String word) {
        Map<String,Integer> scoresForWord = scores.get(word);
        List<String> sites = new ArrayList<String>(scoresForWord.keySet());
        Collections.sort(sites, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return scoresForWord.get(o2).compareTo(scoresForWord.get(o1));
            }            
        });
        return sites;
    }
}
