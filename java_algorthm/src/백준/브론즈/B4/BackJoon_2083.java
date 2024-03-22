package 백준.브론즈.B4;

import java.util.Scanner;

public class BackJoon_2083 {

    public static void main(String[] args) {
        // 나이가 17세보다 많거나, 몸무게가 80kg 이상이면 성인부, 그 밖에는 청소년부
        // 성인부는 Senior , 청소부 Junior


        Scanner sc = new Scanner(System.in);

        while (true) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            int weight = sc.nextInt();

            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }
            if (age > 17 || weight >= 80) {
                System.out.println(name + "Senior");
            } else {
                System.out.println(name + "Junior");
            }
        }

    }
}
