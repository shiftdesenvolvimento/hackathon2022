package shift.hackathon.demo.resource;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import shift.hackathon.demo.repository.dto.MedicoDto;
import shift.hackathon.demo.service.MedicoService;

@Path("/medico")
public class MedicoResource {
    @Inject 
    MedicoService service;

    @POST
    public Response salvar(@RequestBody @Valid MedicoDto medicoDto) {
        return Response.ok(service.salvar(medicoDto)).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Long id) {
        return Response.ok(service.deletar(id)).build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        return Response.ok(service.getById(id)).build();
    }

    @GET
    @Path("/list")
    public Response list(@QueryParam("nome") String nome) {
        return Response.ok(service.list(nome)).build();
    }

    @GET
    @Path("/list/all")
    public Response list() {
        return Response.ok(service.list()).build();
    }
}
