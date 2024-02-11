import java.util.Scanner;

public class MainFunction
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println(""); // שורה רווח
        System.out.println("Welcome User!");

        System.out.println("1 - Circle Circumference and Area");
        System.out.println("2 - Temperature Conversion (F/C or C/F)");
        System.out.println("3 - Factorial Result");
        System.out.println("4 - Natural Numbers in Range");
        System.out.println("5 - Prime Number Check");
        System.out.println("6 - 5Digit Number Palindrome Check");
        System.out.println("7 - Print Prime Number in Range");
        System.out.println("8 - GCD Of Two Numbers");
        System.out.println("9 - Polynomial Equation Result");
        System.out.println("10 - Compound Interest Check");
        System.out.println("11 - Fibonacci Check");
        System.out.println("12 - Narcissistic Number Print");
        System.out.println("0 - End Program");
        System.out.println(""); // שורה רווח

        System.out.println("Choose Calculation from the options above");
        choice = scanner.nextInt();

        switch (choice)
        {
            case 0:
                break;

            case 1:
              circleAreaAndCircumference();
                main(args);
              break;

            case 2:
                tempConversion();
                main(args);
                break;

            case 3:
              //  factorialResult();
                main(args);
                break;
            case 4:
                naturalNumbersInRange();
                main(args);
                break;
            case 5:
                primeNumberCheck();
                main(args);
                break;
            case 6:
                palindromeCheck();
                main(args);
                break;
            case 7:
                printPrimeNumInRange();
                main(args);
                break;
            case 8:
                gcdCheck();
                main(args);
                break;
            case 9:
                quadraticEquationResult();
                main(args);
                break;
            case 10:
                compoundInterest();
                main(args);
                break;
            case 11:
                fibonacciCheck();
                main(args);
                break;
            case 12:
                //narcissiticCheck();
                main(args);
                break;
        }
    }

    public static void circleAreaAndCircumference() {
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

    public static void tempConversion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "To caculate fahrenheit print 1 , To caculate celcius print 2 " ) ;
        int choose = scanner.nextInt();

        if ( choose==1 ) {
            System.out.println( "Enter the number of celcius to caculate :");
            float celcius = scanner.nextFloat();

            double result = celcius*1.8 + 32;
            System.out.println( " at farenheit it will be "  +result);

        }
        else if (choose==2){
            System.out.println( "Enter the number of farenheit to caculate :");
            float farenheit = scanner.nextFloat();
            double result = (farenheit-32) /1.8;
            System.out.println( " at celcius it will be " + result);


        }
        else {
            System.out.println( "Wrong");
        }



    }

    public static void naturalNumbersInRange()
    {
        Scanner scanner = new Scanner(System.in);
        int startNumber,endNumber,swapNumberTemp;

        System.out.println("Please Enter 2 Range Numbers");
        startNumber=scanner.nextInt();
        endNumber= scanner.nextInt();

        if(startNumber==endNumber)
        {
            System.out.println("You entered identical numbers. Please try again");
            naturalNumbersInRange();
        }
        else if (startNumber > endNumber)
        {
            swapNumberTemp = endNumber;
            endNumber = startNumber;
            startNumber = swapNumberTemp;

            System.out.println(startNumber);
            System.out.println(endNumber);
            for (int i = startNumber; i <= endNumber; i++) {
                if (startNumber >= 0)
                    System.out.println(i);
                else startNumber++;
            }
        }
        else{
            for(int i=startNumber;i<=endNumber;i++)
            {
                if(startNumber >= 0)
                    System.out.println("|"+i+"|");
                else startNumber++;
            }
        }
    }

    public static void primeNumberCheck()
    {
        Scanner scanner = new Scanner(System.in);
        int number,counter=0;

        System.out.println("Please Enter a Number");
        number=scanner.nextInt();

        for(int i=2;i<number;i++) {
            if (number % i == 0){
                System.out.println("This isn't Prime Number");
                counter++;
                break;
            }
        }
        if(counter == 0)
            System.out.println("This is Prime Number");
    }

    public static void palindromeCheck()
    {
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
    public static boolean isFiveDigitPositiveNumber(int number) {
        return number > 0 && number >= 10000 && number <= 99999;
    }

    // בודק אם המספר הוא פלינדרום
    public static boolean isPalindrome(int number) {
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

    public static void printPrimeNumInRange()
    {
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
    public static boolean isPrime(int number) {
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
    public static void printPrimeNumbersInRange(int start, int end) {
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

    public static void gcdCheck()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers , that you want to check the GCD :");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int highestModule = 0;

        for (int i =1 ; i<=number1 ; i++){
            if (number1%i==0 && number2%i==0)
                highestModule = i;
        }
        System.out.println("The highest gcd between the numbers is : " +  highestModule);

    }

    public static void quadraticEquationResult()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for a , b , c :");
        int numA= scanner.nextInt();
        int numB= scanner.nextInt();
        int numC= scanner.nextInt();

        double sum = (numB * numB) - 4 * numA * numC;

        if (sum >= 0) {
            double sqrt = Math.sqrt(sum);
            double result1 = (-numB + sqrt) / 2 * numA;
            double result2 = (-numB - sqrt) / 2 * numA;
            if (result1 == result2) {
                System.out.println("X1 =" + result1);
            } else {
                System.out.println("X1 =" + result1 + " , X2 =" + result2);

            }
        }
        else {
            System.out.println("Math Error!");
        }
    }

    public static void compoundInterest()
    {
        //אם כל מחזור הוא חודש
        Scanner scanner = new Scanner(System.in);

        float savings,tax;
        double fixTax,fund,profit,earlyWithdraw=0.5;
        int quarter=3;

        System.out.println("Please enter your initial saving amount");
        savings= scanner.nextFloat();
        System.out.println("Please enter the monthly tax");
        tax= scanner.nextFloat();
        fund=savings;
        fixTax=tax/100;

        for(int i=1; i<=(quarter*12);i++)
        {
            if(i==quarter*4||i==quarter*8||i==quarter*12){
                fund=fund+(fund*fixTax);
                System.out.println("Your Saving after "+i+"month is "+fund);
                System.out.println("No loss on early withdrawl");
                continue;
            }
            fund=fund+(fund*fixTax);
            System.out.println("Your Saving after "+i+"months is "+fund);
            profit=fund-savings;
            System.out.println("If you withdraw early you lose 50% profit ("+(profit*earlyWithdraw)+") , total after loss: "+(savings+profit*earlyWithdraw));
        }
    }

    public static void fibonacciCheck()
    {
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

    public static boolean isFibonacci(int number) {
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
