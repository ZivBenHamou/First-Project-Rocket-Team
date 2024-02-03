import java.util.Scanner;

public class Function7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת מספר התחלתי
        System.out.print("enter the first number: ");
        int start = scanner.nextInt();

        // קליטת מספר סופי
        System.out.print("enter the last number: ");
        int end = scanner.nextInt();

        System.out.println("The initial numbers range from-" + start + " to " + end + " are:");
        printPrimeNumbersInRange(start, end);

    }

    // פונקציה לבדיקה אם מספר הוא מספר ראשוני
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // פונקציה להדפסת המספרים הראשוניים בטווח נתון
    private static void printPrimeNumbersInRange(int start, int end) {
        boolean foundPrime = false;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                foundPrime = true;
            }
        }

        // אם לא נמצאו מספרים ראשוניים בטווח
        if (!foundPrime) {
            System.out.println("There are no prime numbers in this range!");
        }
    }
}