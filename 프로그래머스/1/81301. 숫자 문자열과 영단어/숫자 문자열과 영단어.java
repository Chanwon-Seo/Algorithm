import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int solution(String s) {
        String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] str_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < str_arr.length; i++) {
            if (s.contains(str_arr[i])) {
                s = s.replace(str_arr[i], arr[i]);
            }
        }
        return Integer.parseInt(s);
    }
}