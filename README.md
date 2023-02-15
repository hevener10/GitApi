## 💻  Tecnologias

Para executar esse projeto, será necessário as tecnologias:

- [SpringBoot](https://spring.io/projects/spring-boot) v2.5.4
- [PostgreSQL](https://www.postgresql.org/download/)
- [Maven](https://maven.apache.org/download.cgi)
- [Java 11](https://www.java.com/pt-BR/download/help/index_installing.html)
- [Postman](https://www.postman.com/)

## 💻 Projeto

### Primeira execução

1. Antes de executar a aplicação pela primeira vez você deve criar os seguintes esquemas no banco de dados: `git`

### Executar a aplicação local

1. Para executar a aplicação, após instalar e configurar o java e o maven, junto com suas variáveis ambiente, executar o comando no diretório da aplicação:

```bash
> mvn clean package spring-boot:repackage
```

2. Gere os repositorios:

```bash
> mvn generate-sources
```

3. Faça a compilação do projeto:

```bash
> mvn compile
```

4. Execute o projeto:

```bash
> mvn spring-boot:run
```

Com isso, o projeto já estará disponível escultando o local:

http://localhost:8080/git

### Teste Postman

Poderá utilizar para realizar consultas utilizando [Postman](src/test/resources/GIT.postman_collection.json)
e também suas environments