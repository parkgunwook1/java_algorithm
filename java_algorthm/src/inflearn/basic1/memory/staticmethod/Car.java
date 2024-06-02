package inflearn.basic1.memory.staticmethod;

public class Car {

    private String name;
    private static int totalCar;

    public Car(String name) {
        this.name = name;
        totalCar++;
    }

    public String getCar() {
        return name;
    }

    public static void getTotalCar() {
        System.out.println("총 구매한 차량 수는 ? " + totalCar);
    }
}

class MathArrayUtils {

    private MathArrayUtils() {
        // private 으로 인스턴스를 막는다.
    }

    public static void sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("합계는 : " + sum);
    }
}

class CarMain {

    public static void main(String[] args) {

        Car k3 = new Car("k3");
        System.out.println(k3.getCar());

        Car k5 = new Car("k5");
        System.out.println(k5.getCar());

        Car k7 = new Car("K7");
        System.out.println(k7.getCar());

        Car.getTotalCar();

        int[] a = {1, 5, 3, 2};
        MathArrayUtils.sum(a);
    }

}