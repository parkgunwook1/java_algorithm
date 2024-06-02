package inflearn.basic1.method;

public class MethodEx3 {
    public static void main(String[] args) {

        int balance = 10000;
        balance = bank(1000, balance, "+");
        System.out.println(balance);
        balance = bank(2000 , balance, "-" );
        System.out.println(balance);

    }

    public static int bank(int amount, int balance, String b) {

        if (b.equals("+")) {
            balance += amount;
            return balance;
        } else if (b.equals("-")) {
            if (balance >= amount) {
                balance -= amount;
            }
            return balance;
        } else {
            System.out.println("잘못 입력했습니다.");
        }
        return 0;
    }
}
