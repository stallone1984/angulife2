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

public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Heitor";
		funcionario.idade = 29;
		funcionario.salario = 1000;
		funcionario.sexo = 'M';
		funcionario.casado = false;
		System.out.println(
				"O funcionário " + funcionario.nome + 
				" do sexo " + (funcionario.sexo == 'M' ? "Masculino" : "Feminino") + 
				" com idade " + funcionario.idade + " anos, " +
				"possui um salário de R$ " + funcionario.salario + " reais");
		imprimirCasado(funcionario.casado);
		calcularImposto(funcionario.salario, funcionario.idade);
	}
	
	public static void imprimirCasado(boolean casado){
		String resultado = casado ? "Casado" : "Solteiro";
		System.out.println("O funcionario é " + resultado);
	}
	
	public static void calcularImposto(double salario, int idade){
		double impostoCalculado = idade < 30 ? salario * 0.15 : 
			idade < 50 ? salario * 0.1 : salario * 0.05;
		System.out.println("Salario: " + salario + 
				" Idade: " + idade + 
				" Imposto Calculado: " + impostoCalculado);
	}





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
