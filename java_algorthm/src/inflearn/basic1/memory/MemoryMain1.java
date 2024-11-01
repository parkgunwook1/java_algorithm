package inflearn.basic1.memory;

public class MemoryMain1 {

    /* 자바 메모리 구조
    *
    * 자바 메모리 구조는 크게 메서드 영역, 스택 영역, 힙 영역 3개로 나눌 수 있다.
    *
    * 메서드 영역 : 클래스 정보를 보관한다.
    * 스택 영역   : 실제 프로그램이 실행되는 영역이다. 메서드를 실행할 때 마다 하나씩 쌓인다.
    * 힙 영역     : 객체(인스턴스)가 생성되는 영역이다. new 명령어를 사용하면 이 영역을 사용한다. 참고로 배열도 이 영역에 생성된다.
    * */

    /* 메모리 구조 실제
    *
    * 메서드 영역
    *   - 클래스의 실행코드(바이트 코드), 필드, 메서드와 생성자 코드 등 모든 실행 코드 존재
    *   - static 영역: static 변수들을 보관한다.
    *   - 런타임 상수 풀 : 프로그램 실행하는데 필요한 공통 리터럴 상수 보관
    *
    * 스택 영역
    *   - 자바 실행 시, 하나의 실행 스택이 생성된다. 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 등을 포함한다.
    *   - 스택 프레임 : 스택 영역에 쌓이는 네모 박스가 하나의 스택 프레임이다. 메서드를 호출할 때마다 하나의 스택 프레임이 쌓이고,
    *                 메서드가 종료되면 해당 스택 프레미이 제거된다.
    *
    * 힙 영역
    *   - 객체(인스턴스)와 배열이 생성되는 영역이다. 가비지 컬렉션이 이루어지는 주요 영역이며, 더이상 참조되지 않은 객체는 GC 제거된다.
    *
    * 참고
    *   - 스택 영역은 더 정확히는 각 쓰레드별로 하나의 실행 스택이 생성된다. 따라서 쓰레드 수만큼 스택 영역이 생성된다. 지금은 쓰레드를
    *      1개만 사용하므로 스택 영역도 하나이다.
    * */

    /* 스택과 큐 자료규조
    *
    * 우선, 자료구조는 데이터를 어떻게 보관하고 관리하는지에 대한 구조를 말하는 것이다.
    *
    * "스택"은 LIFO 이다. 나중에 들어간 것이 먼저 나온다. 즉, 들어가는 곳 나가는 곳의 입구가 똑같고 후입 선출이다.
    *
    * "큐"는 FIFO 이다. 먼저 들어간 것이 먼저 나온다. 들어가는 입구와 나가는 입구가 따로 있다고 생각하면 된다.
    *
    * */

    public static void main(String[] args) {
        System.out.println("main statt");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }
    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
