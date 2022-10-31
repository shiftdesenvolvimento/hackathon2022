package shift.hackathon.demo.repository.converter;

import javax.enterprise.context.ApplicationScoped;

import shift.hackathon.demo.repository.dto.EnderecoDto;
import shift.hackathon.demo.repository.entity.Endereco;
import shift.hackathon.demo.repository.interfaces.Converter;

@ApplicationScoped
public class EnderecoConverter implements Converter<Endereco, EnderecoDto> {

    @Override
    public EnderecoDto toDto(Endereco entity) {
        return EnderecoDto.builder()
                .id(entity.getId())
                .logradouro(entity.getLogradouro())
                .numero(entity.getNumero())
                .complemento(entity.getComplemento())
                .bairro(entity.getBairro())
                .cep(entity.getCep())
                .siglaUF(entity.getSiglaUF())
                .build();
    }

    @Override
    public Endereco toEntity(EnderecoDto dto) {
        return Endereco.builder()
                .id(dto.getId())
                .logradouro(dto.getLogradouro())
                .numero(dto.getNumero())
                .complemento(dto.getComplemento())
                .bairro(dto.getBairro())
                .cep(dto.getCep())
                .siglaUF(dto.getSiglaUF())
                .build();
    }

}
