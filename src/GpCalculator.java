import java.util.Scanner;
public class GpCalculator {
    public static void main(String[]args){
        //calculates the gp of 200l EEE FUTO students
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your scores");
        String [] my_Courses = { "Maths", "Eng 226", "EEE 202", "EEE 204", "EEE 208", "Eng 212", "Eng 202",
                "Eng 214", "EEE 206", "Eng 224"};
        int [] my_Scores =new int [10];
//        int number;
        for (int i = 0; i <= 9 ; i++) {
            System.out.print(my_Courses[i]  + ": ");
            int number = input.nextInt();
           // System.out.println(m);
           my_Scores[i] =number ;
        }
        Grade mygrade = new Grade(my_Scores);
        System.out.print(mygrade.getUnits());

    }
}
class Grade {
      int [] score =new int [10];
    String [] my_Courses = { "Maths", "Eng 226", "EEE 202", "EEE 204", "EEE 208", "Eng 212", "Eng 202",
            "Eng 214", "EEE 206", "Eng 224"};

    int equivalent,grade, A, B, C, D, F,units ;
    String  course,  Maths, Eng226, EEE202, EEE204, Eng208, Eng212, Eng202, Eng214, EEE206, Eng224 ;

    Grade(int [] newScore){
        score =  newScore;

    }
   /* int getGrade() {
        if (score >= 70 && score <= 100) {
            grade = A;
            equivalent = 5;
        }else if (score >= 60 && score<= 69){
            grade = B;
            equivalent= 4;
        }else if (score >= 50 && score <= 59){
            grade = C;
            equivalent = 3;
        }else if (score >= 40 && score <= 49){
            grade = D;
            equivalent = 2;
        }else if (score >=0 && score <= 39 ){
            grade = F;
            equivalent = 1;
        }return equivalent;
    }*/int TNU =0;
    int getUnits(){
        for (int i = 0; i < 10; i++) {
            if(my_Courses[i] == Maths||my_Courses[i] == Eng226){
                units = 3;
            } if(my_Courses[i] == EEE202||my_Courses[i] == Eng224 || my_Courses[i] == EEE204 || my_Courses[i] == Eng208 || my_Courses[i] == Eng214){
                units = 2;
            } if(my_Courses[i] == Eng202||my_Courses[i] == EEE206){
                units = 1;
            }
                  TNU = Integer.parseInt(my_Courses[i] +TNU);
        }
       return TNU;

    }void Grade(int [] newScore){ //TUL is total unit load
        score =  newScore;
        //units = newUnits;
       // grade = newGrade;
    }
    //int course_units = Integer.parseInt(units);
}