package Oving5.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/kunder/")
public class KundeService {
    private static Map<String,Kunde> kunder = new HashMap<>();

    @GET
    @Path("/{kundeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Kunde getKunde(@PathParam("kundeId") String kundeId) {
        if (kunder.get(kundeId) != null){
            return kunder.get(kundeId);
        } else {
            throw new javax.ws.rs.NotFoundException();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Kunde> getKunder() {
        return kunder.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addKunde(Kunde kunde) {
        kunder.put(kunde.getId(), kunde);
    }

    @DELETE
    @Path("/{kundeId}")
    @Consumes (MediaType.APPLICATION_JSON)
    public void deleteKunde(@PathParam("kundeId") String kundeId){
        kunder.remove(kundeId);
    }

    @PUT
    @Consumes (MediaType.APPLICATION_JSON)
    public void updateKunde(Kunde kunde){
        Kunde k = kunder.get(kunde.getId());
        if (k != null){
            k.setNavn(kunde.getNavn());
        }else{
            throw new javax.ws.rs.NotFoundException();
        }
    }
}
