package inflearn.basic1.poly.basic;

public class Parent {

    public void parentMethod() {
        System.out.println("parent method");
    }
}

class Child extends Parent {

    public void childMethod() {
        System.out.println("child method");
    }
}

/*
* 부모 클래스는 자식 클래스의 메서드에 접근이 불가하다. 단, 자식 클래스는 부모 클래스의 메서드에 접근이 가능하며 본인의 메서드도 접근이 가능하다.
* 부모 타입은 자식 타입을 담을 수 있다. 단, 자식 타입은 부모 타입을 담을 수 없다.
*
* 자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다. 이것이 바로 다양한 형태를 참조할 수 있다고
* 해서 다형적 참조라 한다.
*
* */


class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent1 = new Parent();
        parent1.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
//        poly.childMethod();   // 부모 타입의 클래스는 부모 것만 가지고 있다. 호출불가!! 자식의 타입을 호출 불가.
        // 이런 경우 childMethod() 를 호출하고 싶으면 캐스팅이 필요하다.

//        Child child1 = new Parent();  // 자식은 부모를 담을 수 없다.

    }
}