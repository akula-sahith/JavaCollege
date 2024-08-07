class Obj{
 static int count = 0;
 public Obj(){
    count++;
 }
}
class Test{
 public static void main(String[] args){
  Obj obj1 = new Obj();
  Obj obj2 = new Obj();
  Obj obj3 = new Obj();
  System.out.println(Obj.count);
 }
}