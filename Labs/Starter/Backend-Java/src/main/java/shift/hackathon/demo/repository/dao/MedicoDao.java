package shift.hackathon.demo.repository.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;

import java.util.List;
import java.util.stream.Collectors;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import shift.hackathon.demo.repository.converter.MedicoConverter;
import shift.hackathon.demo.repository.dto.MedicoDto;
import shift.hackathon.demo.repository.entity.Medico;

@ApplicationScoped
public class MedicoDao implements PanacheRepositoryBase<Medico, Long> {
    
    @Inject
    MedicoConverter medicoConverter;

    public MedicoDto salvar(MedicoDto medicoDto) {
        var medico = medicoConverter.toEntity(medicoDto);
        persist(medico);

        return medicoConverter.toDto(medico);
    }

    public boolean deletar(Long id) {
        return deleteById(id);
    }

    public MedicoDto getById(Long id) {
        var medico = findById(id);
        if (medico == null){
            throw new NotFoundException();
        }
        
        return medicoConverter.toDto(medico);
    }

    public List<MedicoDto> list(String name) {
        var lista = list("nome", name);
        
        return lista.stream().map(medicoConverter::toDto).collect(Collectors.toList());
    }

    public List<MedicoDto> list() {
        var lista = listAll();

        return lista.stream().map(medicoConverter::toDto).collect(Collectors.toList());
    }

}
