
public class RentalCarCompany {
    private Car carInventory[];
    
    //constructor
    public RentalCarCompany() {
        carInventory = new Car[5]; //assuming we only have five cars
    }
    
    public void setInventory(Car[] cars){
        Car[] copyArray = new Car[5];
        copyArray = cars;
        carInventory = copyArray;//deep copy
    }
    
    public String rentalACar(Car.CARTYPE type){
        boolean flag = false;
        for(int i=0;i<5;i++) {
            if(carInventory[i].getCarType() == type && carInventory[i].getAvail() == true) {//found car type
                carInventory[i].toggleAvail(); //set availability to false
                System.out.println("Congrats. I have a car platenum -"+carInventory[i].getPlateNum()+" - for you.");
                flag = true;
                //break; //no need to loop further
				return carInventory[i].getPlateNum();
            }
        }
        if(!flag) //if we don't find a math
            System.out.println("Sorry. We don't have any car matching your request.");
		return "No car found.";
    }
    
    public void returnACar(String plateNum){
        for(int i=0;i<5;i++) {
            if(carInventory[i].getPlateNum() == plateNum ) {//found car type
                carInventory[i].toggleAvail(); //set availability to true
                System.out.println("Your car "+plateNum+" has been returned.");
                break;//no need to loop further
            }
        }

    }
    
    
}
