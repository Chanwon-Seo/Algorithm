import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static String[] sList = {
            "____",
            "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.",
            "\"재귀함수가 뭔가요?\"",
            "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"",
            "\"재귀함수는 자기 자신을 호출하는 함수라네\"",
            "라고 답변하였지.",
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        sb.append(sList[1]).append("\n");
        func(n, "");
        System.out.print(sb);
    }

    static void func(int depth, String dash) {
        sb.append(dash).append(sList[2]).append("\n");

        if (depth <= 0) {
            sb.append(dash).append(sList[6]).append("\n")
                    .append(dash).append(sList[7]).append("\n");
            return;
        }

        sb.append(dash).append(sList[3]).append("\n")
                .append(dash).append(sList[4]).append("\n")
                .append(dash).append(sList[5]).append("\n");

        func(depth - 1, dash + sList[0]);

        sb.append(dash).append(sList[7]).append("\n");
    }
}