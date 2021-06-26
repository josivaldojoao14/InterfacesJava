package br.com.usandoInterfaces.carros;

public class Uno implements Carro{

    @Override
    public String marca() {
        return "Fiat";
    }

    @Override
    public String cor() {
        return "Branco";
    }

    @Override
    public String modelo() {
        return "Uno";
    }

    @Override
    public String placa() {
        return "PGT-0156";
    }
}
