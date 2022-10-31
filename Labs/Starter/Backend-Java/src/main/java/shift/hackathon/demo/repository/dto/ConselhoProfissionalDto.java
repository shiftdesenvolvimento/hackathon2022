package shift.hackathon.demo.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConselhoProfissionalDto {

    private Long id;

    private String sigla;

    private String numero;

    private String estado;
}
