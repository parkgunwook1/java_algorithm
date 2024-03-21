package 백준.브론즈.B5;

import java.util.Scanner;

public class ExamRecord {

    public static void main(String[] args) {

        // 시험 점수 입력받아 a , b, c, d, f 출력

        Scanner sc = new Scanner(System.in);

        System.out.println("시험 성적을 입력해주세요.");

        int score = sc.nextInt();

        // 삼항 연산자 이용
        System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");


//        if (score >= 90) {
//            System.out.println("A");
//        }else if(score >= 80) {
//            System.out.println("B");
//        }else if (score >= 70) {
//            System.out.println("C");
//        }else if(score >= 60){
//            System.out.println("D");
//        }else {
//            System.out.println("F");
//        }
    }
}
