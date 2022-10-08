package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String[] str_arr = new String[N];

        for (int i = 0; i < str_arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            str_arr[i] = st.nextToken();
        }

        Arrays.sort(str_arr, new Comparator<String>() { //Comparator는 객체를 비교할 수 있는 인터페이스
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // compareTo o1과 o2의 길이가 동일한 경우 0을 반환.
                } else {
                    return o1.length() - o2.length(); // o1과 o2의 길이를 비교하여 길이의 차이값을 리턴한다.
                }
            }
        });
        sb.append(str_arr[0]).append("\n");

        for (int i = 1; i < str_arr.length; i++) {
            if (!str_arr[i].equals(str_arr[i - 1])) {
                sb.append(str_arr[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
