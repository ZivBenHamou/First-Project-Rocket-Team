import java.util.Scanner;
public class Function3 {
    public static void main(String[] args) {
 //קלט מהמשתמש: פונקציה זו מתחילה בלקיחת קלט מהמשתמש. לשם כך, היא משתמשת במחלקת Scanner כדי לקרוא מספר שלם מהמשתמש.

        Scanner scanner = new Scanner(System.in);
        int number;
// בשלב הבא בדיקת תקינות הקלט: הפונקציה מבצעת בדיקה שהמספר שהוזן הוא חיובי ושלם. אם המספר שהוזן אינו חיובי, היא מבקשת מהמשתמש להזין שוב מספר, עד שיתקבל מספר חיובי.

        do {
            System.out.print("Please enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not an integer, try again:");
                scanner.next(); // Skip invalid input
            }
            number = scanner.nextInt();
        } while (number <= 0);

        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    private static long calculateFactorial(int number) {
 //חישוב העצרת: לאחר קבלת מספר חיובי, הפונקציה מחשבת את העצרת של המספר הזה באמצעות לולאת for. הלולאה מכפילה את כל המספרים מ-1 ועד למספר שהוזן, ומחזירה את התוצאה.

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
