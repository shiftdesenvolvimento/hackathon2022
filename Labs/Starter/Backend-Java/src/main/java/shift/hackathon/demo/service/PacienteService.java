package shift.hackathon.demo.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import shift.hackathon.demo.repository.dao.PacienteDao;
import shift.hackathon.demo.repository.dto.PacienteDto;

@ApplicationScoped
public class PacienteService {

    @Inject
    PacienteDao dao;
    
    @Transactional
    public PacienteDto salvar(PacienteDto pacienteDto) {
        return dao.salvar(pacienteDto);
    }

    @Transactional
    public boolean deletar(Long id) {
        return dao.deletar(id);
    }

    public PacienteDto getById(Long id) {
        return dao.getById(id);
    }

    public List<PacienteDto> list(String name) {
        return dao.list(name);
    }

    public List<PacienteDto> list() {
        return dao.list();
    }
}
