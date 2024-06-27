public class EmployeeExample
{
     public static void main(String[] args)
     {
         Manager manager = new Manager("John Doe",500000,10000);
         Engineer engineer = new Engineer("Jane Smith",60000,10,20);
         Salesperson salesperson = new Salesperson("Michael Brown" , 45000,0.05,50000);

         Employee[] employees ={manager ,engineer,salesperson};

         for(Employee employee : employees)
         {
             System.out.println("Employee" + employee.name);
             System.out.println("Salary: $" + employee.calculateSalary());
             System.out.println();

         }

     }

}
