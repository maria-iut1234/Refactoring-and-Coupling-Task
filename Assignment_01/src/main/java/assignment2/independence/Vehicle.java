package assignment2.independence;

public class Vehicle {

    //This method is not being called in the Employee class or
    //Any instance of this class is not created in the Employee class
    //Therefore there is no coupling here
    //These two classes are independent

    public void drive()
    {
        System.out.println("This Vehicle is being driven.");
    }
}
