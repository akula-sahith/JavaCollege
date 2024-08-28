package Week2;
import java.util.Scanner;

class Bank{
    String name;
    String type;
    String account_number;
    int balance;
    public Bank(String name, String type, String account_number, int balance) {
        this.name = name;
        this.type = type;
        this.account_number = account_number;
        this.balance = balance;
    }
    
    public void deposit(Scanner sc){
      System.out.println("Enter deposit amount : ");
      int deposit_amount = sc.nextInt();
      balance = balance + deposit_amount;
      System.out.println("Amount deposited!!");
    }
    
    public void withdraw(Scanner sc){
        System.out.println("Enter withdraw amount : ");
        int withdraw_amount = sc.nextInt();
        if(withdraw_amount>balance){
            System.out.println("Insufficient balance");
        }else{
            balance -= withdraw_amount;
        }
    }

    public void get_balance(){
        System.out.println("Name : " + name);
        System.out.println("Account number : " + account_number);
        System.out.println("Balance : " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
