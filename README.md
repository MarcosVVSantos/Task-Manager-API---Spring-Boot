Task Manager API - Spring Boot
🚀 API RESTful para Gerenciamento de Tarefas

Este projeto é uma API REST desenvolvida em Spring Boot para gerenciar tasks (tarefas), permitindo operações básicas de CRUD (Create, Read, Update, Delete) com validações e estrutura organizada.

🔧 Funcionalidades
✔ Criar, editar, listar e excluir tarefas
✔ Filtrar tasks por status (Pendente, Em andamento, Concluída)
✔ Validação de dados e tratamento de erros
✔ Arquitetura RESTful com endpoints bem definidos

🛠 Tecnologias
Java 17+

Spring Boot 3.x

Spring Data JPA (Banco de dados H2/PostgreSQL)

Maven (Gerenciamento de dependências)

Lombok (Redução de boilerplate code)

Postman/Insomnia (Testes da API)

📌 Endpoints Principais
Método	Rota	Descrição
POST	/api/tasks	Criar uma nova task
GET	/api/tasks	Listar todas as tasks
GET	/api/tasks/{id}	Buscar task por ID
PUT	/api/tasks/{id}	Atualizar uma task existente
DELETE	/api/tasks/{id}	Excluir uma task
🚀 Como Executar
Clone o repositório:

bash
Copy
git clone https://github.com/seu-usuario/task-manager-api.git  
Configure o banco de dados (application.properties)

Execute o projeto:

bash
Copy
mvn spring-boot:run  
Acesse a API em: http://localhost:8080/api/tasks



📄 Licença
MIT License

💡 Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar PRs.
