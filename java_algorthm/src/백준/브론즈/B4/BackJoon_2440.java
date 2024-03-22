package 백준.브론즈.B4;

import java.util.Scanner;

public class BackJoon_2440 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i ++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
