Class starter.entity.Pessoa Extends %Persistent
{

Property Id As %Integer [ Identity, Required ];

Property Nome As %VarString [ Required ];

Property Cpf As %VarString;

Property DataNascimento As %Date;

Property Email As %VarString;

Index Id On Id [ PrimaryKey ];

Storage Default
{
<Data name="PessoaDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>Nome</Value>
</Value>
<Value name="3">
<Value>Cpf</Value>
</Value>
<Value name="4">
<Value>DataNascimento</Value>
</Value>
<Value name="5">
<Value>Email</Value>
</Value>
</Data>
<DataLocation>^starter.entity.PessoaD</DataLocation>
<DefaultData>PessoaDefaultData</DefaultData>
<IdLocation>^starter.entity.PessoaD</IdLocation>
<IndexLocation>^starter.entity.PessoaI</IndexLocation>
<StreamLocation>^starter.entity.PessoaS</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
