package inflearn.basic1.object_programming;

public class Result {

    /*
    * 객체지향 프로그래밍이 나오기 전까지는 데이터와 기능이 분리되어 있었다.
    * 그러면 데이터가 바뀌면 기능에 직접적인 변경이 필요했단. 의존성의 결합이 문제였던 것이다.
    *
    * 객체지향이 나오고 나서는 데이터와 기능을 구분했기 때문에 변경에 용이하다.
    *
    * 자바 같은 객체지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다.
    * 클래스 내부에 멤버 변수 뿐만 아니라 메서드도 함께 포함할 수 있다는 뜻이다.
    * */
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println(valueData.value);

        // 아래와 같이 기능과 데이터를 구분 하지 않고 ValueData 클래스에 기능과 데이터를 다 구현했다.

//        add(valueData);
//        add(valueData);
//        add(valueData);
//    }
//
//    static void add(ValueData valueData) {
//        valueData.value++;
//        System.out.println("숫자 증가 value" + valueData.value );
//    }
    }
}

class ValueData {
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}