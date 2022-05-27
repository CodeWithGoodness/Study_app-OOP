import java.util.*;
public class GpCalculator extends Courses{
    static String gradeUnit, courseUnit;
    Integer GP;
    //private static ArrayList<String> grades = new ArrayList<>();
    private static ArrayList<Integer> units = new ArrayList<>();
    public static void myCourses() {
    }
    public static void DisplayCoursesAndUnits(){
        getGP();
    }
    public static Integer getGradesUnits() {
        addCourse();
        System.out.println("Enter your grades");
        Scanner input = new Scanner(System.in);
        String grades = " ";
        for (int i = 0; i < 2; i++) {
            System.out.println(subjects.get(i));
             grades = (input.next());
        }
        HashMap<String, Integer> gradeUnit = new HashMap<String, Integer>();
        gradeUnit.put("A", 12);
        gradeUnit.put("B", 10);
        gradeUnit.put("C", 6);
        gradeUnit.put("D", 4);
        for (int i = 0; ; i++) {
            return gradeUnit.get(grades);
        }

    }
    public static Integer getCourseUnit(){
        HashMap<String, Integer> courseUnit = new HashMap<String, Integer>();
        courseUnit.put("CSC 201", 3);
        courseUnit.put("Gst 201", 2);
        System.out.println("Hey");
        for (in t i = 0; ; i++) {
            return courseUnit.get(subjects.get(i));
        }
    }
    public static void getGP(){
        getGradesUnits();
        getCourseUnit();
       System.out.println("Hey");
            System.out.println(getGradesUnits() * getCourseUnit());

    }
}