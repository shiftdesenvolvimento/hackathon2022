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

### Adicionando o bootstrap

Para adicionar o Bootstrap na sua aplicação você precisará executar os seguintes comandos:
``` bash
cd minha-aplicacao
npm install bootstrap --save
npm install jquery --save
npm install popper.js --save
```

Após a instalação será necessário abrir o VSCode e editar o arquivo src/style.css adicionando a seguinte linha:

``` css
@import "~bootstrap/dist/css/bootstrap.css";
```

Por último, será necessário editar o arquivo angular.json incluindo as seguintes instruções:

``` json
....
      "styles": [
        "node_modules/bootstrap/dist/css/bootstrap.min.css",
        "src/styles.css"
      ],
      "scripts": [
          "node_modules/jquery/dist/jquery.min.js",
          "node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"
      ]
.....
```

## Executando a aplicação

Após criada a aplicação, você pode executá-la com o seguinte comando: `ng serve --open`. Esse comando já vai abrir o navegador no endereço `http://localhost:4200/`


## Codificando

Após criada a aplicação é hora de começar a codar.

Você pode usar o angular CLI para criar componentes, classes e interfaces.

A baixo seguem alguns comandos para criar partes importantes da aplicação:

Para essa implementação, vamos estruturar a aplicação em módulos. o primeiro é o módulo de paciente e, por isso haverá o prefixo paciente.

### Criando classes e componentes

Vamos criar interfaces de modelos para mapear os dados das APIs

``` bash
ng g i paciente/models/nome-da-classe --type=model
```

Em seguida, criamos um modulo
``` bash
ng g m paciente
```

Depois criamos a service
``` bash
ng g s paciente/services/nome-da-service
```

E, por fim, criamos os componentes
``` bash
ng g c paciente/components/nome-do-componente
```
 a partir daí é só atualizar os arquivos `src/app/app.module.ts` e `src/app/paciente/paciente.module.ts`

### Configurando a aplicação
Para que uma aplicação que utilize formulários funcione é preciso importar os módulos nas classes de Modulos. Dentre esses pacotes, três são muito importantes: 

``` typescript
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http'
```
Observe os arquivos `.module` para verificar o uso desses pacotes.

## Documentação adicional

Consulte documentação do angular em https://angular.io/

Consulte documentação do bootstrap em: https://getbootstrap.com/

Para o Mock das APIs foi utilizada a ferramenta https://mockapi.io/