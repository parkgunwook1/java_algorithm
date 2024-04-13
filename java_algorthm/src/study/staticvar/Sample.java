package study.staticvar;


class HouseLee {
//    String lastname = "이";
    static String lastname = "이";
    // static 을 사용해 메모리 낭비를 줄일 수 있다.


    // static count 임으로 값이 공유된다.
    static int count = 0;
    HouseLee() {
        count++;
        System.out.println(count);
    }

    public static int getCount() {
        return count;
    }
}

public class Sample {

    public static void main(String[] args) {

    HouseLee lee2 = new HouseLee();
    HouseLee lee1 = new HouseLee();
    // HouseLee 클래스를 만들고 객체를 생성하면 객체마다 객체 변수 lastname을 저장하기 위한 메모리가 별도로 할당된다.

    HouseLee c1 = new HouseLee();
    HouseLee c2 = new HouseLee();

        System.out.println(HouseLee.getCount()); // 스태틱 메서드는 클래스를 이용하여 호출


    }

}
