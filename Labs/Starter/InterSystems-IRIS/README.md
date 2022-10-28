# Acessando o servidor IRIS através do container docker

## Pre requisitos

- [Setup ambiente de desenvolvimento](/Instructions/SETUP.md)

## Instalação

Abrir o terminal neste diretório e rodar o comando:

```
 docker-compose build
```

Se ocorrer erro no build, rode o comando:
 
```
 DOCKER_BUILDKIT=1 docker-compose build
```

Executar container IRIS com o seu projeto:

```
 docker-compose up -d
```

## Acessando o IRIS

- Terminal:

```
$ docker-compose exec iris iris session iris
```

- Portal de administração: Nesta ferramenta é possível realizar configurações do servidor, ambiente, acessar o banco de dados, realizar análises de performance, 
```
http://localhost:53773/csp/sys/%25CSP.Portal.Home.zen
    - usuario: _SYSTEM
    - senha: SYS
```

## Manutenção servidor IRIS
### Criando uma namespace
- Acesse o portal local:  http://localhost:53773/csp/sys/%25CSP.Portal.Home.zen
- Acesse Sistema > Configuração > Namespaces > Criar novo namespace
- Preencha os dados do namespace:

![namespace.png](/Instructions/images/namespace.png)


### Manutenção de usuários

No portal de administração, acesse Sistema > Administração de Segurança > Usuários para visualizar os usuários existentes e seus direitos de acesso

![irisusuarios.png](/Instructions/images/irisusuarios.png)

Ao criar um novo usuário, para facilitar copie os direitos de acesso de um usuário existente

![irisnovousuario.png](/Instructions/images/irisnovousuario.png)

Na edição do usuário é possível definir os direitos de acesso, para adicionar uma nova função ao usuário selecione na lista, e clique no botão aplicar

![irisuserroles.png](/Instructions/images/irisuserroles.png)

Para mais detalhes [Documentação Intersystem contas de usuário](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GAUTHZ_users)



## Executando comandos SQL
Pelo portal de admnistração é possível executar comandos SQL através do menu: Sistema > SQL, Selecione a namespace que deseja acessar, este editor aceita comandos SQL padrão e específicos Caché/IRIS

![irissql.png](/Instructions/images/irissql.png)

### Pontos de atenção
- Atenção para o modo da consulta, para visualizar dados como datas e campos enumerados utilize o "modo de exibição"
- Uma tabela criada a partir de uma classe com mais de um pacote por exemplo starter.entity.Pessoa, no nome tabela mantém apenas o último ponto, trocando os primeiros por underline <outrosPacotes_>starter_entity.Pessoa
- Para detalhes sobre as funções disponíveis para os comandos SQL IRI acesse a [Documentação Intersystem sobre elementos SQL](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GSQL_langelements)


## Log de erros
Caso seja necessário analisar alguma instabilidade os logs de erros ficam disponíveis no portal de admnistração em:

- Sistema  > Logs do Sistema  > Exibir Log de Erros de Aplicação
- Sistema  > Servidores de Replicação (Shadow)  > Erros de Fonte de Dados



## VsCode

### Plugins
Para acessar o servidor IRIS através do VsCode instale o plugin InterSystems [ObjectScript Extension Pack](https://marketplace.visualstudio.com/items?itemName=daimor.vscode-objectscript)

![vscodeintersystemextensionpack.png](/Instructions/images/vscodeintersystemextensionpack.png)


### Dockerfile

The simplest Dockerfile which starts IRIS and imports code from /src folder into it.
Use the related docker-compose.yml to easily setup additional parametes like port number and where you map keys and host folders.

### .vscode/settings.json

Settings file to let you immediately code in VSCode with [VSCode ObjectScript plugin](https://marketplace.visualstudio.com/items?itemName=daimor.vscode-objectscript))

### .vscode/launch.json
Config file if you want to debug with VSCode ObjectScript




# Links úteis

## SQL

- [Funções para manipulação de dados](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=RSQL_FUNCTIONS)
- [Funções de agregação](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=RSQL_AGGREGATE_FUNCTIONS)
- [Comando para retornar apenas a primeira linha do SELECT](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=RSQL_top)
- [Símbolos e operadores](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=RSQL_symbols)
- [Para acessar dados de tabelas relacionadas com menos comandos: Join implícito](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=RSQL_select#RSQL_select_item_arrow)


## Object Script

- [Definição de classes](https://docs.intersystems.com/iris20221/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_classes)
- [Tipos de dados](https://docs.intersystems.com/irislatest/csp/docbook/DocBook.UI.Page.cls?KEY=GCOS_types)
- [Formatos de datas](https://docs.intersystems.com/iris20221/csp/docbook/DocBook.UI.Page.cls?KEY=GOBJ_datatypes#GOBJ_dt_fmtstrans)
- [Classe %Persistent - propriedades e métodos](https://docs.intersystems.com/iris20221/csp/documatic/%25CSP.Documatic.cls?LIBRARY=%25SYS&CLASSNAME=%25Library.Persistent)


## Outros

- [Docker com IRIS](https://community.intersystems.com/post/dockerfile-and-friends-or-how-run-and-collaborate-objectscript-projects-intersystems-iris)
- [Fórum de dúvidas Intersystem](https://community.intersystems.com/?filter=questions)