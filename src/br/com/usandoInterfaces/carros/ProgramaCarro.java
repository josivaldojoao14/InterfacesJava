package br.com.usandoInterfaces.carros;

public class ProgramaCarro {

    public static void main(String[] args){
        final Corsa corsa = new Corsa();

        corsa.ligar();

        System.out.println("Marca do carro: " + corsa.marca());
        System.out.println("Cor do carro: " + corsa.cor());
        System.out.println("Modelo do carro: " + corsa.modelo());
        System.out.println("Placa do carro: " + corsa.placa());

        System.out.println(" ");

        final Uno uno = new Uno();
        System.out.println("Marca do carro: " + uno.marca());
        System.out.println("Cor do carro: " + uno.cor());
        System.out.println("Modelo do carro: " + uno.modelo());
        System.out.println("Placa do carro: " + uno.placa());
    }
}
