import java.util.Scanner;
public class Function5 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            int number, counter = 0;

            System.out.println("Please Enter a Number");
            number = scanner.nextInt();

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("This isn't Prime Number");
                    counter++;
                    break;
                }
            }
            if (counter == 0)
                System.out.println("This is Prime Number");
        }

    }
}
