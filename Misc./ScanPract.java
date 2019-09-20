import java.util.Scanner;

public class ScanPract
{
    public static void main(String [] args)
    {
        Scanner teeth = new Scanner(System.in);
        System.out.println("How many legs do you have? (Answer in word form)");
        String legs = teeth.nextLine();


        if(legs.equals("two"))
        {
            System.out.println("You are a bipedal.");
        }
        else if(legs.equals("three"))
        {
            System.out.println("You are a tripedal.");
        }
        else if(legs.equals("four"))
        {
            System.out.println("You are a quadrupedal.");
        }
        else if(legs.equals("five"))
        {
            System.out.println("You are a quintaped.");
        }
        else
        {
            System.out.println("That's a lotta legs");
        }
        teeth.close();
    }
}
