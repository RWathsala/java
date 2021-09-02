import java.util.Scanner;
public class Operator {
    public static void main (String[]args)
{
    Scanner my = new  Scanner(System.in);
    System.out.print("Enter First Number ;");
    double NUM1=my.nextDouble();
    

    System.out.print("Enter Second Number ;");
    double NUM2=my.nextDouble();
    my.nextLine();

    System.out.println("Select Operator (+,-,*,/) ;");
    String Operator=my.nextLine();

    double output;
    switch(Operator)
    {
        case "+":
        output = NUM1 + NUM2;
        break;

        case "-":
        output = NUM1 - NUM2;
        break;

        case "*":
        output = NUM1 * NUM2;
        break;

        case "/":
        output = NUM1 / NUM2;
        break;

        default:
           System.out.printf("You have entered wrong operator");
           return;

    }
    System.out.println(NUM1+" "+Operator+" "+NUM2+" = "+output);

}

}
