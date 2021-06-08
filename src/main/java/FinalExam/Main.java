package FinalExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();
        Ship ship = new Ship();
        Airplane airplane = new Airplane();
        Hotel hotel = new Hotel();
        int total = 0;
        int discount = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            String type [] = {train.type , ship.type , airplane.type , hotel.type};
            int TicketCount [] = {train.count , ship.count , airplane.count , hotel.count};
            int number [] = {train.number , ship.number , airplane.number , hotel.number};
            int price[] = {train.price , ship.price , airplane.price , hotel.price};
            System.out.println("Please select the ticket :");
            for (int i = 0; i < 30; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < 4; i++) {
                System.out.println( i+1 + " ." + type[i] + " :" + price[i]);
            }
            System.out.println("Pause 0 to exit");
            for (int i = 0; i < 30; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < 4; i++) {
                System.out.println(type[i] + " : " + TicketCount[i]);
            }
            System.out.println("discount" + " : " + discount);
            System.out.println("total" + " : " + total);
            for (int i = 0; i < 30; i++) {
                System.out.print("*");
            }
            System.out.println();
            int ticket = scanner.nextInt();
            if (ticket==0){
                break;
            } else{
                if (ticket==train.number){
                    System.out.println("Sure for " + train.type + " ?");
                    System.out.println("Pause 1 for sure ");
                    System.out.println("Pause 0 to exit ");
                    int answer = scanner.nextInt();
                    if (answer == 1){
                        total += train.price;
                        train.count +=1 ;
                    } else if (answer==0){
                        System.out.println();
                    }
                } else if (ticket==ship.number){
                    System.out.println("Sure for " + ship.type + " ?");
                    System.out.println("Pause 1 for sure ");
                    System.out.println("Pause 0 to exit ");
                    int answer = scanner.nextInt();
                    if (answer == 1){
                        total += ship.price;
                        ship.count +=1 ;
                    } else if (answer==0){
                        System.out.println();
                    }
                } else if (ticket==airplane.number){
                    System.out.println("Sure for " + airplane.type + " ?");
                    System.out.println("Pause 1 for sure ");
                    System.out.println("Pause 0 to exit ");
                    int answer = scanner.nextInt();
                    if (answer == 1){
                        total += airplane.price;
                        airplane.count +=1 ;
                    } else if (answer==0){
                        System.out.println();
                    }
                } else if (ticket==hotel.number){
                    System.out.println("Sure for " + hotel.type + " ?");
                    System.out.println("Pause 1 for sure ");
                    System.out.println("Pause 0 to exit ");
                    int answer = scanner.nextInt();
                    if (answer == 1){
                        total += hotel.price;
                        hotel.count +=1 ;
                    } else if (answer==0){
                        System.out.println();
                    }
                } else {
                    System.out.println("!!!!error!!!!");
                    System.out.println("Please enter again :");
                }
            }
        }
    }
}
