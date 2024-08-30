# Sistema de Gerenciamento de Conta Bancária
Este projeto é um simples sistema de gerenciamento de conta bancária em Java. Ele permite consultar o saldo, transferir e receber valores, e sair do programa. O sistema é interativo e utiliza o console para entrada e saída de dados.

## Índice
- Descrição do Projeto
- Funcionalidades
- Como Executar
- Estrutura do Código
- Tecnologias Utilizadas

## Descrição do Projeto
- O sistema simula operações básicas de um banco para uma conta corrente. O usuário pode:
- Consultar o saldo atual da conta.
- Transferir valores para outro destinatário, se o saldo for suficiente.
- Receber valores na conta.
- Sair do programa.


## Funcionalidades
- Consultar Saldo: Exibe o saldo atual da conta.
- Transferir Valor: Permite transferir um valor para outro destinatário, verificando se o saldo é suficiente.
- Receber Valor: Permite adicionar um valor ao saldo da conta.
- Sair: Encerra o programa.


## Como Executar
1. Clone o Repositório: Clone este repositório para sua máquina local.
2. Compile o Código: Use um compilador Java para compilar o arquivo Desafio.java. Por exemplo:
```java
javac Desafio.java
```
3. Execute o Programa: Execute o programa compilado usando o comando:
```java
java Desafio
```
4. Interaja com o Programa: Siga as instruções no console para consultar o saldo, transferir ou receber valores, ou sair do programa.


## Estrutura do Código


```
java
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Variáveis da conta
        String nome = "Ana Clara";
        String conta = "Corrente";
        double saldo = 1550.55;

        // Exibição inicial
        System.out.println("**********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n**********************");

        // Menu de opções
        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4 ) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser transferido: ");
                double valorTransferencia = leitura.nextDouble();

                if (valorTransferencia > 0 && valorTransferencia <= saldo) {
                    System.out.println("Digite o destinatário da transferência: ");
                    String destinatario = leitura.next();

                    saldo -= valorTransferencia;
                    System.out.println("Transferência de R$" + valorTransferencia + " para " + destinatario + " realizada com sucesso.");
                } else {
                    System.out.println("Valor inválido ou insuficiente para a transferência. Tente novamente.");
                }
            } else if (opcao == 3) {
                System.out.println("Digite a quantidade a ser creditada na conta: ");
                double recebeTranferencia = leitura.nextDouble();

                saldo += recebeTranferencia;
                System.out.println("Valor de " + recebeTranferencia + " recebido na conta da " + nome + ". O saldo atual é de " + saldo);
            } else if (opcao == 4) {
                System.out.println("Saindo do programa. Até mais!");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
```


Tecnologias Utilizadas
- Java: Linguagem de programação usada para implementar o sistema.
- Scanner: Classe Java para entrada de dados via console.
- Esse README fornece uma visão geral clara do projeto, instruções sobre como executá-lo e detalhes sobre a estrutura do código e as funcionalidades implementadas.
