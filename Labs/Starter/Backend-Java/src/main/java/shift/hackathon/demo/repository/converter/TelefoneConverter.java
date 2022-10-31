package shift.hackathon.demo.repository.converter;

import javax.enterprise.context.ApplicationScoped;

import shift.hackathon.demo.repository.dto.TelefoneDto;
import shift.hackathon.demo.repository.entity.Telefone;
import shift.hackathon.demo.repository.interfaces.Converter;

@ApplicationScoped
public class TelefoneConverter implements Converter<Telefone, TelefoneDto>  {

    @Override
    public TelefoneDto toDto(Telefone entity) {

        return TelefoneDto.builder()
                .id(entity.getId())
                .numero(entity.getNumero())
                .build();
    }

    @Override
    public Telefone toEntity(TelefoneDto dto) {

        return Telefone.builder()
            .id(dto.getId())
            .numero(dto.getNumero())
            .build();
    }
    
}
