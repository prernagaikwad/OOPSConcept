public class Salesperson extends Employee
{
    private double salesComission;
    private double baseComission;

    public Salesperson(String name , double baseSalary,double salesComission ,double baseComission)
    {
        super(name ,baseSalary);
        this.salesComission = salesComission;
        this.baseComission = baseComission;

    }

    public  double calculateSalary()
    {
        return baseSalary + ( salesComission * baseComission);
    }


}
