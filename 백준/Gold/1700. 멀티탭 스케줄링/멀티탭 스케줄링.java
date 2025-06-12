import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] boolArr = new boolean[101];
        int put = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            int temp = arr[i];

            if (!boolArr[temp]) {
                if (put < n) {
                    boolArr[temp] = true;
                    put++;
                } else {
                    ArrayList<Integer> arrList = new ArrayList<>();
                    for (int j = i; j < k; j++) {
                        if (boolArr[arr[j]] && !arrList.contains(arr[j])) {
                            arrList.add(arr[j]);
                        }
                    }

                    if (arrList.size() != n) {
                        for (int j = 0; j < boolArr.length; j++) {
                            if (boolArr[j] && !arrList.contains(j)) {
                                boolArr[j] = false;
                                break;
                            }
                        }
                    } else {
                        int remove = arrList.get(arrList.size() - 1);
                        boolArr[remove] = false;
                    }

                    boolArr[temp] = true;
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
