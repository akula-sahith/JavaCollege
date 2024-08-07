import java.util.Scanner;
class Movie2{
 	static int total_tickets = 25;
	static int tickets_booked = 0;
	static boolean houseFull(){
	  return tickets_booked == total_tickets;
	}
	static int AvailableTickets(){
	  System.out.println("Number of tickets : " + (total_tickets - tickets_booked));
      return (total_tickets-tickets_booked);
	}
}
public class AratedMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
		while(i<=5){
		   if(Movie2.houseFull()){
			   System.out.println("House full");
               break;
		   }
		   System.out.println("Enter your age : ");
		   int age = sc.nextInt();
		   if(age<18){
			   System.out.println("Strictly for above 18 only !! Sorry");
		   }else{
			   int available = Movie2.AvailableTickets();
			   System.out.println("Enter number of tickets : ");
			   int number = sc.nextInt();
               if(available<number){
                System.out.println("Insufficient tickets");
                continue;
               }
			   Movie2.tickets_booked = Movie2.tickets_booked + number; 
		   }
		   i++;
		}
        sc.close();
    }
}
