package assignment2.StampCoupling;

public class Employee {

    //This is an example of Stamp Coupling since
    //an instance of RegularEmployee class is passed as parameter
    //Then operation is done on it
    //So attribute of the reference passed is changed using this method

    public void updateSalary(RegularEmployee re)
    {
        int bonus= re.getSalary();
        re.setSalary(bonus*2+bonus);
    }
}
