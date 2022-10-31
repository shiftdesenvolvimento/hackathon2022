package shift.hackathon.demo.repository.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@Entity(name = "starter_entity.Medico")
public class Medico extends Pessoa {

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "ConselhoProfissional", referencedColumnName = "Id", nullable = false)
    private ConselhoProfissional conselhoProfissional;

}
