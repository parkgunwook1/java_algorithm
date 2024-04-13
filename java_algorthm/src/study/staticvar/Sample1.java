package study.staticvar;


class Singleton {
    private static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(one==null) {
            one = new Singleton();
        }
        return one;
    }
}

public class Sample1 {

    // 싱글톤패턴
    // Singleton 클래스에 one 이라는 static 변수를 작성하고, getInstance 메서드에서 one 값이 null인 경우에만
    // 객체를 생성하도록 하여 one 객체가 딱 한 번만 만들어지도록 했다.
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);  // true 출력
    }
}
