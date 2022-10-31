package shift.hackathon.demo.repository.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Entity(name = "starter_entity.Paciente")
public class Paciente extends Pessoa {


    @Column(name = "NumeroConvenio")
    private String numeroConvenio;

}
