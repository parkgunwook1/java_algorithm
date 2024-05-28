package inflearn.basic1;

public class Student {

    // 배열 사용의 한계점과 클래스의 존재

    public static void main(String[] args) {

        String[] studentNames = {"학생1" , "학생2", "학생3"};
        int[] age = {14,12,11};
        int[] score = {89,90,79};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + age[i] + score[i]);
        }

        // 결론부터 말하면 사람한테 정말 안좋은 코드다. 지금은 3줄의 데이터만 나와서 그렇지 100개가 되면 배열로 관리하는데에 한계가 있다.
        // 배열의 한계는 학생 1의 정보를 수정하고 싶으면 학생 1의 인덱스를 정확히 찾아서 수정을 해야하는 한계가 있다.
        // 배열을 극복하려면 list를 사용할 수도 있고, 클래스를 사용해도 될 것이다.


        // 위의 문제점을 아래와 같이 개선할 수 있다. 훨씬 구조적으로 변경 되었고, 사람이 관리하기에도 효율적이다.
        // 클래스는 설계도이고, 실제 메모리에 만들어진(student1, student2) 실체를 객체 또는 인스턴스라 한다.
        ChaneStudent student1 = new ChaneStudent();
        student1.name = "학생1"; // 참조값 접근 => 참조값.도트 연산자 필드명
        student1.age = 15;
        student1.grade = 90;

        // 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값 주소를 반환한다.
        // 그러면 student2 는 참조값을 보관한다. 따라서 이 변수를 통해 객체를 접근할 수 있다.
        ChaneStudent student2 = new ChaneStudent();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        System.out.println(student1.name + student1.age + student1.grade);
        System.out.println(student2.name + student2.age + student2.grade);

        System.out.println(student1); // 참조값 1 => inflearn.basic1.ChaneStudent@5f184fc6
        System.out.println(student2); // 참조값 2 => inflearn.basic1.ChaneStudent@3feba861

        // 위의 클래스에는 배열을 도입 안해서 아쉬운점이 있다. 그래서 객체를 배열로 만들어보는 과정을 봐보자.
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다 라는 것을 머리에 박아놔
        ChaneStudent[] students = new ChaneStudent[2];
        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {
            ChaneStudent s = students[i];
            System.out.println(s.name + s.age + s.grade);
        }
        for (ChaneStudent s : students) {
            System.out.println(s.name + s.age + s.grade);
        }


        ProductOrder[] productOrder = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        productOrder[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        productOrder[1] = order2;


        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
       productOrder[2] = order3;

        int sum = 0;

        for (ProductOrder p : productOrder) {
            System.out.println(p.productName + p.price + p.quantity);
            sum += p.price * p.quantity;
        }
        System.out.println("총 가격 :" + sum  );


    }
}
class ChaneStudent {
    String name;
    int age;
    int grade;

    // 위와 같이 정의한 변수들은 멤버 변수, 또는 필드라 한다.
}

class ProductOrder {
    String productName;
    int price;
    int quantity;
}
