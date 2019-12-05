import java.util.jar.JarOutputStream;

public class buffer {
    public static void main (String args []){


        StringBuffer sheraz=new StringBuffer("loveforcricket");
        int a=sheraz.length();
        int b=sheraz.capacity();
        System.out.println(a);
        System.out.println(b);

        System.out.println(sheraz);
        System.out.println(sheraz.append("game"));
        System.out.println(sheraz.reverse());




    }
}
