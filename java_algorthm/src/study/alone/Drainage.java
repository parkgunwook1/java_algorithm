package study.alone;

import java.util.ArrayList;
import java.util.HashSet;

class SampleTest {

    static ArrayList<Integer> arrayList = new ArrayList<>();

    static void baesu(int a, int b) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                hashSet.add(i);
            }
        }
        arrayList.addAll(hashSet);
    }

    public static class Drainage {

        public static void main(String[] args) {
            // 10 미만의 3과 5의 배수를 구하시오
            SampleTest.baesu(3, 5);
            System.out.println(SampleTest.arrayList);


        }
    }
}
