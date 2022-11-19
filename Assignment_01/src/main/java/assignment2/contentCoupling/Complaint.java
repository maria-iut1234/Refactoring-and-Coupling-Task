package assignment2.contentCoupling;

public class Complaint {

    //Here attributes of the Employee class are changed directly
    //using the penalizeEmployee method
    //since the attributes are public
    Employee employee=new Employee(7000, "Skye");

    public void penalizeEmplyee()
    {
        if(employee.name=="Skye")
        {
            employee.salary-=2000;
        }
    }

}
