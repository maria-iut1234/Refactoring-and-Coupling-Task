package assignment2.dataCoupling;

public class Employee {

    //Here an instance of Vehicle class is used that is composition is used
    //The instance is then used to access the setModel() method to set the vehicle model
    //Then the getter method of Vehicle is used to get that model and set it as the vehicleType
    //for this Employee class

    private String vehicleType;

    public void setEmployeeVehicleType()
    {
        Vehicle vehicle=new Vehicle();
        vehicle.setModel("Aston Martin");
        this.vehicleType=vehicle.getModel();
    }

}
