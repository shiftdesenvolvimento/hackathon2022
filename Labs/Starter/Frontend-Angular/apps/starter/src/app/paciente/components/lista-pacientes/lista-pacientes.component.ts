import { Component, OnInit } from '@angular/core';
import { Paciente } from '../../models/paciente.model';
import { PacienteService } from '../../services/paciente.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-lista-pacientes',
  templateUrl: './lista-pacientes.component.html',
  styleUrls: ['./lista-pacientes.component.css']
})
export class ListaPacientesComponent implements OnInit {

  pacientes?: Paciente[];
  currentPaciente: Paciente = {
    id: 0,
    nome: '',
    cpf: '',
    dataNascimento: '',
    email: ''
  };
  currentIndex = -1;
  title = '';

  constructor(
    private pacienteService: PacienteService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.retrievePacientes();
  }

  retrievePacientes(): void {
    this.pacienteService.getAll()
      .subscribe({
        next: (data) => {
          this.pacientes = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

  refreshList(): void {
    this.retrievePacientes();
    this.currentPaciente = {
      id: 0,
      nome: '',
      cpf: '',
      dataNascimento: '',
      email: ''
    };
    this.currentIndex = -1;
  }

  novo(): void {
    this.router.navigate(['/novo-paciente']);
  }

}
