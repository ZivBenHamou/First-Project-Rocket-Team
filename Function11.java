import java.util.Scanner;

public class Function11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // המשתמש מתבקש להכניס מספר
        System.out.print("Insert a number: ");
        int number = scanner.nextInt();

        // המספר נבדק כדי לראות ולהחליט אם הוא חלק מסדרת פיבונאצי
        if (isFibonacci(number)) {
            System.out.println("THE NUMBER IS PART OF THE FIBONACCI SEQUENCE!");
        } else {
            System.out.println("The number is not part of the fibonacci sequence");
        }
    }

    //הפונקציה לבדיקת המספר כדי לראות אם הוא חלק מסדרת פיבונאצי
    private static boolean isFibonacci(int number) {
        int a = 0, b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        return false;
    }
}


