import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Number");
        long inp = input.nextInt();
        input.close();

        int result = 1;
        if (inp < 0) inp *= -1;
        if (inp >= 10 && inp < 100) {
            result = 2;
        } else if (inp >= 100 && inp < 1000) {
            result = 3;
        } else if (inp >= 1000 && inp < 10000) {
            result = 4;
        } else if (inp >= 10000 && inp < 100000) {
            result = 5;
        } else if (inp >= 100000 && inp < 1000000) {
            result = 6;
        } else if (inp >= 1000000 && inp < 10000000) {
            result = 7;
        } else if (inp >= 10000000 && inp < 100000000) {
            result = 8;
        } else if (inp >= 100000000 && inp < 1000000000) {
            result = 9;
        } else if (inp >= 1000000000 && inp < 1000000000) {
            result = 10;
        } else {
            System.out.println("Number is greater than 10 billion ");
        }
        System.out.printf("Result: %d", result);
    }
}
