/*ESCREVA UM CÓDIGO ONDE TEMOS UMA CONTA BANCARIA QUE POSSA REALIZAR AS SEGUITTES OPEAÇÕES:
    * CONSULTAR SALDO
    * CONSULTAR CHEQUE ESPECIAL
    * DEPOSITAR DINHEIRO
    * SACAR DINHEIRO
    * PAGAR BOLETO
    * VERIFICAR SE A CONTA ESTA USANDO CHEQUE ESPECIAL

* *REGRAS DE NEGÓCIO:
* A CONTA BANCARIA DEVE TER UM LIMITE DE CHUEQUE ESPECIAL SOMADO A SANDO DA CONTA
* O VALOR DO CHQUE ESPECIAL É DEFINIDO NO MOMENTO DA CRIAÇÃO DA CONTA, DE ACORDO COM O VALOR DEPOSITADO NA CONTA EM SUA CRIAÇÃO
* SE O VALOR D EPOSITADONA CRIAÇÃO DA CONTA FOR DE R$500,00 OU MENOS O CHEUE ESPECIAL DEVE SER DE R$ 50,00
* PARA VALORES ACIMA DE R$500,00 O CHQUE ESPECIAL DESER DE 50% DO VALOR DEPOSITADO
* CASO O LIMITE DE CHUEQUE ESPECIAL SEJA USADO, ASSIM QUE POSSIVEL A CONTA DEVE COBRAR UM TAXA DE 20% DO VALOR USADO DO CHEQUE. */

import java.util.Scanner;

public class Exercicio_01 {
    private static  Scanner scanner = new Scanner(System.in);
    private static Conta conta ;

    public static void main(String[] args) {
        conta = new Conta(10);
        var opcao = -1;
        do {
            System.out.println("Digite a Opção Desejada");
            System.out.println("1 - Consultar Saldo ");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar Uso de Cheque Especial");
            System.out.println("0 - Sair" );
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> verifySaldo();
                case 2 -> verifyChequeEspecial();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> pagarBoleto();
                case 6 -> UsoDeCheque();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }

        }while (true);

    }
    //CRIAR METODOS

    private static void verifySaldo() {
        double saldo = conta.getSaldo();
        System.out.println( "Saldo da Conta R$ "+ saldo);

    }
    private static void verifyChequeEspecial() {
        double valorCheque = conta.getLimiteChequeEspecial();
        System.out.println("Valor do Cheque Especial R$ " + valorCheque);
    }
    private static void depositar() {
        double valorDeposito = conta.depositar(20);
        System.out.println("Depósito de "+valorDeposito +" Realizado com Sucesso");
    }
    private static void sacar() {
        double valorSaque = conta.sacar(5);
        System.out.println("Saque de R$ "+ valorSaque + "Realizado com Sucesso");
    }
    public static void pagarBoleto() {
        double valorBoleto = conta.pagarBoleto(1);
        System.out.println("Pagamento do Boleto no valor R$ "+ valorBoleto+" Realizado com Sucesso");
    }
    private static void UsoDeCheque() {
        conta.seUsaCheuqe();
    }

}
