package study.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class StreamSample {

    public static void main(String[] args) {
        int[] data = {5,6,4,2,1,3,4,5};

        int [] result = Arrays.stream(data) // IntStream을 생성
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  // 짝수만 뽑아낸다.
                .distinct()     // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)    // Stream<Integer>를 IntStream으로 변경한다.
                .toArray();  // int[] 배열로 반환한다.

 /*       // 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }

        // Set 특징을 활용한 중복제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        // Set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        // 역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());

        // Integer 리스트를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);*/
        }
    }

