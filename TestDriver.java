/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zhao.cis4110.classdemo;

import java.math.*;
import java.util.*;
/**
 *
 * 
 * @author echo
 */
public class TestDriver {
    public static void main(String[] args) {
        
        Car[] cars = {new Car("p1", Car.CARTYPE.COMPACT), new Car("p2", Car.CARTYPE.FULLSIZE), new Car("p3",Car.CARTYPE.MIDSIZE), new Car("p4", Car.CARTYPE.SUBCOMPACT), new Car("p5",Car.CARTYPE.MIDSIZE)};
        RentalCarCompany prestigeRental = new RentalCarCompany();
        
        prestigeRental.setInventory(cars);
        prestigeRental.rentalACar(Car.CARTYPE.COMPACT);
        prestigeRental.returnACar("p1");  
   }
}
