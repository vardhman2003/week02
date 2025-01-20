import java.util.*;

class Employee{
    private
    String name;
    int id;
    int salary;

    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        displayDetails();
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int id=sc.nextInt();
        int salary=sc.nextInt();
        Employee one=new Employee(str, id, salary);   
    }
    
}