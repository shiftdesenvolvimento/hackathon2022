import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/components/home/home.component';
import { DetalhePacienteComponent } from './paciente/components/detalhe-paciente/detalhe-paciente.component';
import { ListaPacientesComponent } from './paciente/components/lista-pacientes/lista-pacientes.component';
import { NovoPacienteComponent } from './paciente/components/novo-paciente/novo-paciente.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'pacientes', component: ListaPacientesComponent },
  { path: 'pacientes/:id', component: DetalhePacienteComponent },
  { path: 'novo-paciente', component: NovoPacienteComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
