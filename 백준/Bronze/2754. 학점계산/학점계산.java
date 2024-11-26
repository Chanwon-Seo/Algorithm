import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static char mainGrade, subGrade;
    static char[] subGradeArr = {'+', '0', '-'};

    public static void main(String[] args) throws Exception {
        char[] input = br.readLine().toCharArray();
        mainGrade = input[0];
        if (mainGrade != 'F') {
            subGrade = input[1];
        }
        if ('A' == mainGrade) {
            if (subGradeArr[0] == subGrade) {
                sb.append("4.3");
            } else if (subGradeArr[1] == subGrade) {
                sb.append("4.0");
            } else if (subGradeArr[2] == subGrade) {
                sb.append("3.7");
            }
        } else if ('B' == mainGrade) {
            if (subGradeArr[0] == subGrade) {
                sb.append("3.3");
            } else if (subGradeArr[1] == subGrade) {
                sb.append("3.0");
            } else if (subGradeArr[2] == subGrade) {
                sb.append("2.7");
            }
        } else if ('C' == mainGrade) {
            if (subGradeArr[0] == subGrade) {
                sb.append("2.3");
            } else if (subGradeArr[1] == subGrade) {
                sb.append("2.0");
            } else if (subGradeArr[2] == subGrade) {
                sb.append("1.7");
            }
        } else if ('D' == mainGrade) {
            if (subGradeArr[0] == subGrade) {
                sb.append("1.3");
            } else if (subGradeArr[1] == subGrade) {
                sb.append("1.0");
            } else if (subGradeArr[2] == subGrade) {
                sb.append("0.7");
            }
        } else {
            sb.append("0.0");
        }
        System.out.println(sb);
    }

}