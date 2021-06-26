package br.com.usandoInterfaces.carros;

public class Corsa implements Carro {
    @Override
    public String marca() {
        return "Chevrolet";
    }

    @Override
    public String cor() {
        return "Vermelho";
    }

    @Override
    public String modelo() {
        return "Corsa";
    }

    @Override
    public String placa() {
        return "KKB-6241";
    }
}
