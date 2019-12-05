public class test42 {
    String name;
    int emid;


    test42(String name, int emid){
        this.name=name;
        this.emid=emid;


    }

    public static void main (String args []){


        test42 infromation= new test42("hassan", 223433);
        System.out.println(infromation.emid);
        System.out.println(infromation.name);



    }

}
