/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Car {
     enum CARTYPE {SUBCOMPACT,COMPACT,MIDSIZE,FULLSIZE};
     
     private final String plateNum; // you may set final keyword since the value should be fixed for the car
     private final CARTYPE carType; // you may set final keyword since the value should be fixed
     private boolean avail;
     
     //constructor
     public Car(String plateNum, CARTYPE carType) {
         this.plateNum = plateNum;
         this.carType = carType;
         this.avail = true; //default value
     }
     
     //getters and setters
     public void toggleAvail() {
         avail = !avail;
     }
     
     public String getPlateNum(){
         return plateNum;
     }
     
     public CARTYPE getCarType() {
         return carType;
     }
     
     public boolean getAvail() {
         return avail;
     }
}
