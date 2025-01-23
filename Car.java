/*

    Student Name: Shayne McNeil
    Student ID: W0454809

 */

public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    private String colour;

    // Constructor Method - Parameterized
    public Car(String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    // Constructor Method - No-Argument Constructor
    public Car() {
        this.make = "Tesla";
        this.model = "3";
        this.year = 2024;
        this.colour = "white";
    }

    // Methods
    public String getMake() {
        return this.make;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public int getYear() {
        return this.year;
    }
    
    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

}