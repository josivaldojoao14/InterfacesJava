package br.com.usandoInterfaces.pizzas;

public interface Pizza {
    String sabor();
    String tamanho();

    default void Criar(){
        System.out.println("Colocando a pizza no forno...");
    }
}
