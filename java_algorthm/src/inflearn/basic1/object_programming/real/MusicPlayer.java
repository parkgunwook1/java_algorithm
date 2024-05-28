package inflearn.basic1.object_programming.real;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off() {
        isOn = false;
        System.out.println("픔악 플레이어를 종료합니다.");
    }
    void up() {
        volume++;
        System.out.println("볼류 증가 : " + volume);
    }
    void down() {
        volume--;
        System.out.println("볼륨 다운 : " + volume);
    }
    void ObjectStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn == false) {
            System.out.println("음악 플레이 종료된 상태");
        } else {
            System.out.println("음악 플레이어 재생중, 불륨 : " + volume);
        }
    }
}
