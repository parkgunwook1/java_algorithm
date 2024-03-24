package 백준.브론즈.B4;

import java.util.Scanner;

public class BackJoon_2480 {

    public static void main(String[] args) {

        // 1 ~ 6 까지 눈을 가진 3개의 주사위를 던진다.
        // 같은 눈이 3개가 나오면 10000원 + (같은눈) X 1000
        // 같은 눈이 2개가 나오면 1000원 + (같은눈) X 100
        // 모든 다른 눈이 나오면 (가장 큰 눈) X 100

        // 2,2,2 주어지면 상금은 10000 + 2 X 1000 = 12000원
        // 3,3,6 주어지면 상금은 1000 + 3 X100 = 1300원
        // 6,2,5 주어지면 가증 큰값 6 X 100 = 600


        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // 만약 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {
            int max;
            // 만약 a > b 라면
            if (a > b) {
                // c > a > b 라면
                if (c > a) {
                    max = c;
                }
                // a > (b, c)
                else {
                    max = a;
                }
            }
            // b > a 라면
            else {
                // c > b > a 라면
                if (c > b) {
                    max = c;
                }
                // b > (a, c)
                else {
                    max = b;
                }
            }
            System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
            // 3개의 변수가 모두 같은 경우
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            else {
                // a가 b혹은 c랑만 같은 경우
                if(a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                // b가 c랑 같은 경우
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }
    }
}

