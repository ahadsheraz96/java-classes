public class methprac {



    public static void main(String args[]) {

      findCat("ahad",900);
      findCat("javeria", 1000);
      findCat("hassan",800);
    }

        public static void findCat(String playerName, int scoreTotal){
        //int scoreTotal = 800;
        //String playerName = "ahad";
         String catPlayer;

        if (scoreTotal > 1000) {
            catPlayer = "DAIMOND";
        } else if (scoreTotal >= 900) {
            catPlayer = "gold";
        } else
            catPlayer = "silver";

        //  }
        System.out.println(playerName +"  "+ catPlayer);

    }
}