package shift.hackathon.demo.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "starter_entity.Endereco")
public class Endereco {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = " Logradouro")
    private String logradouro;

    @Column(name = " Numero")
    private String numero;

    @Column(name = " Complemento")
    private String complemento;

    @Column(name = " Bairro")
    private String bairro;

    @Column(name = " Cep")
    private String cep;

    @Column(name = " SiglaUF")
    private String siglaUF;

}
