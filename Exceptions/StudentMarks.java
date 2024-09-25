class Student{
    int sno;
    String sname;
    float javaMarks;
    float totalMarks;
    public Student(int n,String na,float jm,float tm){
        this.sno =n;
        this.sname = na;
        this.javaMarks = jm;
        this.totalMarks = tm;
    }

    public void calculatePercentage() throws Exception{
         try{
             if(totalMarks == 0){
                throw new ArithmeticException("The total marks cant be zero");
             }
         }catch(ArithmeticException e){
            System.out.println(e + " " + e.getMessage());
         }
    }

    public void printName() throws Exception{
         try{
               for(int i = 0;i<=sname.length();i++){
                 System.out.println(sname.charAt(i));
               }
         }catch(StringIndexOutOfBoundsException e){
              System.out.println(e);
         }
    }
 
}
public class StudentMarks {
    public static void main(String[] args) throws Exception{
        Student std = new Student(66, "Sahith", 65, 0);
        std.calculatePercentage();
        std.printName();
    }
}
