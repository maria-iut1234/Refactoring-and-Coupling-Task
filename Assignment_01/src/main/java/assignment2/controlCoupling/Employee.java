package assignment2.controlCoupling;

public class Employee {

    private int salary;
    private String employeeType;

    //Here salary acts as a control variable to determine the output for another attribute
    //That is why this is an example of control coupling

    public void employeeType()
    {
        if(salary<5000)
        {
            employeeType="Regular Employee";
        }
        else
        {
            employeeType="Special Employee";
        }
    }
}
