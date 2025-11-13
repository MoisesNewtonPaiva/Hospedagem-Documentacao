📝 Documentação e Hospedagem de API
📘 Descrição do Projeto

Este projeto consiste em uma API RESTful desenvolvida em Java utilizando o Spring Boot.
O objetivo principal é implementar operações CRUD (Create, Read, Update, Delete) em duas entidades relacionadas:

Documento

Categoria

A persistência de dados é feita com o Spring Data JPA, e a documentação é integrada via Swagger/OpenAPI, permitindo testar e explorar os endpoints através de uma interface web interativa.

🌐 Publicação e Links

A aplicação está hospedada na nuvem utilizando o serviço Render, configurada com uma imagem Docker.

Recurso	Link	Observação
Repositório GitHub https://github.com/MoisesNewtonPaiva/Hospedagem-Documentacao.git	Código-fonte completo do projeto.
Aplicação Hospedada (Render)	https://hospedagem-documentacao.onrender.com

Documentação Swagger/OpenAPI	https://hospedagem-documentacao.onrender.com/swagger-ui.html	Interface interativa da API.
📖 Documentação Swagger

A documentação da API foi configurada utilizando o SpringDoc OpenAPI (Swagger).
Ela gera uma interface interativa baseada nas classes @RestController do projeto.

🔍 Como Acessar e Usar

Acesse o link da documentação Swagger acima.

A interface exibirá os grupos de endpoints (ex: /api/categorias e /api/documentos).

Clique em qualquer endpoint (ex: POST /api/categorias) para expandi-lo.

Clique em "Try it out" e preencha o Request Body em formato JSON.

Clique em "Execute" para enviar a requisição e visualizar o resultado e o status HTTP.

⚙️ Passos para Execução Local
🧩 Pré-requisitos

Java Development Kit (JDK) 17 ou superior

Apache Maven 3.6+ ou Gradle

IDE (IntelliJ IDEA, VS Code ou Eclipse)

🚀 Execução
1. Clone o Repositório
git clone https://github.com/MoisesNewtonPaiva/Hospedagem-Documentacao.git

2. Configuração do Banco de Dados

O projeto utiliza o H2 Database por padrão para testes locais.
Se desejar utilizar outro banco, ajuste o arquivo application.properties.

3. Execute via IDE ou Linha de Comando

Via Maven:

mvn spring-boot:run

🌍 Acesso Local

API: http://localhost:8080

Swagger: http://localhost:8080/swagger-ui.html

🧱 Tecnologias Utilizadas

Java 17

Spring Boot

Spring Data JPA

H2 Database

Swagger / SpringDoc OpenAPI

Docker

Render

✉️ Autor

Seu Nome
📧 E-mail: ribeiromoises166@gmail.com
]
💻 GitHub: https://github.com/MoisesNewtonPaiva
