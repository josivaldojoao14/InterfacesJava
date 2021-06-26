package br.com.usandoInterfaces.pizzas;

public class Mussarela implements Pizza{


    @Override
    public String sabor() {
        return "mussarela";
    }

    @Override
    public String tamanho() {
        return "média";
    }
}
