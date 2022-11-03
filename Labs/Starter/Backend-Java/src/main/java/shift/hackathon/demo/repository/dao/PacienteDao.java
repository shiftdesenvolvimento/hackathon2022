package shift.hackathon.demo.repository.dao;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import shift.hackathon.demo.repository.converter.PacienteConverter;
import shift.hackathon.demo.repository.dto.PacienteDto;
import shift.hackathon.demo.repository.entity.Paciente;

@ApplicationScoped
public class PacienteDao implements PanacheRepositoryBase<Paciente, Long> {

    @Inject
    PacienteConverter pacienteConverter;
    
    public PacienteDto salvar(PacienteDto pacienteDto) {
        var paciente = pacienteConverter.toEntity(pacienteDto);
        
        persist(paciente);

        return pacienteConverter.toDto(paciente);
    }

    public boolean deletar(Long id) {
        return deleteById(id);
    }

    public PacienteDto getById(Long id) {
        var paciente = findById(id);
        if (paciente == null) {
            throw new NotFoundException();
        }
        
        return pacienteConverter.toDto(paciente);
    }

    public List<PacienteDto> list(String name) {
        var lista = list("nome", name);
        
        return lista.stream().map(pacienteConverter::toDto).collect(Collectors.toList());
    }

    public List<PacienteDto> list() {
        var lista = listAll();

        return lista.stream().map(pacienteConverter::toDto).collect(Collectors.toList());
    }
}
