import java.util.Scanner;
public class Function10 {
    public static  void  main(String[] args) {
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
}


