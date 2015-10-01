package rest;

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
        Kunde k = kunder.get(kundeId);
        if(k == null) throw new javax.ws.rs.NotFoundException();
        return kunder.get(kundeId);
    }

    @DELETE
    @Path("/{kundeId}")
    public void deleteKunde(@PathParam("kundeId") String kundeId){
        kunder.remove(kundeId);
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

    @PUT
    @Consumes (MediaType.APPLICATION_JSON)
    public void updateKunde(Kunde kunde){
        if(!kunder.containsKey(kunde.getId())) throw new javax.ws.rs.NotFoundException();
        kunder.get(kunde.getId()).setNavn(kunde.getNavn());
    }
}
