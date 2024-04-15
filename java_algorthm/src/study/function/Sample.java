package study.function;


// java 8 버전부터 함수형 프로그래밍을 지원하기 위해 람다와 스트림이 도입되었다.
// 람다와 스트림을 사용하는 이유는 작성하는 코드의 양이 줄어들고 읽기 쉬운 코드를 만들 수 있기 때문이다.

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}
public class Sample {

    public static void main(String[] args) {
        Calculator mc = (a,  b) -> a + b;
        int result = mc.sum(3,4);
        System.out.println(result);
    }
}
