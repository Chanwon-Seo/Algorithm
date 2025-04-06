import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String>[] arr = new ArrayList[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                arr[i].add(input.substring(j) + input.substring(0, j));
            }

            boolean chk = true;
            for (int j = 0; chk && j <= i - 1; j++) {
                for (int k = 0; chk && k < arr[j].size(); k++) {
                    if (input.equals(arr[j].get(k))) chk = false;
                }
            }
            if (chk) result++;
        }

        System.out.print(result);
    }
}