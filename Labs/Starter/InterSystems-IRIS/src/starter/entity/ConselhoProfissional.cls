Class starter.entity.ConselhoProfissional Extends %Persistent
{

Property Id As %Integer [ Identity, Required ];

Property Sigla As %VarString [ Required ];

Property Numero As %VarString;

Property Estado As starter.entity.Estado [ Required ];

Index Id On Id [ PrimaryKey ];

ForeignKey EstadoFK(Estado) References starter.entity.Estado(IdxSigla);

Storage Default
{
<Data name="ConselhoProfissionalDefaultData">
<Value name="1">
<Value>%%CLASSNAME</Value>
</Value>
<Value name="2">
<Value>Sigla</Value>
</Value>
<Value name="3">
<Value>Numero</Value>
</Value>
<Value name="4">
<Value>Estado</Value>
</Value>
</Data>
<DataLocation>^starter.en5C4E.ConselhoProfis6D</DataLocation>
<DefaultData>ConselhoProfissionalDefaultData</DefaultData>
<IdLocation>^starter.en5C4E.ConselhoProfis6D</IdLocation>
<IndexLocation>^starter.en5C4E.ConselhoProfis6I</IndexLocation>
<StreamLocation>^starter.en5C4E.ConselhoProfis6S</StreamLocation>
<Type>%Storage.Persistent</Type>
}

}
