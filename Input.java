
import java.util.Scanner;



public class Input {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("What is ur name : ");
       String name = scanner.nextLine();
       System.out.println("What is ur age : ");
       int age = scanner.nextInt();
       System.out.println("ur name : " + name + " ur age : " + age );
       scanner.close();
    }

}
