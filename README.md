# Desafio módulo 3 - Spring: CRUD de clientes

Criar um projeto Spring Boot contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

* Busca paginada de recursos
* Busca de recurso por id
* Inserir novo recurso
* Atualizar recurso
* Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):

![Image 1](src/main/resources/image/image1.jpg)

**Seu projeto deverá fazer um seed de pelo menos 10 clientes** com dados SIGNIFICATIVOS (não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.).

**Seu projeto deverá tratar as seguintes exceções:**\	
* Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.	
* Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As regras de validação são:
	- Nome: não pode ser vazio
	- Data de nascimento: não pode ser data futura (dica: use @PastOrPresent)

_**Atenção:** Lembre-se de que por padrão a JPA transforma nomes de atributos em camelCase para snake_case. Assim, **o campo birthDate acima será criado no banco de dados como birth_date, então seu script SQL deverá seguir este padrão.**_

_**Atenção:**_ Não salvar no seu projeto arquivos e pastas que não devem ser salvas no Git, tais como a pasta .metadata do Eclipse ou .idea do Intellij.

## Fazendo o teste do projeto
**1)Importação do projeto**\
Deve ser feito um simples clone do projeto Github, e importar e executar o mesmo na IDE sem necessidade de qualquer configuração especial

**2) Testes manuais no Postman**\
[Postman Online](https://www.postman.com/) \
Através do uso do Postman serão executadas as requisições abaixo. Todas elas deverão funcionar corretamente:

![Image 2](src/main/resources/image/image2.png)\
![Image 3](src/main/resources/image/image3.png)\
![Image 4](src/main/resources/image/image4.png)\
![Image 5](src/main/resources/image/image5.png)\
![Image 6](src/main/resources/image/image6.png)

**CHECKLIST:**
1. Busca por id retorna cliente existente
2. Busca por id retorna 404 para cliente inexistente
3. Busca paginada retorna listagem paginada corretamente
4. Inserção de cliente insere cliente com dados válidos
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
6. Atualização de cliente atualiza cliente com dados válidos
7. Atualização de cliente retorna 404 para cliente inexistente
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
9. Deleção de cliente deleta cliente existente
10. Deleção de cliente retorna 404 para cliente inexistente