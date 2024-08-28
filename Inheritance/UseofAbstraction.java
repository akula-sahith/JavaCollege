//Inheritance of abstract classes
package Inheritance;
import java.util.*;
abstract class LivingBeing{
    abstract void breathe();
}
abstract class Animal extends LivingBeing{
    abstract void eat();
}
abstract class Human extends Animal{
    abstract void talk();
} 
class Sahith extends Human{
    void breathe(){
        System.out.println("Breathing");
    }
    void eat(){
        System.out.println("Eating");
    }
    void talk(){
        System.out.println("Talking");
    }
    void code(){
        System.out.println("Coding");
    }
}
public class UseofAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human sahith = new Sahith();
        sahith.breathe();
        sahith.talk();
        sahith.eat();
        // sahith.code(); ---> This throws an error because the reference is human
        sc.close();
    }
}
