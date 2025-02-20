# MEDICO, PACIENTE, CONSULTAS 

=> O nosso sistema receberá dados de médicos e pacientes. Um médico atende a um paciente por vez. O paciente pode ter várias consultas com diferentes médicos.

1. O nosso sistema é de gestão de médicos para uma clínica. Ele permite o cadastro e gerenciamento de médicos, armazenando suas informações como:

- Nome;
- Email;
- CRM;
- Especialidade; 
- Endereço (Logradouro, bairro, cep, cidade, uf, número e complemento).

2. Funcionalidades:

- Cadastro de médico;
- Listagem de médicos cadastrados;
- Atualização de dados do médico;
- Remoção de médicos.

# Atividade

- Construir um pacote chamado endereço dentro de model e criar uma classe Endereco com os atributos listados abaixo. Além disso, crie os getters, setters, construtor com todos os parâmetros e construtor sem parâmetro. 
(Logradouro, bairro, cep, cidade, uf, numero, complemento)
* Coloque todos os atributos como privados e do tipo String.


# Aula 2 
Verbos/ métodos HTTP 
GET -> É quando você pede algo de retorno.
POST -> É quando você passa informações.
PUT
DELETE

Resquest [REQUISIÇÃO] -> É o que você passa esperando o retorno
Response [RESPOSTA] -> É a resposta que você recebe.

# Aula 3
DTO -> Padrão de projetos onde isolamos cada item que está sendo enviado pelo simulador de requisição. (DATA TRANSFER OBJECT, Objeto de transferência de dados.)
- Criação de uma classe chamada DadoCadastroMedico, onde iremos receber os dados do json e converter em dados autônomos.

API -> É um conjunto de ações e regras para a comunicação entre diferentes ferramentas. Define como os sistemas devem interagir. Normalmente uma API oferece dados para serem consumidos pelo frontend.

POLIMORFISMO -> É quando um método se comporta de maneira diferente dependendo da forma que é invocada. Significa muitas formas.
- Sobrecarga de método [OVERLOADING] - Tempo de compilação.
- Sobrescrita de método [OVERRING] - Tempo de execução.

ABSTRAÇÃO -> É quando uma classe/ método não pode ser instânciada (clonada). [Abstract]

## ANOTATIONS - ANOTAÇÕES
1. Anotações do Spring Web 

@RequestMapping("/medicos")
=> Define que a classe está mapeada para a url[endpoint]/medicos.

@RestController 
=> Define que a classe é uma classe controladora no Spring.

@GetMapping 
=> Define que o método será somente leitura.

@PostMapping
=> Define que o método irá receber dados.

@PutMapping
=> Atualiza alguma informação.

@DeleteMapping  
=> Deleta dados.

@RequestBody
=> É utilizada quando você irá receber dados pelo simulador de requisição (insomnia), e informa que os dados serão enviados no corpo da requisição.

2. Anotações do lombok
@Getter 
=> Cria todos os Getters para todos os atributos da classe. 

@Setter
=> Cria todos os Setters para todos os atributos da classe.

@AllArgsConstructor 
=> Cria um método construtor com todos os atributos

@NoArgsConstructor
=> Cria um método construtor com nenhum dos atributos

3. Anotações do Spring JPA
@Entity 
=> É uma anotação que você irá utilizar para informar ao Springboot que a classe anotada será uma tabela no banco de dados.

@Table 
=> É uma anotação que você irá utilizar para criar no Banco de dados uma tabela com o nome da classe anotada.
* Você pode alterar o padrão do nome da tabela utilizando: @Table(name = "nometabela").

@Id 
=> Define que o atributo será uma chave primária a tabela. 

@GeneratedValue
=> Define que a criação do ID será de forma automática.

@Enumerated 
=> Informa que aquele atributo é uma classe enum.


