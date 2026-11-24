package Bancario.dominio;

public class Bancario01 {
    private String titular;
    private int numeroConta;
    private double saldo;

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Erro: titular inválido!");
        }
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Erro: número da conta inválido!");
        }
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0 && Double.isFinite(valor)) {
            this.saldo += valor;
        } else {
            System.out.println("Erro: valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && Double.isFinite(valor)) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
            } else {
                System.out.println("Erro: saldo insuficiente!");
            }
        } else {
            System.out.println("Erro: valor de saque inválido!");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }

    public void transferir(Bancario01 destino, double valor) {
        if (destino != null && destino != this
                && valor > 0 && Double.isFinite(valor)
                && valor <= this.saldo) {

            this.saldo -= valor;
            destino.saldo += valor;

        } else {
            System.out.println("Erro: transferência inválida!");
        }
    }
}
