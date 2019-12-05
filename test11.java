public class test11 {
    public static void main (String args []){

        String game="     my favorite game is cricekt. i love odi matches more then test matches     ";
        String ahad="";
        String khan="karachi";
        String khan2="peshawar";

        System.out.println(game.length());
        System.out.println(game.indexOf("c"));
        System.out.println(game.indexOf("is"));
        System.out.println(game.isEmpty());
        System.out.println(ahad.isEmpty());
        System.out.println(game.trim());

        System.out.println("replacement example "+khan.replace("a", "e" ) );
        System.out.println("replacement example 2 "+khan2.replace('e', 'a'));



    }

}
