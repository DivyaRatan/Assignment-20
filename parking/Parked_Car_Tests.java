package com.parking;

 
public class Parked_Car_Tests { 
 
public static void main(String[] args) { 
 
Parked_Car_OwnerList pl=new Parked_Car_OwnerList(); 
 
//adding new object in the list 
pl.add_new_car(new Parked_CarOwner_Details("Ram", "Vagnar", "WB02AL6513", "9876036339", "Dellhi")); 
pl.add_new_car(new Parked_CarOwner_Details("Shyam", "Audi", "WB02AL6515", "8251036339", "Mumbaii")); 
pl.add_new_car(new Parked_CarOwner_Details("Abhi", "Ferrari", "WB02AL6518", "8691526339", "Bihar")); 
pl.add_new_car(new Parked_CarOwner_Details("Div", "Bolero", "WB02AL6516", "8697421339", "Chennai")); 
pl.add_new_car(new Parked_CarOwner_Details("Prag", "Bullet", "WB02AL6513", "8697145339", "Banglore")); 
; 
 
 
//removing the car at slot 3 
pl.removeCar(3); 
  
 
 
//checking a valid slot and an empty slot 
pl.get_parked_location(5);  
pl.get_parked_location(3); 
  
pl.get_parked_location(3); 
//Showing all the details 
} 
 
} 
