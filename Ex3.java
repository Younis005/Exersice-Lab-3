import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        int x;
        System.out.println("inter the three number");
        x=y.nextInt();
        if(x%2==1)
            System.out.println("negative number");
        else if(x%2==0)
            System.out.println("positive number");
        else
        System.out.println("zero number");
    }
}
