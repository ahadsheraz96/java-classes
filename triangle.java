import java.util.InputMismatchException;
import java.util.Scanner;

public class triangle {

    public static void main(String args []){


        double height = 0;
        double base;

        Scanner ahad =new Scanner(System.in);
        System.out.println("enter height");
        try {
            height = ahad.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Invalid Input. Enter again.");
        }


        System.out.println("enter base");
        base=ahad.nextDouble();

        double area=(base*height)/2;

        System.out.println("the area is   "  +area);
        if (area>10) {
            System.out.println("this is a big triangle");
        }
            else
        {
            System.out.println("this is a small triangle");

        }
    }
}
