
public class Conta {
    private double saldo;
    private double limiteChequeEspecial;
    private double saque;
    private double deposito;

    public Conta(double valor) {
        //se deposito 500 ou menor o cheuqe 50
        if (valor <= 500) {
            this.limiteChequeEspecial =  50;
            this.saldo = valor + limiteChequeEspecial;
        }
        //valor acima 50% do valor depositado
        else {
            System.out.println("Acima de 500");
            this.limiteChequeEspecial = valor * 50 / 100;
            this.saldo = valor + limiteChequeEspecial;
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    public double depositar(double valor) {
        this.deposito = valor;
        this.saldo += this.deposito;
        return this.deposito;
    }
    public double sacar(double valor) {
        this.saque = valor;
        this.saldo -=  this.saque;
        return this.saque;
    }
    public double pagarBoleto(double valor) {
        this.saldo -= valor;
        return valor;
    }
    public double seUsaCheuqe() {
        var saldo = this.saldo - this.limiteChequeEspecial;

        if (saldo < 0) {
            System.out.println("Vc esta Usando R$ "+ saldo+ " do Seu Cheque Especial ");
            return this.saldo;
        } else {
            System.out.println("Vc Não está Usando Cheque Especial ");
            return this.saldo;
        }

    }
}
