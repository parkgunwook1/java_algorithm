package study.abstractclass;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추상 메서드 : 서브 클래스에서 구현해야 함
    public abstract void makeSound();
}
