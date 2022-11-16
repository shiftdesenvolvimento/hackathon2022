import { Component, OnInit, Input } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { take } from 'rxjs';
import { Paciente } from '../../models/paciente.model';
import { PacienteService } from '../../services/paciente.service';

@Component({
  selector: 'app-novo-paciente',
  templateUrl: './novo-paciente.component.html',
  styleUrls: ['./novo-paciente.component.css']
})
export class NovoPacienteComponent {

  submitted = false;

  constructor(
    private pacienteService: PacienteService,
    private route: ActivatedRoute,
    private router: Router,
    private fb: FormBuilder) { }



  savePaciente(paciente: Paciente): void {
    this.pacienteService.create(paciente)
      .pipe(
        take(1)
      )
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
  }

  voltar(): void {
    this.router.navigate(['/pacientes']);
  }

  createForm(paciente?: Paciente): FormGroup {
    return this.fb.group({
      nome: ['', [Validators.required]],
      cpf: ['', [Validators.required]],
      dataNascimento: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      phones: this.fb.array(paciente?.telefone || [''])
    });
  }

}


