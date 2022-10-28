Class starter.entity.Medico Extends starter.entity.Pessoa
{

Property ConselhoProfissional As starter.entity.ConselhoProfissional [ Required ];

ForeignKey ConselhoProfissionalFK(ConselhoProfissional) References starter.entity.ConselhoProfissional(Id);

Storage Default
{
<Data name="MedicoDefaultData">
<Subscript>"Medico"</Subscript>
<Value name="1">
<Value>ConselhoProfissional</Value>
</Value>
</Data>
<DefaultData>MedicoDefaultData</DefaultData>
<Type>%Storage.Persistent</Type>
}

}
