## Projeto Demonstração
No diretório `Labs/Starter` foi disponibilizado o projeto base com implementação de um CRUD utlizando a stack:
- [Angular](../Labs/Starter/Frontend-Angular/docs/Instrucoes.md)
- [Java](../Labs/Starter/Backend-Java/README.md)
- [IRIS](../Labs/Starter/InterSystems-IRIS/README.md)

```mermaid
sequenceDiagram
    participant Frontend_Angular
    participant Backend_Java
    Frontend_Angular->>Backend_Java: Request
    Backend_Java->>IRIS_Docker: Query
    IRIS_Docker-->>Backend_Java: Result
    Backend_Java-->>Frontend_Angular: Response
```