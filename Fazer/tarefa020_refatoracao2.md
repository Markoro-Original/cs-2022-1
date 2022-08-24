# Tarefa 020 - Refatoração (2) - 17/08/2022

## Aspectos passivos de refatoração:

### Extract Superclass:

Models Autor.java, Editora.java e Genero.java, já que as três classes compartilham um atributo em comum, e caso outros models sejam criados no futuro, tem esse atributo em uma superclass facilitaria seu uso.

Models User.java e Role.java, já que ambas compartilham do atributo "id".

LoginRequest.java e SignupRequest.java, já que ambas tem os atributos "username" e "password".

### Extract Method:

Cotroller AuthController.java, já que o método ResponseEntity(), presente na classe, é muito extensa e executa diversas funções, que seriam melhor implementadas se fossem divididas em métodos próprios.

### Padronização de nomes:

Além dos métodos de refatoração citados anteriormente, acreditamos que a dronização dos nomes de métodos utilizados na API seria ideal para deixar o código um pouco mais intuitivo.
