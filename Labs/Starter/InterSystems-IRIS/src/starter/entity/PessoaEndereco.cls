Class starter.entity.PacienteEndereco Extends %Persistent
{

Property PessoaId As starter.entity.Pessoa [ Required ];

Property EnderecoId As starter.entity.Endereco [ Required ];

Property Principal As %Boolean [ InitialExpression = 0, Required ];

ForeignKey PessoaFK(PessoaId) References starter.entity.Pessoa(Id);

ForeignKey EnderecoFK(EnderecoId) References starter.entity.Endereco(Id);

Index PessoaEnderecoId On (PessoaId, EnderecoId) [ PrimaryKey ];

Storage Default
{
<Data name="PacienteEnderecoDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>PessoaId</Value>
</Value>
<Value name="3">
<Value>EnderecoId</Value>
</Value>
<Value name="4">
<Value>Principal</Value>
</Value>
</Data>
<DataLocation>^starter.en5C4E.PacienteEnd899CD</DataLocation>
<DefaultData>PacienteEnderecoDefaultData</DefaultData>
<IdLocation>^starter.en5C4E.PacienteEnd899CD</IdLocation>
<IndexLocation>^starter.en5C4E.PacienteEnd899CI</IndexLocation>
<StreamLocation>^starter.en5C4E.PacienteEnd899CS</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
