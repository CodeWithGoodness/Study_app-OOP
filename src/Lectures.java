import java.util.*;
public class Lectures extends Courses {
    public static void selectCourse(){
        Display();
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


