package com.company;

class Car {                                                                                                             // . Creating the parent class Car

    private int cylinder;                                                                                               // . Initializing the instance variables.
    private Boolean engine;
    private int wheels;
    private int doors;
    private String type;


    // CONSTRUCTOR

    public Car(int cylinder, int doors, String type){                                                                   // . Creating a constructor with only 3 parameters, the rest have been set by default.
        this.engine = true;
        this.wheels = 4;
        this.cylinder = cylinder;
        this.doors = doors;
        this.type = type;
    }


    // GET METHODS


    public int getCylinder() {                                                                                          // . Get method for the cylinder instance.
        return cylinder;
    }


    public int getDoors() {                                                                                             // . Get method for the doors instance.
        return doors;
    }

    public String getType() {                                                                                           // . Get method for the type instance.
        return type;
    }


    // OTHER METHODS

    public void startEngine(){                                                                                          // . All Methods prints a String when called.
        System.out.println("The engine is on.");
    }

    public void accelerate(){
        System.out.println("accelerating.");
    }

    public void breaking(){
        System.out.println("Breaking.");
    }

}



// SUB-CLASSES.

class Ferrari extends Car{                                                                                              // . Creating sub-class Ferrari.

    private String color;                                                                                               // . Initializing the instance variable.


    // CONSTRUCTOR

    public Ferrari(String color, int cylinder , int doors , String type){                                               // . Creating the constructor passing 4 parameters, and calling the parent constructor.
        super(cylinder, doors, type);
        this.color = color;
    }


    // OVERRIDE METHODS

    @Override                                                                                                           // . Overriding the methods " startEngine, accelerate, breaking" to pass the name of the car.
    public void startEngine(){
        System.out.println("Ferrari engine is on.");
    }

    @Override
    public void accelerate(){
        System.out.println("Ferrari is accelerating.");
    }

    @Override
    public void breaking(){
        System.out.println("Ferrari is breaking.");
    }

}


class Lamborghini extends Car{                                                                                          // . Creating the sub-class Lamborghini.

    private String color;                                                                                               // . Initializing the instance variable.


    // CONSTRUCTOR

    public Lamborghini(String color, int cylinder , int doors , String type){                                           // . Creating the constructor passing 4 parameters, and calling the parent constructor.
        super(cylinder, doors, type);
        this.color = color;
    }


    // OVERRIDE METHODS

    @Override                                                                                                           // . Overriding the methods " startEngine, accelerate, breaking" to pass the name of the car.
    public void startEngine(){
        System.out.println("Lamborghini engine is on.");
    }

    @Override
    public void accelerate(){
        System.out.println("Lamborghini is accelerating.");
    }

    @Override
    public void breaking(){
        System.out.println("Lamborghini is breaking.");
    }

}



class Tesla extends Car{                                                                                                // . Creating the sub-class Tesla.

    private String color;                                                                                               // . Initializing the instance variable.


    // CONSTRUCTOR

    public Tesla(String color, int cylinder , int doors , String type){                                                 // . Creating the constructor passing 4 parameters, and calling the parent constructor.
        super(cylinder, doors, type);
        this.color = color;
    }


    // OVERRIDE METHODS

    @Override                                                                                                           // . Overriding the methods " startEngine, accelerate, breaking" to pass the name of the car.
    public void startEngine(){
        System.out.println("Tesla engine is on.");
    }

    @Override
    public void accelerate(){
        System.out.println("Tesla is accelerating.");
    }

    @Override
    public void breaking(){
        System.out.println("Tesla is breaking.");
    }

}


public class Main {

    public static void main(String[] args) {

        Tesla firstCar = new Tesla("blue", 300, 5,"City");
        firstCar.startEngine();
        firstCar.accelerate();
        firstCar.breaking();

        Ferrari secondCar = new Ferrari("red",400,3,"Racing");
        secondCar.startEngine();
        secondCar.accelerate();
        secondCar.breaking();

        Lamborghini thirdCar = new Lamborghini("Yellow", 400, 3,"Racing");
        thirdCar.startEngine();
        thirdCar.accelerate();
        thirdCar.breaking();

    }
}

