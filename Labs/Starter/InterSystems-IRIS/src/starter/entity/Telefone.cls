Class starter.entity.Telefone Extends %Persistent
{

Property Id As %Integer [ Required ];

Property Numero As %VarString [ Required ];

Index Id On Id [ PrimaryKey ];

Storage Default
{
<Data name="TelefoneDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>Id</Value>
</Value>
<Value name="3">
<Value>Numero</Value>
</Value>
</Data>
<DataLocation>^starter.entity.TelefoneD</DataLocation>
<DefaultData>TelefoneDefaultData</DefaultData>
<IdLocation>^starter.entity.TelefoneD</IdLocation>
<IndexLocation>^starter.entity.TelefoneI</IndexLocation>
<StreamLocation>^starter.entity.TelefoneS</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
