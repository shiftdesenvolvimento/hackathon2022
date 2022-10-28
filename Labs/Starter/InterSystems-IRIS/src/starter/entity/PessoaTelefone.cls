Class starter.entity.PessoaTelefone Extends %Persistent
{

Property PessoaId As starter.entity.Pessoa [ Required ];

Property TelefoneId As starter.entity.Telefone [ Required ];

Property Principal As %Boolean [ InitialExpression = 0, Required ];

ForeignKey PessoaFK(PessoaId) References starter.entity.Pessoa(Id);

ForeignKey TelefoneFK(TelefoneId) References starter.entity.Telefone(Id);

Index PessoaTelefoneId On (PessoaId, TelefoneId) [ PrimaryKey ];

Storage Default
{
<Data name="PessoaTelefoneDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>PessoaId</Value>
</Value>
<Value name="3">
<Value>TelefoneId</Value>
</Value>
<Value name="4">
<Value>Principal</Value>
</Value>
</Data>
<DataLocation>^starter.entity.PessoaTelefoneD</DataLocation>
<DefaultData>PessoaTelefoneDefaultData</DefaultData>
<IdLocation>^starter.entity.PessoaTelefoneD</IdLocation>
<IndexLocation>^starter.entity.PessoaTelefoneI</IndexLocation>
<StreamLocation>^starter.entity.PessoaTelefoneS</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
