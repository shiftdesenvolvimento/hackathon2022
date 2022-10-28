# Executando comandos SQL
Pelo portal de admnistração é possível executar comandos SQL através do menu: Sistema > SQL, Selecione a namespace que deseja acessar, este editor aceita comandos SQL padrão e específicos Caché/IRIS

![irissql.png](docs/img/irissql.png)

## Pontos de atenção
- Atenção para o modo da consulta, para visualizar dados como datas e campos enumerados utilize o "modo de exibição"
- Uma tabela criada a partir de uma classe com mais de um pacote por exemplo starter.entity.Pessoa, no nome tabela mantém apenas o último ponto, trocando os primeiros por underline <outrosPacotes_>starter_entity.Pessoa
- Para detalhes sobre as funções disponíveis para os comandos SQL IRI acesse a [Documentação Intersystem sobre elementos SQL](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GSQL_langelements)

