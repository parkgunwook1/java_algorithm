package 백준.브론즈.B5;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.print(" 숫자를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 400 == 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }


    }
}
