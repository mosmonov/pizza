
public class Pizzeria {
    private Pizza pizzaInventory[];
    
    //constructor
    public Pizzeria() {
        pizzaInventory = new Pizza[5]; //assuming we only have five pizza
    }
    
    public void setInventory(Pizza[] pizzas){
        Pizza[] copyArray = new Pizza[5];
        copyArray = pizzas;
        pizzaInventory = copyArray;//deep copy
    }
    
    public String pizzeria(Pizza.PIZZATYPE type){
        boolean flag = false;
        for(int i=0;i<5;i++) {
            if(pizzaInventory[i].getPizzaType() == type && pizzaInventory[i].getAvail() == true) {//found pizza type
                pizzaInventory[i].toggleAvail(); //set availability to false
                System.out.println("Congrats. I have a pizza pizzanum -"+pizzaInventory[i].getPizzaNum()+" - for you.");
                flag = true;
                //break; //no need to loop further
				return pizzaInventory[i].getPizzaNum();
            }
        }
        if(!flag) //if we don't find a math
            System.out.println("Sorry. We don't have any pizza matching your request.");
		return "No pizza found.";
    }
    
    public void pizzeria(String pizzaNum){
        for(int i=0;i<5;i++) {
            if(pizzaInventory[i].getPizzaNum() == pizzaNum ) {//found pizza type
                pizzaInventory[i].toggleAvail(); //set availability to true
                System.out.println("Your pizza "+pizzaNum+" has been delivered.");
                break;//no need to loop further
            }
        }

    }
    
    
}
