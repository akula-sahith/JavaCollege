import java.util.*;
class Bank{ 
  Random rand = new Random();
  Scanner sc = new Scanner(System.in);
  String name;
  String type;
  int account_no;
  int balance;
  public Bank(String name,String type,int balance){
     this.name = name;
	 this.type = type;
	 this.account_no = rand.nextInt(10000);
	 this.balance = balance;
  }
  
  public void withdraw(){
    System.out.println("Enter withdraw amount : ");
	int withdraw_amount = sc.nextInt();
	if(withdraw_amount>this.balance){
	 System.out.println("Insufficient balance");
	}else{
	 this.balance -= withdraw_amount;
	}
  }
  
  public void deposit(){
    System.out.println("Enter deposit amount : ");
	int deposit_amount = sc.nextInt();
	 this.balance += deposit_amount;
  }
  
  public void getInfo(){
    System.out.println("Name : " + this.name);
	System.out.println("Account number : " + this.account_no);
	System.out.println("Account balance : " + this.balance);
  }
}
class BankSystem2{
 public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter your name : ");
   String s = sc.next();
   System.out.print("Enter type of account you want : ");
   String type = sc.next();
   System.out.print("Enter deposit amount :  ");
   int initial = sc.nextInt();
   Bank bnk = new Bank(s,type,initial);
   int i  = 5;
   while (i>0) {
     bnk.deposit();
     bnk.getInfo();
     bnk.withdraw();
     bnk.getInfo();
     i--;
   }
   sc.close();
 }
}