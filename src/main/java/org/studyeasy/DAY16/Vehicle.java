package org.studyeasy.DAY16;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  31 12/31/2025 12:05 PM
 Project Name : 30Days_Java
 ***/
public interface Vehicle {


    void ChangeGear(int a);
    void SpeedUp(int a);
    void applyBrake(int a);
}
class Bike implements Vehicle{
    int speed;
    int gear;
    //Change Gear
    @Override
    public void ChangeGear(int newGear){
        gear = newGear;
    }
    //Increase Gear
    @Override
    public void SpeedUp(int increment){
        speed = speed + increment;
    }
    //Decrease Speed
    @Override
    public void applyBrake(int decrement){
        speed = speed - decrement;
    }

    public void printState(){
        System.out.println("speed " + speed +" gear "+ gear);
    }


}
class Bicycle implements Vehicle{//Class implements Interface methods
    int speed;
    int gear;
    //Change Gear
    @Override
    public void ChangeGear(int newGear){
        gear = newGear;
    }
    //Increase Gear
    @Override
    public void SpeedUp(int increment){
        speed = speed + increment;
    }
    //Decrease Speed
    @Override
    public void applyBrake(int decrement){
        speed = speed - decrement;
    }

    public void printState(){
        System.out.println("speed " + speed +" gear "+ gear);
    }
}
class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.ChangeGear(2);
        bike.SpeedUp(3);
        bike.applyBrake(1);
        System.out.println("Bike status right now : ");
        bike.printState();

        //Bicycle
        Bicycle bicycle = new Bicycle();

        bicycle.ChangeGear(2);
        bicycle.SpeedUp(3);
        bicycle.applyBrake(1);

        System.out.print("Bicycle present state : ");
        bicycle.printState();
    }
}
