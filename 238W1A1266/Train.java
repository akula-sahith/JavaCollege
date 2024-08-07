import java.util.*;
class Customer{
  String name;
  int age;
  int tickets;
  int total_amount;
  public Customer(String name,int age,int tickets){
    this.name = name;
	  this.age = age;
    this.tickets = tickets;
	  this.total_amount = tickets * TravelAgent.price;
	  TravelAgent.tickets += tickets;
	  TravelAgent.customers++;
  }
  public void getInfo(){
   System.out.println("Name : " + this.name);
   System.out.println("Age : " + this.age);
   System.out.println("Number of tickets : " + this.tickets);
   System.out.println("Total price : " + this.total_amount);
  }
}
class TravelAgent{
   static int customers = 0;
   static int tickets = 0;
   static int price = 100;
}
class Train{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int i = 1;
   while(i<=5){
     System.out.println("Enter name : ");
	 String s = sc.next();
	 System.out.println("Enter age : ");
	 int age = sc.nextInt();
	 System.out.println("Enter number of tickets : ");
	 int tickets = sc.nextInt();
	 Customer cust = new Customer(s,age,tickets);
     cust.getInfo();
	 System.out.println("Number of customers : " + TravelAgent.customers);
	 System.out.println("Number of tickets booked : " + TravelAgent.tickets);
   i++;
   }
   sc.close();
 }
}