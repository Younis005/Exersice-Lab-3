import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = y.nextInt();

        System.out.println("Enter second number");
        double num2 = y.nextInt();

        System.out.println("Enter third number ");
        double num3 = y.nextInt();

        if ((num1 == num2) && (num2 == num3))
        {
            System.out.println("All the same ");
        }
        else if ((num1 != num2) && (num2 != num3))
        {
            System.out.println("All different ");
        }
        else
        {
            System.out.println("Neither");
        }
    }
}
