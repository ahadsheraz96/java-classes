public class methods {


    public static void main(String args[]) {
        findGrades("jhon", 92);
        findGrades("ahad", 70);
        findGrades("javeria", 82);
    }


        public static void findGrades (String studentName,int score ){
           //  studentName = "jhon";
           // score = 49;
            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else grade = "F";
            System.out.println(studentName + "  " + grade);
        }
    }
