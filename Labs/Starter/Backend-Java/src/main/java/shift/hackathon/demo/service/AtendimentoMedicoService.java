package shift.hackathon.demo.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import shift.hackathon.demo.repository.dao.AtendimentoMedicoDao;
import shift.hackathon.demo.repository.dto.AtendimentoMedicoDto;
import shift.hackathon.demo.repository.dto.MedicoDto;
import shift.hackathon.demo.repository.dto.PacienteDto;

@ApplicationScoped
public class AtendimentoMedicoService {

    @Inject
    AtendimentoMedicoDao dao;

    @Inject
    MedicoService medicoService;

    @Inject
    PacienteService pacienteService;
    
    @Transactional
    public AtendimentoMedicoDto salvar(AtendimentoMedicoDto atendimentoMedicoDto){

        // var medico = medicoService.getById(atendimentoMedicoDto.getMedicoId());
        // var paciente = medicoService.getById(atendimentoMedicoDto.getPacienteId());

        return dao.salvar(atendimentoMedicoDto);
    }

    public List<AtendimentoMedicoDto> consultar(MedicoDto medicoId, PacienteDto pacienteId) {
        return dao.consultar(medicoId.getId(), pacienteId.getId());
    }

    public AtendimentoMedicoDto consultar(Long id) {
        return dao.consultar(id);
    }
}
