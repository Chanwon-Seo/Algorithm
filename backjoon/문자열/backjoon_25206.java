package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalSum = 0;
        double scoreSum = 0;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] scoreArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j])) {
                    totalSum += score * scoreArr[j];
                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }
        double avg = totalSum / scoreSum;
        System.out.printf("%.6f\n", avg);

    }
}