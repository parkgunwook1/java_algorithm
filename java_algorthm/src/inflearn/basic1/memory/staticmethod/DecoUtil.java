package inflearn.basic1.memory.staticmethod;

public class DecoUtil {

    public static String deco(String str) { // 정적 메서드
        return "*" + str + "*";
    }
}

/* 클래스 메서드
*
* 메서드 앞에도 static 붙일 수 있다. 이것을 정적 또는 클래스 메서드라 한다.
* 정적 메서드라는 용어는 static이 정적이라는 뜻이기 때문이고, 클래스 메서드라는 용어는 인스턴스 생성 없이 마치 클래스에 있는
* 메서드를 바로 호출하는 것 처럼 느껴지기 때문이다.
*
* 인스턴스 메서드
*   - static이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다. 이것을 인스턴스 메서드라 한다.
* */

/* 클래스 메서드
*
* 정적 메서드는 객체 생성없이 클래스에 있는 메서드를 바로 호출할 수 있다는 장점이 있다.
* 하지만 정적 메서드는 언제나 사용할 수 있는 것은 아니다.
*
*  *정적 메서드 사용법*
*   - static 메서드는 static만 사용할 수 있다.
*   - 클래스 내부 기능을 사용할 때, 정적 메서드는 static이 붙은 정적 메서드나 정적 변수만 사용할 수 있다.
*   - 클래스 내부의 기능을 사용할 대, 정적 메서드는 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다.
*   - 정적 메서드는 공용 기능이다. 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static을 호출할 수 있다.
*
* */

class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; => 접근 불가
//        instanceMethod();  => 접근 불가.

        staticValue++;  // static 메소드는 static 자원만 접근 가능하다.
    }

    public void instanceCall() {
        instanceValue++;    // 인스턴스 접근
        staticValue++;  // 정적 변수 접근


        staticCall();   // 정적 메서드 접근
    }

    public static void staticInstanceCall(DecoData decoData) {
        decoData.instanceValue++;
        decoData.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue : " + instanceValue);
    }

}

class DecoMain {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil.deco(s);

        System.out.println(s);
        System.out.println(deco);

        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        decoData.staticInstanceCall(decoData);

    }
}

