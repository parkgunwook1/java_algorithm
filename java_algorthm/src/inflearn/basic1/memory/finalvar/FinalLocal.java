package inflearn.basic1.memory.finalvar;

public class FinalLocal {

//    final int value = 10;     => 이미 변수에 값을 정의했으면 생성자에서도 값을 못바꾼다.
    final int value;        // 초기값이 없어서 생성자 값 세팅 가능하다.
    public static final int CONST_VALUE = 10;      // static final이 붙으면 변수명을 대문자로 하는 것이 관례이다.

    public FinalLocal(int value) {
        this.value = value;     // 이후에 값을 변경하는 것은 불가하다.
    }
}

/* final
*
* 최초 한번만 할당 가능하다. 할당 이후에 값을 변경하려고 하면은 컴파일 오류 발생한다.
*
* 상수(Constant)
*   - 상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다. 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값을 상수라한다.
*   - 이런 이유로 상수는 static final 키워드를 사용한다.
*
* 자바 상수 특징
*   - static final 키워드를 사용하고, 대문자를 사용하고 구분은 언더스코어로 한다. => 일반적인 상수와 구분하기 위함
*   - 필드를 직접 접근해서 사용한다. 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다.
*   - 상수는 값을 변경할 수 없다. 따라서 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않는다.
*
* final에 static을 붙이는 이유
*   - 10의 값이 매번 필요하면 인스턴스 마다 중복되는 10의 값을 메모리적으로 계속 중복되는 숫자를 만든다.
*   - 개발자 입장에서도 명백한 중복이며, 메모리에도 비효율 적이다.
*   - 그래서 static을 붙여준다. static 영역은 단 하나만 존재하는 영역이기 때문이다.
*       - 그럼으로 중복과 메모리 비효율 문제를 모두 해결할 수 있다.
* */

class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; => 컴파일 오류

        FinalLocal finalLocal1 = new FinalLocal(10);
        System.out.println(finalLocal1.value);

        FinalLocal finalLocal2 = new FinalLocal(20);
        System.out.println(finalLocal2.value);

        int constValue = FinalLocal.CONST_VALUE;

        method(2);

    }

    static int method(final int parameter) {
//        parameter = 20; 컴파일 오류

        return parameter;
    }
}