package 백준.브론즈.B5;

import java.util.Scanner;

public class Stars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");

        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= a; i++) {
            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
