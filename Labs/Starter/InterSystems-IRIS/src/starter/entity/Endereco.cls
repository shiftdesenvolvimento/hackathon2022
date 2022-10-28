Class starter.entity.Endereco Extends %Persistent
{

Property Id As %Integer [ Identity, Required ];

Property Logradouro As %VarString [ Required ];

Property Numero As %VarString [ Required ];

Property Complemento As %VarString [ Required ];

Property Bairro As %VarString [ Required ];

Property Cep As %VarString [ Required ];

Property SiglaUF As starter.entity.Estado [ Required ];

Index Id On Id [ PrimaryKey ];

ForeignKey SiglaUFFK(SiglaUF) References starter.entity.Estado(IdxSigla);

Storage Default
{
<Data name="EnderecoDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>Logradouro</Value>
</Value>
<Value name="3">
<Value>Numero</Value>
</Value>
<Value name="4">
<Value>Complemento</Value>
</Value>
<Value name="5">
<Value>Bairro</Value>
</Value>
<Value name="6">
<Value>Cep</Value>
</Value>
<Value name="7">
<Value>SiglaUF</Value>
</Value>
</Data>
<DataLocation>^starter.entity.EnderecoD</DataLocation>
<DefaultData>EnderecoDefaultData</DefaultData>
<IdLocation>^starter.entity.EnderecoD</IdLocation>
<IndexLocation>^starter.entity.EnderecoI</IndexLocation>
<StreamLocation>^starter.entity.EnderecoS</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
