package study.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<String> listA = new ArrayList<>();

        // add 값 추가.
        listA.add("김삿갓");
        // 인덱스로 값을 추가하는 것이 아니라 0번째 요소 "김삿갓"이 뒤로 밀린다.
        listA.add(0,"홍길동");
        listA.add(2, "김남길");

        System.out.println("listA = " + listA);
        
        // get 값 꺼내온다.
        String name = listA.get(1);
        System.out.println("name = " + name);
        
        // Iterator 전체 조회
        Iterator<String> iterator = listA.iterator();
        
        while (iterator.hasNext()) {
            String name1 = iterator.next();
            System.out.println("name1 = " + name1);
        }
        System.out.println(" =========== " );
        
        for (Object object : listA) {
            String name2 = (String) object;
        System.out.println("name2 = " + name2);
        }

        // 홍길동 앞에 값 추가
        int index = listA.indexOf("홍길동");
        listA.add(index, " 홍길동 앞에 값 추가요");

        // 값 삭제
        System.out.println("listA.remove(0) = " + listA.remove(0));
        System.out.println("listA.remove() = " + listA.remove("김남길"));

        // 값 확인
        System.out.println("listA.contains() = " + listA.contains("홍길동"));
    }
}
