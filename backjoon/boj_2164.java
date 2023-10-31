package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Queue<String> q = new LinkedList<String>();

        for (int i = 1; i <= N; i++) {
            q.add(String.valueOf(i));
        }

        while (q.size() > 1) {
            q.poll();

            if (q.size() > 1) {
                q.add(q.poll());
            }
        }

        System.out.println(q.poll());
    }
}