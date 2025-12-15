package codingjudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_01_문자찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
        char ch = br.readLine().toLowerCase().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch ) {
                count++;
            }
        }

        System.out.println(count);
    }
}

