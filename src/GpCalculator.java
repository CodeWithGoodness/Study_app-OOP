import java.util.*;
public class GpCalculator extends Courses{
    private static ArrayList<String> grades = new ArrayList<>();
    public static void DisplayCoursesAndUnits() {
        AddCourse();
        System.out.println("Enter your grades");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println(subjects.get(i));
            grades.add(input.next());
        }
    }

    public static  HashMap<String, ArrayList<String>> myCourseUnit(){
        HashMap<String, ArrayList<String>> courseUnit = new HashMap<>();
        ArrayList<String> gradeUnit = new ArrayList<>();
        courseUnit.put("CSC 201", gradeUnit);
        gradeUnit.add("A");
        gradeUnit.add("5");

        ArrayList<String> gradeUnit2 = new ArrayList<>();
        courseUnit.put("Gst 201", gradeUnit2);
        gradeUnit2.add("B");
        gradeUnit2.add("4");

        ArrayList<String> gradeUnit3 = new ArrayList<>();
        courseUnit.put("EEE 201", gradeUnit3);
        gradeUnit3.add("C");
        gradeUnit3.add("3");

        ArrayList<String> gradeUnit4 = new ArrayList<>();
        courseUnit.put("MCE 201", gradeUnit4);
        gradeUnit4.add("D");
        gradeUnit4.add("2");

        return courseUnit;

    }
    public static int gp(HashMap<String, ArrayList<String> > myCourseUnit){
        int sumOfMultiplyGradeUnits = 0;
        for (String key: myCourseUnit.keySet()){
            ArrayList<String> keyReg = myCourseUnit.get(key);
            int multiplyGradeUnit = 1;
            for (String input : keyReg) {
                if (input.matches("\\d")){
                    multiplyGradeUnit *= Integer.parseInt(input);
                }
                else{
                    if (input.equalsIgnoreCase("A")) {
                        multiplyGradeUnit *= 12;
                    }
                    if (input.equalsIgnoreCase("B")) {
                        multiplyGradeUnit *= 10;
                    }
                    if (input.equalsIgnoreCase("C")) {
                        multiplyGradeUnit *= 8;
                    } if (input.equalsIgnoreCase("D")) {
                        multiplyGradeUnit *= 6;
                    }
                }
            }
            sumOfMultiplyGradeUnits += multiplyGradeUnit;
        }
        return sumOfMultiplyGradeUnits;

    }
}