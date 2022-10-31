package shift.hackathon.demo.repository.dao;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;

import io.quarkus.panache.common.Parameters;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import shift.hackathon.demo.repository.converter.AtendimentoMedicoConverter;
import shift.hackathon.demo.repository.dto.AtendimentoMedicoDto;
import shift.hackathon.demo.repository.entity.AtendimentoMedico;

@ApplicationScoped
public class AtendimentoMedicoDao implements PanacheRepositoryBase<AtendimentoMedico, Long> {

    @Inject
    AtendimentoMedicoConverter atendimentoMedicoConverter;

    public AtendimentoMedicoDto salvar(AtendimentoMedicoDto atendimentoMedicoDto) {
        var atendimento = atendimentoMedicoConverter.toEntity(atendimentoMedicoDto);
        persist(atendimento);

        return atendimentoMedicoConverter.toDto(atendimento);
    }

    public List<AtendimentoMedicoDto> consultar(Long medicoId, Long pacienteId) {

        var atendimentos = list("pacienteId = :pacienteId AND medicoId = :medicoId",
                Parameters.with("pacienteId", pacienteId)
                        .and("medicoId", medicoId));

        return atendimentos.stream().map(atendimentoMedicoConverter::toDto).collect(Collectors.toList());
    }

    public AtendimentoMedicoDto consultar(Long Id) {
        var atendimento = findById(Id);
        if (atendimento == null) {
            throw new NotFoundException();
        }
        
        return atendimentoMedicoConverter.toDto(atendimento);
    }
}
