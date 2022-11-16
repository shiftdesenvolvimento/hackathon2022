import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Paciente } from '../../models/paciente.model';
import { PacienteService } from '../../services/paciente.service';

@Component({
  selector: 'app-paciente-form',
  templateUrl: './paciente-form.component.html',
  styleUrls: ['./paciente-form.component.css']
})
export class PacienteFormComponent implements OnInit {
  @Input() paciente!: Paciente | undefined;
  @Output() save: EventEmitter<Paciente> = new EventEmitter<Paciente>();
  submitted = false;

  pacienteForm!: FormGroup;

  telefone!: FormArray;
  constructor(
    private pacienteService: PacienteService,
    private route: ActivatedRoute,
    private router: Router,
    private fb: FormBuilder) {

  }

  ngOnInit(): void {
    // TODO document why this method 'ngOnInit' is empty
    this.createForm(this.paciente);

  }

  savePaciente(): void {
    if (!this.pacienteForm.valid) return;

    this.save.emit(this.pacienteForm.value);

  }

  newPaciente(): void {
    this.submitted = false;
    this.createForm();
    this.paciente = undefined;
  }

  voltar(): void {
    this.router.navigate(['/pacientes']);
  }

  createForm(paciente?: Paciente): void {
    console.log(this.paciente)
    this.pacienteForm = this.fb.group({
      id: [],
      nome: [this.paciente?.nome, [Validators.required]],
      cpf: [this.paciente?.cpf, [Validators.required]],
      dataNascimento: [this.getDateValue(this.paciente?.dataNascimento), [Validators.required]],
      email: [this.paciente?.email, [Validators.required, Validators.email]],
      telefone: this.fb.array((this.paciente?.telefone?.map((telefone) => this.novoTelefoneControl(telefone)) as FormControl[]) || [''])
    });
    this.telefone = this.pacienteForm?.get('telefone') as FormArray;
  }

  removerTelefone(index: number): void {
    this.telefone.removeAt(index);
  }

  adicionarTelefone(): void {
    if (!this.telefone.valid) return;
    this.telefone.push(this.novoTelefoneControl(''));
  }

  hasError(controlName: string): boolean {
    return !!(this.pacienteForm.get(controlName)?.invalid && (this.pacienteForm.get(controlName)?.touched || !!this.pacienteForm.get(controlName)?.dirty))
  }
  phoneHasError(index: number): boolean {
    return !!(this.telefone.at(index)?.invalid && (this.telefone.at(index)?.touched || !!this.telefone.at(index)?.dirty))
  }
  private novoTelefoneControl(telefone: string): FormControl {
    return this.fb.control(telefone, [Validators.required])
  }
  private getDateValue(dateString?: string): string | null {
    return dateString ? new Date(dateString).toISOString().split('T')[0] : null
  }
}
