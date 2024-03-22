package 백준.브론즈.B4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BackJoon_5532 {

    // 방학은 L일, 수학은 B, 국어는 A, 국어 최대 c, 수학 최대 D
    // 놀 수 있는날 최대값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        //국어와 수학 문제를 다 푸는데 걸리는 최대 일수를 구하기 위한 변수를 선언한다.
        int count = 0;

        //문제를 푸는데 반복 횟수 지정을 할 수 없으니 무한 루프로 돌리고 다 풀었을때 반복문을 탈출한다.
        while(true) {
            if(A <= 0 && B <= 0) {
                break;
            }
            A -= C;
            B -= D;
            count++;
        }
        //최대 일수(count)를 구했으면 그걸 방학 기간에서 뺸다.
        System.out.println(L - count);

    }

}
