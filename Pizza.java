
public class Pizza {
     enum PIZZATYPE {SUPERLARGE,LARGE,MEDIUM,SMALL};
     
     private final String pizzaNum; 
     private final PIZZATYPE pizzaType; 
     private boolean avail;
     
     //constructor
     public Pizza(String pizzaNum, PIZZATYPE pizzaType) {
         this.pizzaNum = pizzaNum;
         this.pizzaType = pizzaType;
         this.avail = true; //default value
     }
     
     //getters and setters
     public void toggleAvail() {
         avail = !avail;
     }
     
     public String getPizzaNum(){
         return pizzaNum;
     }
     
     public PIZZATYPE getPizzaType() {
         return pizzaType;
     }
     
     public boolean getAvail() {
         return avail;
     }
}
