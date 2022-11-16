import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { take } from 'rxjs';
import { Paciente } from '../../models/paciente.model';
import { PacienteService } from '../../services/paciente.service';

@Component({
  selector: 'app-lista-pacientes',
  templateUrl: './lista-pacientes.component.html',
  styleUrls: ['./lista-pacientes.component.css']
})
export class ListaPacientesComponent implements OnInit {

  pacientes?: Paciente[];

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
      .pipe(take(1))
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

    this.currentIndex = -1;
  }

  novo(): void {
    this.router.navigate(['/novo-paciente']);
  }

}
