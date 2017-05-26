

import java.math.*;
import java.util.*;
/**
 *
 * 
 */
public class Courier {
    public static void main(String[] args) {
        
        Pizza[] pizzas = {new Pizza("p1", Pizza.PIZZATYPE.SMALL), new Pizza("p2", Pizza.PIZZATYPE.MEDIUM), new Car("p3",Car.CARTYPE.LARGE), new Car("p4", Car.CARTYPE.SUPERLARGE), new Car("p5",Car.CARTYPE.MEDIUM)};
        Pizzeria dominoPizzeria = new Pizzeria();
        
        dominoPizzeria.setInventory(pizzas);
        dominoPizzeria.pizzeria(Pizza.PIZZATYPE.SMALL);
        dominoPizzeria.pizzaDelivery("p1");  
   }
}
