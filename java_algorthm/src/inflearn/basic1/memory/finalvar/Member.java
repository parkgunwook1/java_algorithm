package inflearn.basic1.memory.finalvar;

public class Member {

    private final String id;        // 아이디 값은 바뀌면 안되니 final로 정의한다.
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("id : " + id + "name :" + name + "입니다." );
    }
}

class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("pkw" , "박건욱");
        member.print();
        member.changeData("건");
        member.print();
    }
}
