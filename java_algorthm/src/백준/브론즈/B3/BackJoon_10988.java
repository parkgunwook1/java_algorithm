package 백준.브론즈.B3;

import java.util.Scanner;

public class BackJoon_10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.next();
        sc.close();
        int len = str.length();
        int ans = 1;

        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i)!=str.charAt(len-1-i)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
