import java.util.*;
class Employee{
 String name;
 int eno;
 float esal;
 public void read(String name){
   this.name = name;
 }
 public void read(int eno){
   this.eno = eno;
 }
 public void read(float esal){
   this.esal = esal;
 }
 public void getInfo(){
   System.out.println("Name : " + name);
   System.out.println("Enumber : " + eno);
   System.out.println("Salary : " + esal);
 }
}
class Company{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  Employee emp = new Employee();
  emp.read("Spidey");
  emp.read(66);
  emp.read(65000.589f);
  emp.getInfo();
  sc.close();
 }
}