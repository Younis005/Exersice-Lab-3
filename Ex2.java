import java.util.Scanner;

public class Ex2{
    public static void main( String[] args ) {

        Scanner keyboard = new Scanner(System.in);
        String color = "";

        while(true) {

            System.out.println( "Input square letter" );
            String letter = keyboard.next();

            System.out.println( "Input square number" );
            int number = keyboard.nextInt();

            if ( letter.equals("a") || letter.equals("c") || letter.equals("e") || letter.equals("g") )
            {
                if ( number % 2 != 0 )
                    color = "black";
                else
                    color = "white";
            }
            else
            {
                if ( number % 2 == 0 )
                    color = "black";
                else
                    color = "white";
            }

            System.out.println( "The color of the square is " + color );

        }

    }

}