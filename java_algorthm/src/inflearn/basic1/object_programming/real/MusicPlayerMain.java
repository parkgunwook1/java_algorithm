package inflearn.basic1.object_programming.real;

public class MusicPlayerMain {


    /*
    * MusicPlayer 객체를 생성하고 필요한 기능을 호출하기만 하면 된다. 필요한 모든 것은 MusicPlayer 안에 들어 있다.
    *
    * 즉, MusicPlayer를 사용하는 입장에서는 MusicPlayer의 데이터인 volume, isOn 같은 데이터는 전혀 사용하지 않는다.
    * MusicPlayer를 사용하는 입장에서는 이제 MusicPlayer 내부에 어떤 속성이 있는지 전혀 몰라도 된다.
    * MusicPlayer를 사용하는 입장에서는 단순하게 MusicPlayer가 제공하는 기능 중에 필요한 기능을 호출해서 사용하기만 하면 된다.
    *
    * MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
    * 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다.
    *
    * 프로그래밍을 짤 때 중요한것은 속성과 기능을 어떻게 하나의 클래스로 잘 만들지가 중요한 것이다.
    * */
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.on();
        musicPlayer.down();
        musicPlayer.up();
        musicPlayer.up();
        musicPlayer.up();
        musicPlayer.ObjectStatus();
    }

}
