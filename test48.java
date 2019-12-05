public class test48 {

    public static void main (String args []){


        test47 test47Obj= new test47();

        test47Obj.setLaptop("Apple");
        test47Obj.setPrice(1500);
        test47Obj.setSdCARD("intel inside");
        test47Obj.setSdsize(528);


        System.out.println("The make of this laptop is  "+test47Obj.getLaptop());
        System.out.println("The price of this laptop is  "+test47Obj.getPrice());
        System.out.println("The sd card is made by  "+test47Obj.getSdCARD());
        System.out.println("The size of the sd card is  "+test47Obj.getSdsize());


    }
}
