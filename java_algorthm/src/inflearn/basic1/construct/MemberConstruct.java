package inflearn.basic1.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name,age,50); // => 아래에 있는 매개변수 3개 생성자 호출한다.
    }

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
/* 생성자 장점
*
*   - 생성자가 없으면 메서드를 직접 한번 더 호출해야 하는데 생성자를 사용하므로써 인스턴스 생성하면서 인자를 넘긴다.
*   - 생성자를 사용하면 생성자에 있는 인자를 필수로 넘겨야 하는 규칙이 있음으로 실수를 할 확률이 없다.
*       즉, 생성자를 사용하면 필수값 입력을 보장할 수 있다.
* */

class ConstructMain1 {
    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("park", 15, 90);
        MemberConstruct member2 = new MemberConstruct("parks", 12, 100);
        MemberConstruct member3 = new MemberConstruct("parks", 12);

        MemberConstruct[] member = {member1, member2, member3};

        for (MemberConstruct s : member)
                System.out.println(s.age + s.name + s.grade);
    }
}