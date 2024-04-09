package study.classes;

class Animal {
        String name; // 객체변수

    public void setName(String name) {
        this.name = name;
    }
}

public class Sample {
    public static void main(String[] args) {

        // 객체 변수의 값은 독립적으로 유지된다.

        Animal cat = new Animal(); // cat 객체
        cat.setName("야옹");
        cat.name = "옹야";
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("멍멍");
        System.out.println(dog.name);
    }
}
