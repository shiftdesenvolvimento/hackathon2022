# Aplicação Front-end Angular

## Definições

Angular é um framework usado para criar Single Page Applications (SPA). Uma SPA é uma aplicação cujas funcionalidades estão concentradas em uma única página que é modificada dinâmicamente ao longo da interação do usuário e o conteúdo é atualizado de forma assíncrona.


## Instalação

Para criar e executar uma aplicação angular é necessário primeiro fazer o download do node.js. Recomenda-se o uso da versão 16.13.1, disponível para download em https://nodejs.org/download/release/v16.13.1/

Também é necessário a IDE VSCode (disponível em: https://code.visualstudio.com/)

Após o nodejs e o VSCode instalados, basta fazer a instação do Angular CLI no terminal. Comando para instalar o Angular CLI: 
``` bash 
npm install -g @angular/cli
``` 

### Nota
Em máquina com o sistema operacional windows é necessário habilitar a execução de scripts do PowerShell. Para isso é necessário executar o seguinte comando no terminal: 
``` bash
Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned
```


## Criando uma nova aplicação Angular

Após todos os requisitos de instalação terem sido atendidos, o proxímo passo é criar uma aplicação angular. para isso, no terminal. execute o comando `ng new` e forneça o nome da sua aplicação. Exemplo
``` bash
ng new minha-aplicacao
```

## Executando a aplicação

Após criada a aplicação, você pode executá-la com o seguinte comando: `ng serve --open`. Esse comando já vai abrir o navegador no endereço `http://localhost:4200/`

