package shift.hackathon.demo.repository.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AtendimentoMedicoDto {

    private Long id;

    private Long pacienteId;

    private Long medicoId;

    private LocalDate data;

    private String observacoes;
}
