package br.com.cubosacademy.exerciciospoo.setimo;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria () {
        this.saldo = 0;
    }

    public double getSaldo () {
        return this.saldo;
    }

    public void setDeposito (double deposito) {
        if (deposito < 0) {
            System.out.println("Depósito negativo inválido!");
            return;
        }
        this.saldo += deposito;
    }
    public void setSaque (double saque) {
        if (this.saldo < saque) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= saque;
    }
}
