package search;

import static org.mockito.Mockito.*;

/**
 * @author nilstes
 *
 * Vedlagt er en klasse for en s�kemotor, SearchEngine, som dere skal teste med Mockito. Vedlagt er ogs� en interface, PageReader, og en implementasjon
 * (UrlPageReader) som ikke virker. NB! Dere skal ikke implementere UrlPageReader. Les oppgaveteksten under.
 * Klassen PageReader har som oppgave � liste ut alle ord som er tilstede p� en webside. SearchEngine har to metoder, en for � indeksere en side og en for � s�ke etter ord p�
 * alle websidene som er indeksert.
 *
 * Lag et enkelt javaprosjekt som inkluderer disse klassene.
 *
 *
 * Bruk Mockito til � lage en mock av PageReader som returnerer en hardkodet liste med ord som den "har funnet" p� en url.
 *
 * Varier responsen i forhold til gitt url.
 *
 * Importer mockito statisk:
 * import static org.mockito.Mockito.*;
 *
 *
 * Lag en ny instans av SearchEngine med PageReader-mock'en som parameter. Indekser to eller flere sider og sjekk med assert() at s�kemotoren
 * returnerer url'ene i riktig rekkef�lge n�r man kj�rer s�k. Den siden som har flest instanser av s�keordet skal komme f�rst.
 *
 * Sjekk med assert() om s�kemotoren t�ler at man s�ker p� ord som ikke er indeksert. Fiks SearchEngine hvis det ikke er tilfelle.
 *
 * Mockito: https://code.google.com/p/mockito/downloads/detail?name=mockito-all-1.9.5.jar
 *
 */
public interface PageReader {
    String[] readPage(String url);
}
