import java.util.Scanner;
class Employee{
    int eno;
    String ename;
    float esal;

    public Employee(int no,String na,float sal){
        this.eno = no;
        this.ename = na;
        this.esal  = sal;
    }

    public void checkSalary(){
        try{
           if(esal < 10000){
            throw new Exception(": Not eligible for promotion");
           }else{
             System.out.println("Promoted");
           }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class EmployeeExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(66, "Sahith", 9000);
        emp.checkSalary();
    }

}