import java.util.Scanner;

public class passwordChecker {

    public static void main (String[] args)
    {
        String Password = "Password1234";

        String name = "Mr Jones";

        System.out.println("Hello " + name.toUpperCase());

        int length = Password.length();

   //     Scanner userPassword = new Scanner(System.in);

        if (Password == Password) {
            System.out.println("Your password is correct, Welcome " + name.toUpperCase());
        }

        else if (length == length || length == ++length || length == --length)
        {
            System.out.println("This password isn't correct but is close, maybe you mistyped?");
        }

        else
        {
            System.out.println("Sorry, your password is incorrect, Try again?");
        }
    }
}
