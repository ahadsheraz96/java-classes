import java.util.Scanner;

public class test15 {


    public static void main (String args []){
        int score1;
        int score2;

        Scanner ahad= new Scanner(System.in);
        System.out.println("enter first game score");


        score1=ahad.nextInt();

        System.out.println("enter game 2 score");

        score2=ahad.nextInt();

        int average;
        average=(score1+score2)/2;

        System.out.println("your average is  "+average);





    }
}
