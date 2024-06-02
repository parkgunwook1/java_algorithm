package inflearn.basic1.memory.staticvar;


public class Data {
    public String name;
    public static int count;    // 메서드 영역에서 관리하고, 클래스 변수 사용하면 값을 공유할 수 있다.

    public Data(String name) {
        this.name = name;
        count++;
    }
}

/* static 변수 용어 정리
*
* 인스턴스 변수 : static이 붙지 않은 멤버 변수
*   - static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다.
*   - 인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어진다.
*
* 클래스 변수   : static이 붙은 멤버 변수
*   - static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다.
*   - 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
*
* static이 정적이라는 이유는 힙 영역에 생성되는 인스턴스 변수는 동적으로 생성되고, 제거된다.
* 반면에 static인 정적 변수는 거의 프로그램 실행 시점에 만들어지고, 프로그램 종료 시점에 제거된다. 정적 변수는 이름 그대로 정적이다.
*
* 정적 변수의 경우 인스턴스를 통한 접근은 추천하지 않는다. 코드를 읽을 때 마치 인스턴스 변수에 접근하는 것 처럼 오해할 수 있기 때문이다.
* */

class DataMain {
    public static void main(String[] args) {
        Data data1 = new Data("park");
        System.out.println("data1 count = " + Data.count + data1.name);

        Data data2 = new Data("gun");
        System.out.println("data1 count = " + Data.count + data2.name);


    }
}
