/*
* /*ESCVREVA UM ÓDIGO ONDE CONTROLAMOS AS FUNÇÕES DE UM CARRO, DELE DEVER TER AS SEGUINTES FUNÇÕES:
    LIGAR O CARRO
    DESLIGAR O CARRO
    ACELERAR
    DIMINUIR VELOCIDADE
    CIRAR PARA ESQUERDA/DIREITA
    VERIFICAR VELOCIDADE
    TROCAR DE MARCHA

REGRAS DE NEGÓCIO:
    ***  QUANDO O CARRO FOR CRIADO ELE DEVE COMEÇAR DESLIGADO, EM PONTO MORTO COM A VELOCIDADE DE 0KM
    O CARRO DESLIGADO NÃO PODE REALIZAR NENHUMA FUNÇÃO
    ***  QUANDO O CARRO FOR ACELERADO ELE DEVE INCREMENTAR 1KM EM SUA VELOCIDADE(PODE CHEGAR NO MAXIMO A 120KM)
    QUANDO DIMINUIR A VELOCIDADE DO CARRO ELE DEVE DECREMENTAR 1KM DE SUA VELOCIDADE(PODE CHEGAR NO MINIMO A 0KM)


    *** O CARRO DEVE POSSSUIR 6 MARCHAS, NÃO DEVE SER PERMITIDO PULAR A MARCHA NO CARRO

    A VELOCIDADE DO CARRO DEVE RESPEITAR OS SEGUINTES LIMITES PARA CADA VELOCIDADE
        SE O CARRO ESTIVER NA MARCHA 0(PONTO MORTO) ELE NÃO PODE ACELERAR
        SE ESTIVER NA 1° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 0KM E 20KM
        SE ESTIVER NA 2° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 21KM E 40KM
        SE ESTIVER NA 3° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 41KM E 60KM
        SE ESTIVER NA 4° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 61KM E 80KM
        SE ESTIVER NA 5° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 81KM E 100KM
        SE ESTIVER NA 6° MARCHA SUA VELOCIDADE PODE ESTAR ENTRE 101KM E 120KM
   *** O CARRO PODERÁ SER DESLIGADO SE ESTIVER EM PONTO MORTO(MARCHA 0) E SUA VELOCIDADE DE 0KM
   *** O CARRO SO PODE VIRAR PARA A ESQUERDA/DIREITA SE SUA VELOCIDADE FOR DE NO MINIMO 1 E NO MAXIMO 40KM

*/

public class Carro {
    private  boolean ligado;
    private int marcha;
    private double velocidade;
    private String direcao = "reta";
//CRAIR CARRO
    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }
//LIGAR O CARRO
    public void ligarCarro() {
        ligado = true;
    }
//SABER SE O CARRO TA LIGADO
    public boolean isLigado() {
        return ligado;
    }
 //PEGAR VELOCIDADE DO CARRO
    public double getVelocidade() {
        return velocidade;
    }
//PEGAR MARCHA
    public int getMarcha() {
        return marcha;
    }

//PASSAR MARCHA
    public void passarMarcha(){
        if(this.ligado == true && this.marcha >= 0 && this.marcha<=6){
            marcha++;
        }else {
            System.out.println("Não pode Passar Marcha");
        }
    }
//DESLIGAR O CARRO
    public void desligarCarro() {
        if(ligado== true && marcha == 0 && velocidade == 0){
           this.ligado = false;
            System.out.println("O Carro foi desligado");
        }else {
            System.out.println("O Não pode Ser desligado"+ this.ligado+ " "+ this.marcha + " "+ this.velocidade);
        }
    }
//ACELERAR
    //SE O CARRO ESTIVER NA MARCHA 0(PONTO MORTO) ELE NÃO PODE ACELERAR
    //QUANDO O CARRO FOR ACELERADO ELE DEVE INCREMENTAR 1KM EM SUA VELOCIDADE(PODE CHEGAR NO MAXIMO A 120KM)
  public void acelerarCarro(){
        if(this.ligado == true && this.marcha > 0 && this.velocidade <=120) {
                velocidade = velocidade + 1;
        }else
            System.out.println("Carro Não pode acelerar");
    }
//FREIAR
    public void reduzirVelocidade(){
        if(this.ligado == true && this.velocidade > 0){
             velocidade = velocidade - 1;
        }else
            System.out.println("Carro "+ this.ligado + " Velocidade "+this.velocidade+ " Não pode Reduzir Velocidade");
    }
//VIRAR ESQUERDA
    public void virarEsquerda(){
        if(this.ligado == false || (this.velocidade > 1 && this.velocidade <= 40)) {
            this.direcao = "Esquerda";
        }else{
            System.out.println("Não pode Mudar direção para a Esquerda");

        }
    }
//VIRAR DIREITA
    public void virarDireita(){
        if(this.ligado == false || (this.velocidade > 1 && this.velocidade <= 40)) {
            this.direcao = "Direita";
        }else{
            System.out.println("Não pode Mudar direção para a Direita");

        }
    }
}
