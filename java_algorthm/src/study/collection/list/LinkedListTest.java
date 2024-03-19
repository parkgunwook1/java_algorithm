package study.collection.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    
    public static void main(String[] args) {

    /**
     * Linked List는 ArrayList와 같이 인덱스로 접근하여 조회/ 삽입이 가능하지만 내부 구조는 완전히 다르게 구성되어 있다.
     *
     * ArrayList는 내부적으로 배열을 이용하여 매서드로 이리저리 조작이 가능하게 만든 컬렉션이다.
     *
     * LinkedList는 노드(객체) 끼리의 주소 포인터를 서로 가리키며 링크(참조)함으로써 이어지는 구조이다.
     * */

        LinkedList<Integer> list = new LinkedList<>();

        // 초기값 설정
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,2));
        System.out.println("list2 = " + list2);

        LinkedList<String> list3 = new LinkedList<>(Arrays.asList("A", "B", "C"));

        // 가장 앞에 데이터 추가
        list3.addFirst("new");
        System.out.println("list3 = " + list3);

        // 가장 뒤에 데이터 추가
        list3.addLast("last");
        System.out.println("list3 = " + list3);

        // index 1에 중간 위치에 데이터 추가
        list3.add(1 , "1");
        System.out.println("list3 = " + list3);

        // 첫 번째 값 제거
        list3.removeFirst();
        System.out.println("list3 = " + list3);

        // 마지막 데이처 제거
        list3.removeLast();
        System.out.println("list3 = " + list3);

        // 인덱스 1  제거
        list.remove(1);

        // 모든 값 제거
        list.clear();
    }
}
