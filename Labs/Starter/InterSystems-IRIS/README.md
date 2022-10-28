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


## Mais detalhes

- [Servidor](docs/SERVER.md)
- [Acessando o banco de dados](docs/SERVER.md)
- [Executando comandos SQL](docs/SQL.md)
- [Logs de erros](docs/LOGS.md)
- [VsCode](docs/VSCODE.md)
- [Links úteis](docs/LINKS.md)

