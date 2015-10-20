package search;

import static org.mockito.Mockito.*;

/**
 * @author nilstes
 *
 * Vedlagt er en klasse for en søkemotor, SearchEngine, som dere skal teste med Mockito. Vedlagt er også en interface, PageReader, og en implementasjon
 * (UrlPageReader) som ikke virker. NB! Dere skal ikke implementere UrlPageReader. Les oppgaveteksten under.
 * Klassen PageReader har som oppgave å liste ut alle ord som er tilstede på en webside. SearchEngine har to metoder, en for å indeksere en side og en for å søke etter ord på
 * alle websidene som er indeksert.
 *
 * Lag et enkelt javaprosjekt som inkluderer disse klassene.
 *
 *
 * Bruk Mockito til å lage en mock av PageReader som returnerer en hardkodet liste med ord som den "har funnet" på en url.
 *
 * Varier responsen i forhold til gitt url.
 *
 * Importer mockito statisk:
 * import static org.mockito.Mockito.*;
 *
 *
 * Lag en ny instans av SearchEngine med PageReader-mock'en som parameter. Indekser to eller flere sider og sjekk med assert() at søkemotoren
 * returnerer url'ene i riktig rekkefølge når man kjører søk. Den siden som har flest instanser av søkeordet skal komme først.
 *
 * Sjekk med assert() om søkemotoren tåler at man søker på ord som ikke er indeksert. Fiks SearchEngine hvis det ikke er tilfelle.
 *
 * Mockito: https://code.google.com/p/mockito/downloads/detail?name=mockito-all-1.9.5.jar
 *
 */
public interface PageReader {
    String[] readPage(String url);
}
