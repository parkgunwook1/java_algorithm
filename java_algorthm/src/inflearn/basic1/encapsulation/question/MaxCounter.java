package inflearn.basic1.encapsulation.question;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행로직
        count++;
    }
    public int getCount() {
        return count;
    }
}

class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
