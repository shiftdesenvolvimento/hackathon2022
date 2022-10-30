import { Component, OnInit } from '@angular/core';
import { Paciente } from '../../models/paciente.model';
import { PacienteService } from '../../services/paciente.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-detalhe-paciente',
  templateUrl: './detalhe-paciente.component.html',
  styleUrls: ['./detalhe-paciente.component.css']
})
export class DetalhePacienteComponent implements OnInit {

  currentPaciente: Paciente = {
    id: 0,
    nome: '',
    cpf: '',
    dataNascimento: '',
    email: ''
  };

  message = '';

  constructor(
    private pacienteService: PacienteService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.message = '';
    this.getPaciente(this.route.snapshot.params["id"]);
  }

  getPaciente(id: number): void {
    this.pacienteService.get(id)
      .subscribe({
        next: (data) => {
          this.currentPaciente = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

  updatePaciente(): void {
    this.message = '';

    this.pacienteService.update(this.currentPaciente.id, this.currentPaciente)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.message = res.message ? res.message : 'Paciente atualizado com sucesso!';
        },
        error: (e) => console.error(e)
      });
  }

  deletePaciente(): void {
    this.pacienteService.delete(this.currentPaciente.id)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.router.navigate(['/pacientes']);
        },
        error: (e) => console.error(e)
      });
  }

  voltar(): void {
    this.router.navigate(['/pacientes']);
  }

}