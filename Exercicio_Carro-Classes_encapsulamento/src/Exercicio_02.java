/*ESCVREVA UM ÓDIGO ONDE CONTROLAMOS AS FUNÇÕES DE UM CARRO, DELE DEVER TER AS SEGUINTES FUNÇÕES:
    LIGAR O CARRO
    DESLIGAR O CARRO
    ACELERAR
    DIMINUIR VELOCIDADE
    CIRAR PARA ESQUERDA/DIREITA
    VERIFICAR VELOCIDADE
    TROCAR DE MARCHA

REGRAS DE NEGÓCIO:
    QUANDO O ACRRO FOR CRIADO ELE DEVE COMEÇAR DESLIGADO, EM PONTO MORTO COM A VELOCIDADE DE 0KM
    O CARRO DESLIGADO NÃO PODE REALIZAR NENHUMA FUNÇÃO
    QUANDO O CARRO FOR ACELERADO ELE DEVE INCREMENTAR 1KM EN SUA VELOCIDADE(PODE CHEGAR NO MAXIMO A 120KM)
    QUANDO DIMINUIR A VELOCIDADE DO CARRO ELE DEVE DECREMENTAR 1KM DE SUA VELOCIDADE(PODE CHEGAR NO MINIMO A 0KM)
    O CARRO DEVE POSSSUIR 6 MARCHAS, NÃO DEVE SER PERMITIDO PULAR A MARCHA NO CARRO
    A VELOCIDADE DO CARRO DEVE RESPEITAR OS SEGUINTES LIMITES PARA CADA VELOCIDADE
        SE O CARRO ESTIVER NA MARCHA 0(PONTO MORTO) ELE NÃO PODE ACELERAR
        SE ESTIVER NA 1° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 0KM E 20KM
        SE ESTIVER NA 2° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 21KM E 40KM
        SE ESTIVER NA 3° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 41KM E 60KM
        SE ESTIVER NA 4° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 61KM E 80KM
        SE ESTIVER NA 5° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 81KM E 100KM
        SE ESTIVER NA 1° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 101KM E 120KM
   O CARRO PODERÁ SER DESLIGADO SE ESTIVER EM PONTO MORTO(MARCHA 0) E SUA VELOCIDADE DE 0KM
   O CARRO SO PODE CIRAR PARA A ESQUERDA/DIREITA SE SUA VELOCIDADE FOR DE NO MINIMO 1 E NO MAXIMO 40KM
 */


import java.util.Scanner;

public class Exercicio_02 {
    private final static Scanner sc = new Scanner(System.in);
    private final static Carro carro = new Carro();

    public static void main(String[] args) {

        var opcao = -1;
      do {

          System.out.println("Escolha Sua Opção");
          System.out.println("1- Ligar Carro");
          System.out.println("2- Desligar");
          System.out.println("3- Acelerar");
          System.out.println("4- Miminuir Velovidade");
          System.out.println("5- Virar para Esquerda");
          System.out.println("6- Virar para Direita");
          System.out.println("7- Verificar Velocidade");//IMPLEMENTAR AQUI
          System.out.println("8- Trocar a Marcha");
          System.out.println("0 - Sair");
          opcao = sc.nextInt();

          switch (opcao) {
              case 1 ->carro.ligarCarro();
              case 2 ->desligarCarro();
              case 3 -> acelerar();
              case 4 -> carro.reduzirVelocidade();
              case 5-> virarEsquerda();
              case 6 -> virarDireita();
              case 8 -> carro.passarMarcha();
          }

           
      }while (true);

    }

    private static void virarDireita() {
        carro.virarDireita();
    }

    private static void virarEsquerda() {
        carro.virarEsquerda();
    }

    private static void acelerar() {
        carro.acelerarCarro();
    }
    private static void desligarCarro() {
        carro.desligarCarro();
    }

}


