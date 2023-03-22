package br.com.banco;

public class Banco {
    private int numero;
    private double saldo;

    public Banco(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor){
        if (valor<=this.saldo)
        this.saldo = this.saldo - valor;

    }
    public void depositar (double valor){
        this.saldo = this.saldo + valor;

    }
}
