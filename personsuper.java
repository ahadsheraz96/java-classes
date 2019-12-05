public class personsuper {

    public static void main (String args []){
        person personObj = new person();
        personObj.setAge(8);
        personObj.setFavColor("green");
        personObj.setName("manahil");

        System.out.println("amir age is "  +personObj.getAge());
        System.out.println("amir favo color is  "  +  personObj.getFavColor());
        System.out.println("my niece is "+personObj.getName());

    }


}
