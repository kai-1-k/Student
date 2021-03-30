package BoxTester;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter lenght : ");
        int lenght = scanner.nextInt();
        System.out.println("Please enter width : ");
        int width = scanner.nextInt();
        System.out.println("Please enter height : ");
        int height = scanner.nextInt();
        System.out.println("lenght" + lenght + "width" + width + "height" + height);
        Box3 box3 = new Box3(10, 10, 10, 60);
        Box5 box5 = new Box5(10, 20, 20, 90);
        if (lenght <= box3.lentht && width <= box3.width && height <= box3.height) {
            System.out.println("box 3" + box3.money);
        } else {
            System.out.println("box 5" + box5.money);
        }
        }
    }