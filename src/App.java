import java.io.*;
import java.util.Scanner;
public class App {
        public static void main(String[]args){
            while (true){
                App.Options();
            }
        }
        public static void Options(){
            System.out.println("1. Lecture notes \n 2. GP calculator \n 3. Quiz" );
            App.Selection();
        }
        public static void Selection(){
            Scanner input = new Scanner(System.in);
            String select = input.next();
            switch (select){
                case "1":
                    Lectures.selectCourse();
                    break;
                case "2":
                    GpCalculator.DisplayCoursesAndUnits();
                    break;
                case "3":
                default:
                    System.out.println("invalid input");

            }
        }
    }
