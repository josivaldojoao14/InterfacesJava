package br.com.usandoInterfaces.pizzas;
import java.util.Scanner;

// O usuário não escolhe o tamanho da pizza, esse exemplo tem fins didáticos.

public class PedirPizza {
    public static void main (String[] args){
        String entradapizza;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual pizza deseja? \n 1.Calabresa \n 2.Mussarela");
        entradapizza = entrada.nextLine();

        if (Integer.parseInt(entradapizza) == 1)
        {
            final PizzaCalabresa pizzaCalabresa = new PizzaCalabresa();
            pizzaCalabresa.Criar();
            System.out.println("Saindo do forno a pizza de " + pizzaCalabresa.sabor() + " tamanho " + pizzaCalabresa.tamanho());

        }
        else if(Integer.parseInt(entradapizza) == 2)
        {
            final Mussarela mussarela = new Mussarela();
            System.out.println("Saindo do forno a pizza de " + mussarela.sabor() + " tamanho " + mussarela.tamanho());
        }
        else
        {
            System.out.println("Escolha uma opção válida!");
        }
    }
}
