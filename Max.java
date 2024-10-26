
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First num : ");
        int first = scanner.nextInt();
        System.out.println("Sec num : ");
        int sec = scanner.nextInt();
        System.out.println("Max : " + Math.max(first , sec ));
        scanner.close();
    }
}
