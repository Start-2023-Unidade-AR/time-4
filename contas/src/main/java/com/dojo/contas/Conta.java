package com.dojo.contas;


public abstract  class Conta {

    private int numero;

    private String agencia;

    private double saldo;

    public int getNumero() { 
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public abstract boolean deposito(double valor);

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");
    }

    public double consultaSaldo(){
        return this.saldo;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
