package study.classes;

public class MethodSample {
    int sum(int a, int b) { // 매개변수
        return a + b;
    }

    String say() {
        return "hi";
    }

    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return; // 바보 문자열이 들어오면 메서드 빠져나간다. , void 메서드만 가능하다.
        }
        System.out.println("나의 별명은" + nick +"입니다.");
    }

    void tosay() { // 입력, 출력값 모두 없는 메서드
        System.out.println("hiyou");
    }

    void min(int a, int b) { // 리턴값이 없는 메서드는 명시적으로 리턴 자료형 부분에 void라고 표기한다.
        System.out.println(a - b); // 문장일뿐 리턴값은 없다.
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        MethodSample sample = new MethodSample();
        int c = sample.sum(a,b); // 인수

        sample.min(3,6);
        sample.tosay();

        sample.sayNick("바보");
        sample.sayNick("멍청이");


        System.out.println(c);
        System.out.println(sample.say());
    }
}
