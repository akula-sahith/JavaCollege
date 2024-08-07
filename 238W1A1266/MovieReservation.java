import java.util.Scanner;
class Movie{
   static int total_tickets = 15;
   static int tickets_booked = 0;
   static int ticket_price = 150;
   static boolean houseFull(){
    return total_tickets==tickets_booked;
   }
   static void NumberofTickests(){
    System.out.println("Number of tickets : " + (total_tickets - tickets_booked));
   }
}
class Audience{
    String name;
    int number_of_tickets;
    int total_price;
    public Audience(String name,int number_of_tickets){
        this.name = name;
        this.number_of_tickets = number_of_tickets;
        this.total_price = number_of_tickets * Movie.ticket_price;
        Movie.tickets_booked += number_of_tickets;
    }
    public void getInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Number of tickets booked : " + this.number_of_tickets);
        System.out.println("Total price : " + this.total_price);
    }
}
public class MovieReservation {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int i = 1;
         while (i<=5) {
            if(Movie.houseFull()){
               System.out.println("House Full");
               break;
            }
            Movie.NumberofTickests();
            System.out.print("Enter your name : ");
            String s = sc.next();
            System.out.print("Number of tickets you want to book : ");
            int number_of_tickets = sc.nextInt();
            Audience audi = new Audience(s, number_of_tickets);
            audi.getInfo();
         }
         sc.close();
    }
}
