package study.fortowhile;

public class WhileSample_1 {

    public static void main(String[] args) {

        int coffee = 10;
        int money = 300;
        int totalMoney = 0;

        while (money > 0) {
            totalMoney += 100;

            System.out.println("100원을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");

            if (coffee == 0) {
                System.out.println("커피가 다 떨여졋습니다. 판매를 중지합니다.");
                break;
            }
        }

        System.out.println("총 입금된 금액은 " + totalMoney + "원 입니다.");
    }
}
