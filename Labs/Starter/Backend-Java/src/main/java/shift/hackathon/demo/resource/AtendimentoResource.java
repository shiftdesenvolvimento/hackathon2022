package shift.hackathon.demo.resource;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import shift.hackathon.demo.repository.dto.AtendimentoMedicoDto;
import shift.hackathon.demo.service.AtendimentoMedicoService;
import shift.hackathon.demo.service.MedicoService;
import shift.hackathon.demo.service.PacienteService;

@Path("/atendimento")
public class AtendimentoResource {

    @Inject
    AtendimentoMedicoService service;

    @Inject
    PacienteService pacienteService;

    @Inject
    MedicoService medicoService;

    @POST
    public Response salvar(@RequestBody @Valid AtendimentoMedicoDto atendimentoMedicoDto) {

        return Response.ok(service.salvar(atendimentoMedicoDto)).build();
    }

    @GET
    @Path("/medico/{medicoId}/paciente/{pacienteId}")
    public Response consultarPorMedicoPaciente(@PathParam("id") Long medicoId,
            @PathParam("id") Long pacienteId) {

        var paciente = pacienteService.getById(pacienteId);
        var medico = medicoService.getById(medicoId);

        return Response.ok(service.consultar(medico, paciente)).build();
    }

    @GET
    @Path("/{id}")
    public Response consultarPorId(@PathParam("id") Long id) {
        
        return Response.ok(service.consultar(id)).build();
    }
}
