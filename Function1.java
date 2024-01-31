import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // מבקש מהמשתמש את הרדיוס
        System.out.print("Enter the radius of the circle: ");

        // לוקח מהמשתמש את הנתונים של הרדיוס
        double radius = scanner.nextDouble();

        // מחשב את ההיקף והשטח של העיגול
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        // מציג את התוצאות
        System.out.printf("Circle Area: %.2f%n", area);
        System.out.printf("Circle Circumference: %.2f%n", circumference);


    }
}
