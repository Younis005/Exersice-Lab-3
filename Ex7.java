import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int inputMonth = 0;
        int inputDay = 0;
        System.out.println("I can what season it is if you tell me the the number indecating the month and one indecating the day. ");
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 12 to indecate the month:");
        inputMonth = keyboard.nextInt();
        boolean validInput = true;
        if (inputMonth > 12 || inputMonth <1)
        {
            System.out.println(inputMonth + "is not a valid month");
            validInput = false;
        }
        else
        {
            System.out.println("Please enter the number from 1 to 31 to indecate the day");
            keyboard.nextInt();
            if (inputDay > 31 || inputMonth < 1);
            {
                System.out.println(inputDay + "is not a valid day");
                validInput = false;
            }
        }
        if (validInput)
        {
            String season ="";
            if (inputMonth == 1 || inputMonth == 2 || inputMonth == 3)
            {
                season = "Winter";
            }
            else if (inputMonth == 4 || inputMonth == 5 || inputMonth == 6)
            {
                season = "Spring";
            }
            else if (inputMonth == 7 || inputMonth == 8 || inputMonth == 9)
            {
                season = "Summer";
            }
            else
            {
                season = "Fall";
            }
            if (inputMonth % 3 == 0 && inputDay >= 21)
            {
                if (season.equalsIgnoreCase("winter"))
                {
                    season = "Spring";
                }
                else if (season.equalsIgnoreCase("Summer"))
                {
                    season = "Fall";
                }
                else
                {
                    season = "Winter";
                }
            }
            System.out.println(validInput + "I think it is \t" + season);
        }
        else
        {
            System.out.println(validInput + "data so quitting.");
        }
    }
}
