## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).






 Utilizar uma estrutura de dados para armazenar na memória as notas dos alunos e calcular a média e desvio padrão por meio de métodos estáticos de outra classe.

Cálculo da média e desvio padrão das notas de alunos
Para essa tarefa, crie um projeto de aplicação Java utilizando como classe principal (com 
método main) o código abaixo (pode copiar o código na classe e fazer as alterações 
necessárias):
package <SEU PACOTE AQUI>;
import java.security.SecureRandom;
public class Exercicio {
private final static int MAX_ALUNOS = 50;
//Atribua um valor de -127 a 127
private final static byte[] SEED = {<-127>, <127>}; 
public static void main(String[] args) {
SecureRandom randNum = new SecureRandom(SEED);
double notaRand;
int numAlunos = randNum.nextInt(MAX_ALUNOS);
//Utilize uma estrutura para adicionar as notas
for(int i = 0; i < numAlunos; i++) {
notaRand = randNum.nextFloat()*100;
//Adicione as notas na estrutura
}
//Você deve criar uma classe Estatistica em um arquivo separado
//Não crie a classe nesse arquivo. Siga a convenção e crie um arquivo
//com o nome da classe e coloque o código da classe pública nele.
//A classe deve ter 2 métodos estáticos. Um para média e 
//outro para desvio padrão
System.out.println("Qtd Alunos: " + numAlunos);
//Se a estrutura com as notas chamar “notas” segue um exemplo para imprimir 
//os resultados
System.out.println("Média das notas: " + Estatistica.media(notas));
System.out.println("Desvio Padrão das notas: " + Estatistica.desvioPadrao(notas));
}
}

Depois de criado o projeto e a classe com o método main, você deverá:

1 - Criar o pacote das classes
2 - Atribuir dois valores distintos entre -127 a 127 para o atributo SEED na parte das chaves 
(private final static byte[] SEED = {<-127>,<127>};)). Isso irá fixar os valores que serão 
gerados pela instância da classe randômica.
3 - Utilizar uma estrutura de dados para armazenar as notas geradas pela instância da classe 
randômica. 
4 - Criar uma classe chamada Estatistica, com ao menos dois métodos estáticos. Um calcula 
a média das notas e o outro o desvio padrão. Eles devem receber a estrutura utilizada para 
armazenar as notas.
A média pode ser calculada por:
𝑥𝑥̅= ∑ 𝑥𝑥𝑖𝑖
𝑁𝑁
𝑖𝑖=1
𝑁𝑁
Onde N é a quantidade de valores e 𝑥𝑥𝑖𝑖 os valores individuais. 
Já o desvio padrão da população pode ser calculado por:
𝜎𝜎 = �∑ (𝑥𝑥𝑖𝑖 − 𝑥𝑥) 𝑁𝑁 ���2
𝑖𝑖=1
𝑁𝑁
Onde N é a quantidade de valores, 𝑥𝑥𝑖𝑖 os valores de cada nota e 𝑥𝑥̅é a média. 

𝑥𝑥̅= 
∑ 𝑥𝑥𝑖𝑖
𝑁𝑁
𝑖𝑖=1
�