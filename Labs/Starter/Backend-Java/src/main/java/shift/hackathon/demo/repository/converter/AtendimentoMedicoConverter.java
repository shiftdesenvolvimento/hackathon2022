package shift.hackathon.demo.repository.converter;

import javax.enterprise.context.ApplicationScoped;

import shift.hackathon.demo.repository.dto.AtendimentoMedicoDto;
import shift.hackathon.demo.repository.entity.AtendimentoMedico;
import shift.hackathon.demo.repository.interfaces.Converter;

@ApplicationScoped
public class AtendimentoMedicoConverter implements Converter<AtendimentoMedico, AtendimentoMedicoDto>  {

    @Override
    public AtendimentoMedicoDto toDto(AtendimentoMedico entity) {
        return AtendimentoMedicoDto.builder()
        .id(entity.getId())
        .pacienteId(entity.getPacienteId())
        .medicoId(entity.getMedicoId())
        .data(entity.getData())
        .observacoes(entity.getObservacoes())
        .build();
    }

    @Override
    public AtendimentoMedico toEntity(AtendimentoMedicoDto dto) {
        return AtendimentoMedico.builder()
        .id(dto.getId())
        .pacienteId(dto.getPacienteId())
        .medicoId(dto.getMedicoId())
        .data(dto.getData())
        .observacoes(dto.getObservacoes())
        .build();
    }
    
}
