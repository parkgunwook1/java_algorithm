package inflearn.basic1.object_programming.question;

public class Account {

    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println( amount + "원 , 입금 되었습니다.");
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount  + "원 출금 되었습니다.");
        } else {
            System.out.println("지금 잔액은 , " + balance + "임으로 출금이 안됩니다.");
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(5000);
    }
}








