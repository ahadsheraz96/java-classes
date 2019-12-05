public class revstr1 {
    public static void main(String args []){
        System.out.println("abt ot reverse a string for u ");

        }
        public static String reverse(String apples){
        if ((apples == null) || apples.isEmpty()){
                return apples;

            }
          String reverse =" ";
           for (int i =apples.length()-1; i>=0; i--) {
               reverse = reverse + apples.charAt(i);
           }
           return reverse;
           }

}
