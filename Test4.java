public class Test4 {
    public static void main(String[] args) {
        System.out.println("hey bro");

         int x=10;
         int y=20;

         int sum;
         sum=x+y;
         System.out.println("your sum is " + sum);

         Computer first = new Computer();

         first.ram = 8;
         first.hd = 256;
         first.cpuSpeed = 1.8;


        System.out.println("This computer has memory of " + first.ram + " Gigs."); //Concatenation
        System.out.println("This computer has a harddrive storage of "+ first.hd + "gb");

        first.start();
        first.start();
        first.shutdown();
        first.shutdown();


    }
}






