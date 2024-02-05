import java.util.Scanner;


public class Function4 {
    public static void naturalNumberPrint()
    {
        Scanner scanner = new Scanner(System.in);
        int startNumber,endNumber,swapNumberTemp;

        System.out.println("Please Enter 2 Range Numbers");
        startNumber=scanner.nextInt();
        endNumber= scanner.nextInt();

        if(startNumber==endNumber)
        {
            System.out.println("You entered identical numbers. Please try again");
            naturalNumberPrint();
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
}
