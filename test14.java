import java.util.Scanner;

public class test14 {
    public static   void findScore1 () {



        int score;
        System.out.println("enter your score");
        Scanner ahad = new Scanner(System.in);
        score = ahad.nextInt();
        if (score > 100) {
            System.out.println("great innings ");
        } else
            System.out.println("not good");


    }
}