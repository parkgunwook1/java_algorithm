package inflearn.basic1.poly.basic;
public class CastingMain {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();


        // 다운캐스팅(부모 타입 -> 자식 타입)    : 자식 타입으로 변경
        Child child = (Child) poly;     // Child child = Parent poly의 참조값이 대입된다.
        // 참고로 캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것이 아니고 해당 참조값을 꺼내고 꺼낸 참조값이 Child 타입이 되는 것이다.
        child.childMethod();
        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();


        // 업 캐스팅  : 부모 타입으로 변경
        Child child1 = new Child();
        Parent parent1 = (Parent) child1;    // 업케스팅은 생략 가능, 생략 권장한다.
        Parent parent2 = child1;            // 업케스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();

        /*
        * 업케스팅은 생략할 수 있고, 다운캐스팅은 생략할 수 없다. 참고로 업케스팅은 매우 자주 사용하기 때문에 생략을 권장한다.
        * 자바에서 부모는 자식을 담을 수 있다. 하지만 그 반대는 안된다. (꼭 필요하다면 다운캐스팅을 해야 한다.)
        *
        * 업케스팅은 생략해도 되고, 다운캐스팅은 왜 개발자가 직접 명시적으로 캐스팅을 해야할까?
        * */

        // 다운캐스팅을 자동으로 하지 않는 이유
        Parent parent3 = new Child();
        Child child2 = (Child) parent3;
        child2.childMethod();       // 호출됨.

        Parent parent4 = new Parent();   // Parent만 생성하기 때문에 parent 인스턴스의 자원들만 생성된다. 자식 타입은 전혀 존재하지 않는다.
                                        //  메모리상 자식 타입 자체가 존재하지 않는다.
        Child child3 = (Child) parent4; // 런타임 오류 - ClassCastException
        child3.childMethod();   // 실행 불가

        /* 다형성 오버라이딩
        *
        * 오버라이딩 된 메서드는 항상 우선권을 가진다. 오버라이딩은 부모 타입에서 정의한 기능을 자식 타입에서 재정의 하는 것이다.
        * 만약 자식에서도 오버라이딩 하고 손자에서도 같은 메서드를 오버라이딩을 하면 손자의 오버라이딩 메서드가 우선권을 가진다.
        * 더 하위 자식의 오버라이딩 된 메서드가 우선권을 가진다.
        *
        * 단, Parent parent = new Parent() 는 안된다. why? -> parent 인스턴스만 가지고 있기 때문이다.
        *     Parent parent = new Child() 는 가능하다. 자식 인스턴스도 메모리에 같이 올라온다. 이러면 자식 타입에서 부모 클래스의 메서드를 오버라이딩 했으면 그 메서드가 호출된다.
        *
        * 메서드 오버라이딩은 절대적으로 우선권을 가진다.
        *
        *   - 다형적 참조 : 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
        *   - 메서드 오버라이딩 : 기존 기능을 하위 타입에서 새로운 기능으로 재정의
        * */


        /* 업케스팅이 안전하고 다운캐스팅이 위험한 이유
        *
        * - 업캐스팅의 경우 위와 같은 문제가 절대로 발생하지 않는다. 왜냐하면 객체를 생성하면 타입의 상위 부모 타입은 모두 함께 생성된다.
        * - 따라서 위로만 타입을 변경하는 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 항상 안전하다. 따라서 캐스팅 생략할 수 있다.
        *
        * - 반면에 다운캐스팅의 경우 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있다. 왜냐하면 객체를 생성하면 부모 타입은
        *   모두 함께 생성되지만 자식 타입은 생성되지 않는다.
        * - 따라서 개발자가 이런 문제를 인지하고 사용해야 한다는 의미로 명시적으로 캐스팅을 해주어야 한다.
        * */

        /*instancof
        *
        * 다형성에서 참조형 변수는 이름 그대로 다양한 자식을 대상으로 참조할 수 있다. 그런데 참조하는 대상이 다양하기 때문에 어떤 인스턴스를
        * 참조하고 있는지 확인하려면 instanceof 키워드 를 사용하면 된다.
        * */

        Parent parent5 = new Parent();
        System.out.println("parent5 호출");
        call(parent5);

        Parent parent6 = new Child();
        System.out.println("parent6 호출");
        ((Child)parent6).childMethod();
        call(parent6);
    }
        private static void call(Parent parent) {
            parent.parentMethod();
            if (parent instanceof Child child) {  // parent가 Child 인스턴스면
                System.out.println("Child 인스턴스 맞음");
//                Child child = (Child) parent;
                child.childMethod();
            }
        }
}
