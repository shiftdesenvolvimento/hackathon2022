package shift.hackathon.demo.repository.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class PessoaDto {

    private Long id;

    @NotNull
    @Size(min = 3, max = 50, message = "nome inválido")
    private String nome;

    @NotNull
    private String cpf;

    private LocalDate datanascimento;

    @Email(message = "Email é inválido")
    private String email;

    private List<EnderecoDto> enderecos;

    private List<TelefoneDto> telefones;
}