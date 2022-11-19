package assignment2.independence;

public class Employee {

    //This method is not being called in the Vehicle class or
    //Any instance of this class is not created in the Vehicle class
    //Therefore there is no coupling here
    //These two classes are independent

    public void work()
    {
        System.out.println("I am working as an Employee");
    }
}
