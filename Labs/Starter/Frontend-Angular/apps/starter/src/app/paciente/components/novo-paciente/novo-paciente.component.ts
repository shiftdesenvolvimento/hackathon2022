import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Paciente } from '../../models/paciente.model';
import { PacienteService } from '../../services/paciente.service';

@Component({
  selector: 'app-novo-paciente',
  templateUrl: './novo-paciente.component.html',
  styleUrls: ['./novo-paciente.component.css']
})
export class NovoPacienteComponent implements OnInit {

  paciente: Paciente = {
    nome: '',
    cpf: '',
    dataNascimento: '',
    email: '',
    id: 0
  };
  submitted = false;

  constructor(
    private pacienteService: PacienteService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    // TODO document why this method 'ngOnInit' is empty

  }

  savePaciente(): void {
    const data = {
      nome: this.paciente.nome,
      cpf: this.paciente.cpf,
      dataNascimento: this.paciente.dataNascimento,
      email: this.paciente.email
    };

    this.pacienteService.create(data)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.submitted = true;
        },
        error: (e) => console.error(e)
      });
  }

  newPaciente(): void {
    this.submitted = false;
    this.paciente = {
      nome: '',
      cpf: '',
      dataNascimento: '',
      email: '',
      id: 0
    };
  }

  voltar(): void {
    this.router.navigate(['/pacientes']);
  }

}
