package backjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[31];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}

//class Solution {
//    public int[] solution(int[] num_list) {
//        int[] arr = num_list;
//        int[] answer = new int[2];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                answer[0]++;
//            } else {
//                answer[1]++;
//            }
//        }
//        return answer;
//    }
//}