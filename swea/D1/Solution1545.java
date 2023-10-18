import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int i = Integer.parseInt(br.readLine()); i >= 0; i--) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}