public class score {



    public static void main (String args []) {

        String studentName = "  jhon";
        int score = 69;
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score < 90 && score >= 80) {
            grade = "B";
        } else if (score < 80 && score >= 70) {
            grade = "c";
        } else
            grade = "F";
        System.out.println(studentName + "  your grade  is " + grade);

    }



}

