import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { ListaPacientesComponent } from './components/lista-pacientes/lista-pacientes.component';
import { DetalhePacienteComponent } from './components/detalhe-paciente/detalhe-paciente.component';
import { NovoPacienteComponent } from './components/novo-paciente/novo-paciente.component';



@NgModule({
  declarations: [
    ListaPacientesComponent,
    DetalhePacienteComponent,
    NovoPacienteComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule
  ]
})
export class PacienteModule { }
