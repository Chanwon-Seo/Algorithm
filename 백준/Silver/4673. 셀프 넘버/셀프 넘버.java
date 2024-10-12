public class Main {
    static StringBuilder sb = new StringBuilder();

    static int maxNum = 10_001;

    public static void main(String[] args) {
        boolean[] check = new boolean[maxNum];

        for (int i = 1; i <= maxNum; i++) {
            int num = d(i);
            if (num < maxNum) check[num] = true;
        }

        for (int i = 1; i < maxNum; i++) {
            if (!check[i]) sb.append(i).append("\n");
        }
        System.out.print(sb);
    }

    static int d(int number) {
        int dNumber = number;

        while (number != 0) {
            dNumber = dNumber + (number % 10);
            number = number / 10;
        }
        return dNumber;
    }
}