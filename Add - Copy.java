import java.util.Scanner;

public class Add {
        public static void main (String[] args)
    {
        Scanner my = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int NUM1=my.nextInt();

        System.out.print("Enter Second Nmber :");
        int NUM2=my.nextInt();

        int SUM=NUM1+NUM2;
        System.out.println("SUM OF TWO NUMBERS : "+SUM);

    }
}
