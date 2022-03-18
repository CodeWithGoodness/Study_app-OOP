import java.util.Scanner;
public class GpCalculator {
    public static void main(String[]args){
        //calculates the gp of 200l EEE FUTO students

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your scores");
        System.out.print("Maths: ");
        int mathsScore = input.nextInt();
        System.out.print("Eng226: ");
        int Eng226Score = input.nextInt();
        System.out.print("EEE202: ");
        int EEE202Score = input.nextInt();
        System.out.print("EEE204: ");
        int EEE204Score = input.nextInt();
        System.out.print("Eng208: ");
        int Eng208Score = input.nextInt();
        System.out.print("Eng212: ");
        int Eng212Score = input.nextInt();
        System.out.print("Eng202: ");
        int Eng202Score = input.nextInt();
        System.out.print("Eng214: ");
        int Eng214Score = input.nextInt();
        System.out.print("EEE206: ");
        int EEE206Score = input.nextInt();
        System.out.print("Eng224: ");
        int Eng224Score = input.nextInt();
      // int my_courses [] = new int[10];
        Grade mygrade = new Grade(mathsScore);

        System.out.print(mygrade.score);

    }
}
class Grade {
    int score;
    int equivalent,grade, A, B, C, D, F ;
    //int course;
    String units, course,  Maths, Eng226, EEE202, EEE204, Eng208, Eng212, Eng202, Eng214, EEE206, Eng224 ;

    Grade(int newScore){
        score =  newScore;

    }
    int getGrade() {
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
    }
    String getUnits(){
        if(course == Maths||course == Eng226){
            units = "3";
        } if(course == EEE202||course == Eng224 || course == EEE204 || course == Eng208 || course == Eng214){
            units = "2";
        } if(course == Eng202||course == EEE206){
            units = "1";
        }return units;

    }void Grade(int newScore){ //TUL is total unit load
        score =  newScore;
        //units = newUnits;
       // grade = newGrade;
    }
    //int course_units = Integer.parseInt(units);
}