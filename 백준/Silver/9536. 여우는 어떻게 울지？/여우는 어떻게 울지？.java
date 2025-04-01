import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static final String FOX_SAY_PROMPT = "what does the fox say?";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] sounds = br.readLine().split(" ");

            ArrayList<String> crying = new ArrayList<>();
            String input;
            while (!(input = br.readLine()).equals(FOX_SAY_PROMPT)) {
                String animalInfo = input.split(" ")[2];
                crying.add(animalInfo);
            }

            for (String sound : sounds) {
                if (!crying.contains(sound)) {
                    sb.append(sound).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
