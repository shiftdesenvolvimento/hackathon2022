import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalhePacienteComponent } from './detalhe-paciente.component';

describe('DetalhePacienteComponent', () => {
  let component: DetalhePacienteComponent;
  let fixture: ComponentFixture<DetalhePacienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalhePacienteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetalhePacienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
