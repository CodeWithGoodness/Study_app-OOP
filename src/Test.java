import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap <String, ArrayList<String>> hm = GpCalculator.myCourseUnit();
        GpCalculator.gp(hm);
    }
}
