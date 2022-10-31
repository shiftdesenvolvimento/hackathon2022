package shift.hackathon.demo.repository.converter;

import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import shift.hackathon.demo.repository.dto.PacienteDto;
import shift.hackathon.demo.repository.entity.Paciente;
import shift.hackathon.demo.repository.interfaces.Converter;

@ApplicationScoped
public class PacienteConverter implements Converter<Paciente, PacienteDto>  {


    @Inject
    EnderecoConverter enderecoConverter;

    @Inject
    TelefoneConverter telefoneConverter;

    @Override
    public PacienteDto toDto(Paciente entity) {
        
        return PacienteDto.builder()
            .id(entity.getId())
            .nome(entity.getNome())
            .cpf(entity.getCpf())
            .datanascimento(entity.getDatanascimento())
            .email(entity.getEmail())
            .numeroConvenio(entity.getNumeroConvenio())
            .enderecos(entity.getEnderecos().stream().map(enderecoConverter::toDto).collect(Collectors.toList()))
            .telefones(entity.getTelefones().stream().map(telefoneConverter::toDto).collect(Collectors.toList()))
            .build();
    }

    @Override
    public Paciente toEntity(PacienteDto dto) {
        return Paciente.builder()
            .id(dto.getId())
            .nome(dto.getNome())
            .cpf(dto.getCpf())
            .datanascimento(dto.getDatanascimento())
            .email(dto.getEmail())
            .numeroConvenio(dto.getNumeroConvenio())
            .enderecos(dto.getEnderecos().stream().map(enderecoConverter::toEntity).collect(Collectors.toList()))
            .telefones(dto.getTelefones().stream().map(telefoneConverter::toEntity).collect(Collectors.toList()))
            .build();
    }

   
}
