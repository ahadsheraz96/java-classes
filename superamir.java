public class superamir {

    public static void main (String args[]){
        amir amirObj=new amir();

        amirObj.setCar("toyota");
        amirObj.setIncome(2000);
        amirObj.setWork("driving uber");

        System.out.println(amirObj.getCar());
        System.out.println(amirObj.getIncome());
        System.out.println(amirObj.getWork());
    }
}
