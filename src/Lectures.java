import java.util.*;
public class Lectures extends Courses {
    public  static void Display(){
        addCourse();
        for (int i = 0; i < 2; i++) {
            System.out.println((i+1) +". " + subjects.get(i));
        }
        selectCourse();
    }
    public static void selectCourse(){
        Scanner input = new Scanner(System.in);
      String sel =  input.next();
        if(sel.equals("1"))
            System.out.println("Computer is an electronic device");
        else if(sel.equals("2"))
            System.out.println("English is a communication language");
        else
            System.out.println("Invalid");
    }
}


