Class starter.entity.Paciente Extends starter.entity.Pessoa
{

Property NumeroConvenio As %VarString;

Storage Default
{
<Data name="PacienteDefaultData">
<Subscript>"Paciente"</Subscript>
<Value name="1">
<Value>NumeroConvenio</Value>
</Value>
</Data>
<DefaultData>PacienteDefaultData</DefaultData>
<Type>%Storage.Persistent</Type>
}

}
