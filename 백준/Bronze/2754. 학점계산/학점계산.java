import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Map<String, String> gradeList = new HashMap<>();
        gradeList.put("A+", "4.3");
        gradeList.put("A0", "4.0");
        gradeList.put("A-", "3.7");
        gradeList.put("B+", "3.3");
        gradeList.put("B0", "3.0");
        gradeList.put("B-", "2.7");
        gradeList.put("C+", "2.3");
        gradeList.put("C0", "2.0");
        gradeList.put("C-", "1.7");
        gradeList.put("D+", "1.3");
        gradeList.put("D0", "1.0");
        gradeList.put("D-", "0.7");
        gradeList.put("F", "0.0");
        String input = br.readLine();
        System.out.println(gradeList.get(input));
    }

}