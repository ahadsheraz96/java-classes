public class score1 {

    public static void main(String args[]) {

            String studentName = "jhon";
            int score = 49;
            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else grade = "F";
            System.out.println(studentName + "  " + grade);


        studentName = "ahad";
        score = 98;
        // grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else grade = "F";
        System.out.println(studentName + "  " + grade);
        // }

        studentName = "javeria ";
        score = 50;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else grade = "F";
        System.out.println(studentName + "  " + grade);
    }
}