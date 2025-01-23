/*

    Student Name: Shayne McNeil
    Student ID: W0454809

 */

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setMake("Honda");
        System.out.println(myCar.getMake());
        myCar.setYear(2018);
        System.out.println(myCar.getYear());

        // Create instance of Car object with no-argument constructor
        Car firstCar = new Car();
        
        // Create instance of Car object with paramterized constructor 
        Car secondCar = new Car("Honda", "Civic", 2018, "silver");

        // Updating firstCar using setters
        firstCar.setYear(2022);
        firstCar.setColour("blue");

        // Using getters to display information about secondCar
        System.out.println("My car is a " + secondCar.getColour() + " " + secondCar.getYear() + " " + secondCar.getMake() + " " + secondCar.getModel() + ".");

    }
}