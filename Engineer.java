public class Engineer extends  Employee
{
    private double overtimeHours;
    private double hourlyRate;

    public Engineer(String name,double baseSalary ,double overtimeHours,double hourlyRate)
    {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;

    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate);
    }
}
