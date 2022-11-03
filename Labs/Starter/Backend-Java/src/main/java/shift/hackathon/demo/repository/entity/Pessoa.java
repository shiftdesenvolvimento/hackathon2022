package shift.hackathon.demo.repository.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pessoa {
    
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Cpf")
    private String cpf;

    @Column(name = "DataNascimento")
    private LocalDate datanascimento;

    @Column(name = "Email")
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "starter_entity.PacienteEndereco",
        joinColumns = @JoinColumn(name = "PessoaId"),
        inverseJoinColumns = @JoinColumn(name = "EnderecoId")
    )
    private List<Endereco> enderecos;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "starter_entity.PessoaTelefone",
        joinColumns = @JoinColumn(name = "PessoaId"),
        inverseJoinColumns = @JoinColumn(name = "TelefoneId")
    )
    private List<Telefone> telefones;
}