package shift.hackathon.demo.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import shift.hackathon.demo.repository.dao.MedicoDao;
import shift.hackathon.demo.repository.dto.MedicoDto;

@ApplicationScoped
public class MedicoService {

    @Inject
    MedicoDao dao;

    @Transactional
    public MedicoDto salvar(MedicoDto medicoDto) {
        return dao.salvar(medicoDto);
    }
    
    @Transactional
    public boolean deletar(Long id) {
        return dao.deletar(id);
    }

    public MedicoDto getById(Long id) {
        return dao.getById(id);
    }

    public List<MedicoDto> list(String nome) {
        return dao.list(nome);
    }

    public List<MedicoDto> list() {
        return dao.list();
    }
}
