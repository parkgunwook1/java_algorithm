package study.alone;


import java.util.Scanner;

class Sample {

    static void gugu(int a) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }
}
public class gugudan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Sample.gugu(sc.nextInt());


    }
}
