# Microservice Form (Java)

Serviço microserviço em Java responsável por gerenciar formulários (ex: envio de dados via endpoints REST).

## 📝 Sumário

- [Descrição](#descrição)
- [Tecnologias](#tecnologias)
- [Pré-requisitos](#pré-requisitos)
- [Instalação & Execução](#instalação--execução)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Endpoints](#endpoints)
- [Boas práticas](#boas-práticas)
- [Contribuição](#contribuição)
- [Licença](#licença)

---

## Descrição

Este microserviço oferece endpoints REST para gerenciar formulários. Pode ser integrado em arquiteturas de microsserviços ou usado de forma isolada para captura e armazenamento de dados estruturados pelos usuários.

## Tecnologias

- Java 17+ (ou versão compatível)
- Spring Boot / Spring Web
- Maven (ou Gradle, se preferir)
- Banco de dados: H2 (dev) ou PostgreSQL/MySQL (produção)

> **Dica**: personalize conforme os arquivos `pom.xml`, `build.gradle` e as configurações em `application.yml`.

---

## Pré-requisitos

- JDK instalado (versão 17+)
- Git
- Maven (ou Gradle)
- Variáveis de ambiente (exemplos abaixo)

### Exemplo de variáveis

```bash
export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/formdb
export SPRING_DATASOURCE_USERNAME=postgres
export SPRING_DATASOURCE_PASSWORD=secret
export SERVER_PORT=8081
```

---

## Instalação & Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/Acaiaca-Agricultores/microservice.form.java.git
   cd microservice.form.java
   ```

2. Build (com Maven):

   ```bash
   mvn clean install
   ```

   ou com Gradle:

   ```bash
   ./gradlew build
   ```

3. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

   ou:

   ```bash
   java -jar target/microservice-form.jar
   ```

4. Acesse `http://localhost:8081/health` para checar se está rodando.

---

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/acaiaca/form/
│   │   ├── controller/     ← endpoints REST
│   │   ├── model/          ← entidades JPA ou DTOs
│   │   ├── repository/     ← interfaces Spring Data
│   │   ├── service/        ← lógica de negócio
│   │   └── Application.java ← classe principal Spring Boot
│   └── resources/
│       ├── application.yml
│       └── db/ (scripts SQL)
└── test/                  ← testes unitários/integrados
```

---

## Endpoints

| Método   | Endpoint      | Descrição                        | Request Body                |
| -------- | ------------- | -------------------------------- | --------------------------- |
| `GET`    | `/forms`      | Lista todos os formulários       | —                           |
| `GET`    | `/forms/{id}` | Busca formulário por ID          | —                           |
| `POST`   | `/forms`      | Cria novo formulário             | JSON com dados              |
| `PUT`    | `/forms/{id}` | Atualiza um formulário existente | JSON com campos atualizados |
| `DELETE` | `/forms/{id}` | Remove formulário por ID         | —                           |

> 📌 Adapte os caminhos, validadores e retorno conforme implementação real do projeto.

---

## Boas práticas

- Use `@Valid` e `BindingResult` nos controllers para validação.
- Mantenha camada de serviço separada de persistência.
- Escreva testes unitários com JUnit 5 e Mockito (ou SpringBootTest).
- Use profiles Spring (`dev`, `prod`) para diferenciar configurações.
- Considere adicionar Swagger/OpenAPI para documentar a API.

---

## Contribuição

Contribuições são bem-vindas! 😊

1. Faça um fork do projeto
2. Crie uma nova branch: `feature/nova-funcionalidade`
3. Faça commits com mensagens claras
4. Abra um pull request explicando as mudanças

---

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE) (ou especifique tal como `Apache 2.0`, `GPLv3`, etc — ajuste conforme necessário).

