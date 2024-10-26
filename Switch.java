
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day : ");
        int day = scanner.nextInt();
        switch (day){
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Friday");
            default -> {
                System.out.println("Unknow");
                System.exit(0);
            }
        }
        scanner.close();
    }
}