import java.util.*;
public class Courses {
   public static List<String> subjects = new ArrayList<>();
    public static void AddCourse (){
        subjects.add("CSC 201");
        subjects.add("Gst 201");
    }
    public  static void Display() {
        AddCourse();
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + ". " + subjects.get(i));
        }
    }
}
