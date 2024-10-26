
import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tax = ");
            int tax = scanner.nextInt();
            if (tax < 10) {
                System.out.println("Tax 0%");
            } else if (10 <= tax && tax <= 15) {
                System.out.println("Thue 10%");
            } else if (15 < tax && tax <= 30) {
                System.out.println("Thue 20%");
            } else {
                System.out.println("Thue 50%");
            }
            scanner.close();
        }
    }

}
