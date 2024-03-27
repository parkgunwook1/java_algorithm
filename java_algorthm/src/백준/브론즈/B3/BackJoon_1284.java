package 백준.브론즈.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon_1284 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String N = br.readLine(); // "120"
            int length = 1;

            if (N.equals("0")) {
                break;
            }
            for (int i = 0; i < N.length(); i++) {
                if (N.charAt(i) == '1') {
                    length += 3;
                }else if (N.charAt(i) == '0') {
                    length += 5;
                }else {
                    length += 4;
                }
            }
            System.out.println(length);
        }

    }
}
