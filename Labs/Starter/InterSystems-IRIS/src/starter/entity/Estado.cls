Class starter.entity.Estado Extends %Persistent
{

Property Sigla As %VarString [ Required ];

Property Nome As %VarString [ Required ];

Index IdxSigla On Sigla [ PrimaryKey ];

Storage Default
{
<Data name="EstadoDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>Sigla</Value>
</Value>
<Value name="3">
<Value>Nome</Value>
</Value>
</Data>
<DataLocation>^starter.entity.EstadoD</DataLocation>
<DefaultData>EstadoDefaultData</DefaultData>
<IdLocation>^starter.entity.EstadoD</IdLocation>
<IndexLocation>^starter.entity.EstadoI</IndexLocation>
<StreamLocation>^starter.entity.EstadoS</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
