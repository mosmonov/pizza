

import java.math.*;
import java.util.*;
/**
 *
 * 
 */
public class pizzaDelivery {
    public static void main(String[] args) {
        
        Pizza[] pizzas = {new Pizza("p1", Pizza.PIZZATYPE.SMALL), new Pizza("p2", Pizza.PIZZATYPE.MEDIUM), new Pizza("p3",Pizza.PIZZATYPE.LARGE), new Pizza("p4", Pizza.PIZZATYPE.SUPERLARGE), new Pizza("p5",Pizza.PIZZATYPE.MEDIUM)};
        Pizzeria dominoPizzeria = new Pizzeria();
        
        dominoPizzeria.setInventory(pizzas);
        dominoPizzeria.pizzeria(Pizza.PIZZATYPE.SMALL);
        dominoPizzeria.pizzaDelivery("p1");  
   }
}
