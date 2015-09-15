package rest;

import java.io.Serializable;

/**
 * Created by Roger on 09.09.2015.
 */
public class Kunde implements Serializable{
    private String id;
    private String navn;

    public String getId() {
        return id;
    }

    public String getNavn() {
        return navn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
