import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Paciente } from '../models/paciente.model';

const baseUrl = "https://635d7913ea764497f0dd7a60.mockapi.io/api/v1/pacientes"

@Injectable({
  providedIn: 'root'
})
export class PacienteService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Paciente[]> {
    return this.http.get<Paciente[]>(baseUrl);
  }

  get(id: number): Observable<Paciente> {
    return this.http.get<Paciente>(`${baseUrl}/${id}`);
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  update(id: number, data: Paciente): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  delete(id: number): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

}
