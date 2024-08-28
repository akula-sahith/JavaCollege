package Interfaces;
import java.util.*;
interface Animal{
  public void walk();
}
interface Bird{
  public void fly();
}
interface Nightbird extends Animal,Bird{
  public void hang();
}
class Bat implements Nightbird{
    public void walk(){
        System.out.println("Walking");
    }
    public void fly(){
        System.out.println("Flying");
    }
    public void hang(){
        System.out.println("Hanging");
    }
}
public class InheritanceinInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bat bat = new Bat();
        bat.fly();
        bat.hang();
        bat.walk();
    }
}
