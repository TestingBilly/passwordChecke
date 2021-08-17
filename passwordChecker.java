import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
 //       System.out.println("Hello World");
        Scanner userNameInput = new Scanner(System.in);
        System.out.println("Please enter your name");


        String Password = "Password1234";
        String name = userNameInput.nextLine();

        int noOfTries = 0;

        do {System.out.println("Hello " + name.toUpperCase());



        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter password");

        String userPassword = userInput.nextLine();

        int length = userPassword.length();

            if (userPassword.equals(Password))
                    {
                        System.out.println("Your password is correct, Welcome " + name.toUpperCase());
                        noOfTries =10;
                    }
            else
                    {
                        noOfTries++;
                         System.out.println("Oops try again");
                    }



            if (length <= 5)
                {
                    System.out.println("This password is too short ");
                }
            else if (length >= 20)
                {
                    System.out.println("This password is too long");
                }
            else
                {
                    System.out.println("this password is juusssstt Right");
                }

            if(noOfTries ==6);
                {
                    System.out.println("Almost out of guesses, guess the number That i'm thinking of between 1 and 100 to try again");
                    Scanner guess = new Scanner(System.in);
                    System.out.println("Enter password");

                    double numberRandom = (Math.random() * 100);

                    String userGuess = guess.nextLine();
                    if (userGuess.equals(numberRandom))
                    {
                          System.out.println("You got it right! Yay!");
                          noOfTries =0;
                    }
                    else
                    {
                        System.out.println("Tough luck, lsat chance to get the password right");
                    }
                }
            }
            while (noOfTries <= 6) ;
            if (noOfTries == 7)
                 {
                     System.out.println("Too Many Guesses");
                 }

    }
}
