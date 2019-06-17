import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        String userInput, yes;
        boolean redEyes = false;

        Scanner keyboard = new Scanner(System.in);
        while (true)
        {


            System.out.println("Are your eyes red?");
            userInput = keyboard.nextLine();
            if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"))
            {
                System.out.println("Get some sleep");
                redEyes = true;
            }
           else if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no"))
           {
                System.out.println("You look great!");
                redEyes = false;
           }
            System.out.println("Do you want to try again (y/n)");
            yes=keyboard.next();
            if (yes.equalsIgnoreCase(("n")))
            {
                break;
            }
        }

    }




}
