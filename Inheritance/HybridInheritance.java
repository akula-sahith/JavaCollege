package Inheritance;
interface A{
    void walk();
}
class B implements A{
    public void walk(){
        System.out.println("Walking");
    }
    public void run(){
        System.out.println("Running");
    }
}
class C implements A{
    public void walk(){
        System.out.println("Walking");
    }
    public void eat(){
        System.out.println("Eating");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        
    }
}
