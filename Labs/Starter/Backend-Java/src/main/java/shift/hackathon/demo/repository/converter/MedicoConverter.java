package shift.hackathon.demo.repository.converter;


import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import shift.hackathon.demo.repository.dto.MedicoDto;
import shift.hackathon.demo.repository.entity.Medico;
import shift.hackathon.demo.repository.interfaces.Converter;

@ApplicationScoped
public class MedicoConverter implements Converter<Medico, MedicoDto>  {

    @Inject
    EnderecoConverter enderecoConverter;

    @Inject
    TelefoneConverter telefoneConverter;

    @Override
    public MedicoDto toDto(Medico entity) {
        
        return MedicoDto.builder()
            .id(entity.getId())
            .nome(entity.getNome())
            .cpf(entity.getCpf())
            .datanascimento(entity.getDatanascimento())
            .email(entity.getEmail())
            .conselhoProfissional(null)
            .enderecos(entity.getEnderecos().stream().map(enderecoConverter::toDto).collect(Collectors.toList()))
            .telefones(entity.getTelefones().stream().map(telefoneConverter::toDto).collect(Collectors.toList()))
            .build();
    }

    @Override
    public Medico toEntity(MedicoDto dto) {
        return Medico.builder()
            .id(dto.getId())
            .nome(dto.getNome())
            .cpf(dto.getCpf())
            .datanascimento(dto.getDatanascimento())
            .email(dto.getEmail())
            .conselhoProfissional(null)
            .enderecos(dto.getEnderecos().stream().map(enderecoConverter::toEntity).collect(Collectors.toList()))
            .telefones(dto.getTelefones().stream().map(telefoneConverter::toEntity).collect(Collectors.toList()))
            .build();
    }
    
}
