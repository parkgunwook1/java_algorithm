package 백준.브론즈.B5;

import java.util.Scanner;

public class NumberDifferent {

    public static void main(String[] args) {

        // 수를 두개 입력받고 맞는 문자열 출력.
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 비교합니다.");

        System.out.println("a를 입력해주세요");
        int a = sc.nextInt();
        System.out.println("b를 입력해주세요");
        int b = sc.nextInt();

        System.out.println((a > b) ? ">" : (a < b) ? "<" : "==");

    }
}
