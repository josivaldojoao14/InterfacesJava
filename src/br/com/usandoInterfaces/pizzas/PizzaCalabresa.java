package br.com.usandoInterfaces.pizzas;

public class PizzaCalabresa implements Pizza {


    @Override
    public String sabor() {
        return "calabresa";
    }

    @Override
    public String tamanho() {
        return "grande";
    }
}
