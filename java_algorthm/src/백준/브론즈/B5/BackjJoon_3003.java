package 백준.브론즈.B5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackjJoon_3003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chess[] = {1,1,2,2,8};
        int input[] = new int[6];
        for (int i = 0; i<chess.length; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i<chess.length; i++) {
            System.out.print(chess[i]- input[i] + " ");
        }




    }
}
