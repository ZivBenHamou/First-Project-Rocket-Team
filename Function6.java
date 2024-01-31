
import java.util.Scanner;

public class Function6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0;

        // מבקש מהמשתמש להכניס מספר זוגי בעל 5 ספרות
        while (true) {
            System.out.print("Enter a positive 5-digit number:");
            inputNumber = scanner.nextInt();

            if (isFiveDigitPositiveNumber(inputNumber)) {
                break;
            } else {
                System.out.println(" Wrong! The number is not a positive 5-digit number. Try again.");
            }
        }

        // קטע המעדכן את היוזר על ידי בדיקה אם המספר שהוכנס הוא פלינדרום
        if (isPalindrome(inputNumber)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

    }

    // בודק עם המספר בעל ה5 ספרות הוא זוגי
    private static boolean isFiveDigitPositiveNumber(int number) {
        return number > 0 && number >= 10000 && number <= 99999;
    }

    // בודק אם המספר הוא פלינדרום
    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        // נותן ליוזר להמשיך לנסות שוב ושוב ללא הגבלה כשהוא טועה
        return originalNumber == reversedNumber;
    }
}
