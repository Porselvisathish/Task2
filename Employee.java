package OOP;

public class Employee extends Person1 {
    int employeeId;
    double salary;
    public Employee(String name, int age,int employeeId,double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
        public void displayEmployeeInfo(){
            displayPersonInfo();
            System.out.println("EmployeeId:"+employeeId);
            System.out.println("Salary:"+salary);
    }
    }
    public static void main(String[] args) {
        Employee emp =new Employee("Arun,20,101,60000.0");
        emp.displayEmployeeInfo();
    }





