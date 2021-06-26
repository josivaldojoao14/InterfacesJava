package br.com.usandoInterfaces.carros;

public interface Carro {
    String marca();
    String cor();
    String modelo();
    String placa();

    default void ligar() {
        System.out.println("Ligando o carro...");
    }
}
