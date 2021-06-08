package FinalExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train train = new Train();
        Ship ship = new Ship();
        Airplane airplane = new Airplane();
        Hotel hotel = new Hotel();
        int discount;
        int total = 0;
        int a = scanner.nextInt();
        int[] price = {train.price, ship.price, airplane.price, hotel.price};
        String[] type = {train.type, ship.type, airplane.type, hotel.type};
        while (true) {
            System.out.println("Please select the ticket : ");
            for (int i = 0; i < 4; i++) {
                System.out.println(i + 1 + ". " + type[i] + " :");
            }
            System.out.println("Pause 0 to exit.");
            if (a==0){
                break;
            } else if (a<=3){
                for (int i = 0; i < 4; i++) {
                    if (a == i) {
                        total += price[i];
                         break;
                    } else {
                        break;
                    }
                }
            }else{
                System.out.println("!!!!error!!!!");
                System.out.println("Please enter again.");
            }
        }
    }
}