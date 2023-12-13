import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Ana Clara";
        String conta = "Corrente";
        double saldo = 1550.55;

        System.out.println("**********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n**********************");

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
                double recebeTranferencia = leitura.nextInt();

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
