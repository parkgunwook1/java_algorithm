package 백준.브론즈.B5;

import java.util.Scanner;

public class gugudan {

    public static void main(String[] args) {
        // 구구단
        System.out.println("곱할 단을 입력해주세요");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 9; i++) {
            System.out.println( a + "*" + i + "=" + a * i);
        }
    }

}
