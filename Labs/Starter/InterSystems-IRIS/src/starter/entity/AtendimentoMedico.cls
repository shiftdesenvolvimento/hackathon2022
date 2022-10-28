Class starter.entity.AtendimentoMedico Extends %Persistent
{

Property Id As %Integer [ Identity, Required ];

Property PacienteId As starter.entity.Paciente [ Required ];

Property MedicoId As starter.entity.Medico [ Required ];

Property Data As %Date [ Required ];

Property Hora As %Time [ Required ];

Property Observacoes As %VarString;

Property Principal As %Boolean [ InitialExpression = 0, Required ];

ForeignKey PacienteFK(PacienteId) References starter.entity.Paciente(Id);

ForeignKey MedicoFK(MedicoId) References starter.entity.Medico(Id);

Index Id On Id [ PrimaryKey ];

Storage Default
{
<Data name="AtendimentoMedicoDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>PacienteId</Value>
</Value>
<Value name="3">
<Value>MedicoId</Value>
</Value>
<Value name="4">
<Value>Data</Value>
</Value>
<Value name="5">
<Value>Hora</Value>
</Value>
<Value name="6">
<Value>Observacoes</Value>
</Value>
<Value name="7">
<Value>Principal</Value>
</Value>
</Data>
<DataLocation>^starter.en5C4E.AtendimentoCBD1D</DataLocation>
<DefaultData>AtendimentoMedicoDefaultData</DefaultData>
<IdLocation>^starter.en5C4E.AtendimentoCBD1D</IdLocation>
<IndexLocation>^starter.en5C4E.AtendimentoCBD1I</IndexLocation>
<StreamLocation>^starter.en5C4E.AtendimentoCBD1S</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
