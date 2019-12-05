import java.util.Scanner;

public class mangoes {
  static int x=99;
    public static void mangoesPrice(){
        System.out.println("the mangoes are 10$ per lbs");
        int price;
        int lbs;
        System.out.println("enter lb of mangoes u want");

        Scanner ahad= new Scanner(System.in);
        lbs=ahad.nextInt();
        price =lbs*5;


        System.out.println("your total price is " +price);

        int sum ,a,b;
        System.out.println("enter a ");
        a=ahad.nextInt();
        System.out.println("enter b");
        b=ahad.nextInt();


        sum=a+b;
        System.out.println("the sum is "+sum);
    }

}
