Criar uma classe chamada Funcionario
Criar os seguintes atributos (variáveis):
- Nome
- Idade
- Salario
- Sexo
- Casado

Criar uma classe TesteFuncionario
Declarar o método main.
Criar uma instância da classe formulário
Configurar os valores para os atributos do objeto criado
Imprimir no console as seguintes informações:
"O funcionário XXX do sexo XXX com idade XXX possui um salário de R$ XXX reais"

Criar um método que imprime se o funcionário é casado. Esse método deverá receber um parâmetro 
do tipo boolean (atributo de funcionario) e imprimir na tela:
"O funcionpario é casado/solteiro" usando o operador ternário.

Criar um método que imprima o imposto pago por um funcionário:
Este método deverá receber um valor double salario e um valor int idade.
Se a idade for menor que 30, o imposto será 15% do salário. Se a idade estiver entre 30 e 50 anos (inclusive),
o imposto será 10% do salário e se a idade for maior do que 50 o imposto será 5% do salário.
A mensagem com o imposto deverá ser exibida da seguinte forma:
"Salário: xxxx, Idade: xxxx, Imposto calculado: xxxx"


Exercício Aula 3 - 02/09/2014

Criar uma classe Paciente
Criar os atributos nome, idade, altura, peso, sexo
Criar o método calcularImc ->  (peso / (altura * altura)
Criar o método verificarImc seguindo as seguintes regras:

Sexo Feminino:
   Idade <= 30 
   imc < 20 -> Abaixo do peso
   imc >= 20 <= 25 -> Peso Normal
   imc > 25 -> Acima do peso
   
   Idade > 30 
   imc < 18 -> Abaixo do peso
   imc >= 18 <= 23 -> Peso Normal
   imc > 23 -> Acima do peso
   
Sexo Masculino:
   Idade <= 35 
   imc < 22 -> Abaixo do peso
   imc >= 22 <= 26 -> Peso Normal
   imc > 26 -> Acima do peso
   
   Idade > 35 
   imc < 20 -> Abaixo do peso
   imc >= 20 <= 24 -> Peso Normal
   imc > 24 -> Acima do peso
   
-> Executar os seguintes testes:

Pessoa do sexo feminino com 28 anos, altura 1.6 e peso 65 -> Acima do peso
Pessoa do sexo masculino com 28 anos, altura 1.6 e peso 65 -> Peso normal
Pessoa do sexo feminino com 35 anos, altura 1.65 e peso 65 -> Acima do peso
Pessoa do sexo masculino com 40 anos, altura 1.7 e peso 70 -> Acima do peso

-> Criar uma classe chamada Exercicios:

-> Criar um método que imprima a soma dos valores pares a partir de zero enquanto a soma for menor que 60.

-> Criar um método que imprima os valores entre 0 e 100 que sejam múltiplos de 3 e de 5 (ao mesmo tempo).


-> Exercícios adicionados em 04/09/2014

- Criar uma classe Calculadora

- Criar um método subtrai que recebe dois parâmetros do tipo int, guarda o resultado da diferença entre os dois valores em uma variável local, imprime uma mensagem com a diferença entre os dois valores ("O resultado de A - B é C") e não retorna nenhum valor;
  
- Criar um método dividir que recebe dois parâmetros do tipo double e verifica se o valor do 
  primeiro parâmetro é maior que o segundo. Se o valor do primeiro parâmetro não for maior que o segundo,
  o método deverá retornar uma String com uma mensagem de erro. Se o primeiro parâmetro for maior,
  o método deverá realizar a divisão e retornar uma String com uma mensagem com o valor da divisão.
  ("A divisão de A por B é C")
  
- Criar um método somar que recebe uma quantidade indeterminada de valores, soma estes valores e retorna o valor da soma (usar varargs como argumento e usar o foreach para percorrer e somar os valores)

- Criar uma classe TesteCalculadora para testar os métodos


***** Execício conta bancária *****

1. Criar uma classe Cliente com os atributos:
- String nome; 
- Date dataNascimento;
- String cpf;

- Encapsular os atributos

2. Criar uma classe Conta com os atributos:
- String numero;             
- int mesValidade;           
- int anoValidade;           
- double saldo;              
- double limite;             
- Cliente cliente;           

- Encapsular os atributos

3. Criar um método depositar() que recebe como parâmetro um valor do tipo double
- Se o valor for menor ou igual a zero, imprimir uma mensagem de erro
- Caso contrário imprimir uma mensagem informando que o o depósito foi realizado e mostrar
o novo saldo na mensagem

4. Criar um método sacar() que recebe como parâmetro um valor do tipo double
- Se o valor for menor ou igual a zero, imprimir uma mensagem de erro
- Se o saldo menos o valor a ser sacado for menor que zero, verificar se o saldo menos o valor é menor que o limite, se for, realizar o saque mas exibir uma mensagem de alerta informando que o saque foi realizado mas que o usuário entrou no limite. Exibir o saldo na mensagem. Caso o saldo menos o valor seja maior que o limite, exibir uma mensagem de erro que contenha o nome do cliente da conta ("Olá Sr(a). {nome_do_cliente_da_conta}. Não foi possível....")
- Se o saldo menos o valor for maior que zero, realizar o saque e exibir uma mensagem de sucesso exibindo o novo saldo

5. Criar um método transferir que recebe como parâmetro a conta destino e o valor a ser transferido
- Se o valor informado for menor que zero, imprimir uma mensagem de erro
- Se a conta destino for igual à conta de origem, exibir uma mensagem de erro
- Utilizar os métodos sacar e depositar para realizar a transferência (saca da conta origeme deposita na conta destino)
- Fazer algum tipo de verificação em que se não for possível fazer o saque (saldo insuficiente por exemplo) o depósito também não seja feito.
- No caso de transferência realizada com sucesso, a mensagem deverá conter o nome do cliente e o saldo das contas origem e destino 

6. Criar uma classe TesteConta com um método main
- Criar um cliente e informar um nome para o mesmo
- Criar uma conta. Setar o cliente criado como o cliente da conta
- Informar um saldo e um limite para a conta
- Testar o método depositar
- Testar o método sacar em um caso em que o saldo continue positivo, um caso em que o saldo fique negativo mas dentro do limite e um caso em que estoure o limite.

- Criar um novo cliente e setar um nome a ele
- Criar uma nova conta e setar este cliente a ela
- Informar um saldo para esta nova conta

- Testar o método transferir usando a nova conta criada como conta destino

07/10
-> EXERCÍCIO COM EXCEPTIONS

-> Criar uma exceção unchecked (estendendo de RuntimeException) chamada ValorInvalidoException.
-> Criar o construtor que recebe uma mensagem do tipo String e chama o construtor da superclasse passando a mensagem

-> Criar uma exceção checked (estendendo de Exception) chamada SaldoInsuficienteException.
-> Criar o construtor que recebe uma mensagem do tipo String e chama o construtor da superclasse passando a mensagem

-> No método sacar(), colocar a verificação de número maior que zero dentro de um bloco try
-> Se o valor não for maior do que zero, lançar uma exceção ValorInvalidoException com a mensagem apropriada.
-> Criar um bloco catch que capture a exceção do bloco try anterior e inprima a mensagem de erro no console e retorne o valor false;

-> No método sacar(), caso o saldo seja insuficiente para o saque, lançar uma exceção SaldoInsuficienteException com uma mensagem de erro.
-> Na declaração do método sacar, informar que o método pode lançar uma exceção SaldoInsuficienteException (declaração throws)
-> Colocar a chamada ao método sacar dentro de um bloco try. 
-> Criar um bloco catch que capture a exceção lançada no bloco try com a chamada ao método sacar.
-> Imprimir a pilha de chamadas de métodos no console

-> EXERCÍCIO COM ASSERTIVAS

-> Criar um enum TipoConta com os tipo CONTA_CORRENTE  e CONTA_POUPANCA
-> Criar a classe conta (vazia mesmo_
-> Criar as classes ContaCorrente e ContaPoupanca (também vazias), que irão estender de conta
-> Criar uma classe Banco com um método criarConta() que irá receber como parâmetro um tipo de conta (TipoConta) e retornar uma Conta
-> O método criarConta irá criar uma conta (Poupanca ou Corrente) de acordo com o tipo passado e retornar essa conta.
-> Uma assertiva deverá ser usada para garantir que a conta não seja nula e deverá imprimir a mensagem 'A conta não foi criada' caso a conta seja nula

-> Criar a classe TesteBanco que fará uso do método criarConta
  

