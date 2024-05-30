package inflearn.basic1.encapsulation;

public class BankAccount {

    /* 캡슐화
    *
    * 필드(데이터)들은 대부분 private 으로 숨겨라.
    * 메소드(기능) 들은 외부에서 사용할 것들 빼고 내부 private 으로 숨겨라.
    *
    * 예)
    * 자동차를 운전하기 위해 자동차가 제공하는 복잡한 엔진 조절 기능, 배기 기능까지 우리가 알 필요는 없다. 단지 액셀과
    * 핸들 정도의 기능만 알면 된다. 만약, 사용자에게 세세한 기능까지 모두 알려준다면 사용자가 알아야 할 내용이 너무 많다.
    *
    *  잘 짜여진 소프트웨어는 필요한 기능만 public 으로 하고, 나머지는 private 으로 캡슐화 하는 것이 좋은 설계이다.
    *  즉, 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다.
    *
    * 접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하는 것은 물론이고, BankAccount를 사용하는 개발자 입장에서 해당 기능을
    * 사용하는 복잡도도 낮출 수 있다.
    * */

    private int balance;

    public BankAccount() {
        balance = 0;
    }

//    public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액이다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount > 0) {
            balance -= amount;
        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족하다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0 보다 커야 정상적인 금액
        return amount > 0;
    }
}

class BanckAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(9000);
        System.out.println("balnce = " + account.getBalance());
    }
}
