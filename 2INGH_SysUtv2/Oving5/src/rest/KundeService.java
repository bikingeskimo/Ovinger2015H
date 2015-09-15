package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roger on 09.09.2015.
 */
@Path("/kunder/")
public class KundeService {
    private static Map<String,Kunde> kunder = new HashMap<>();

    @GET
    @Path("/{kundeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Kunde getKunde(@PathParam("kundeId") String kundeId) {
        Kunde k = kunder.get(kundeId);
        if (k == null) throw new NotFoundException();
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
    @Consumes(MediaType.APPLICATION_JSON)
    public void alterKunder(Kunde kunde){
        if (!kunder.containsKey(kunde.getId())) throw new NotFoundException();
        kunder.get(kunde.getId()).setNavn(kunde.getNavn());
    }
}

