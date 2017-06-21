package cat143;

import java.util.Scanner;

/*
En una playa de estacionamiento cobran $40 la primera hora y $ 30 a partir de la segunda hora. Diseñe un algoritmo que determine 
cuanto debe pagar un cliente por el estacionamiento de su vehículo, conociendo el tiempo de estacionamiento en horas (tener en 
cuenta que se puedan ingresar minutos). Resolver media hora o fracción.
*/
// Receives: time
// Returns: fee
public class ParkingLot {
    
       Scanner input = new Scanner(System.in);
       
       int firstHour = 40;
       int plusHour = 30;
       int time;
       String garageName = "Los Pollos Hermanos";
       
       public float turnHours(int mins){
           float total = ((mins * 60)/60);
           float hours = (total/60);
           return hours;
       }
       
       public float fee(int price, float time){
           return (float) (time/price);
       }
       
       public void calcFee(float time){
           int price = 0;
           
           if (time < 1.0){
               System.out.println("Fee: " + firstHour + " p/h.");
               System.out.printf("Total Time Spent: %.2fmins\n"
                       + "Fee: %.2f$\n THANKS FOR YOUR STAY! \n",
                       time, fee(firstHour, time));
           } else {
               fee(plusHour, time);
               System.out.println("Fee: " + plusHour + " p/h.");
               System.out.printf("Total Time Spent: %.2fmins\n"
                       + "Fee: %.2f$\n THANKS FOR YOUR STAY! \n",
                       time, fee(plusHour, time));               
           }
       }

       public void payment(){
           int time;
           System.out.println("----------WELCOME TO " + garageName + " PARKING!----------");
           System.out.print("How many time was the car parked right there?: (MINS)");
           time = input.nextInt();
           System.out.println("Excellent!");
           calcFee(time);
       }
}
