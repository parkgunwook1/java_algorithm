package study.extend;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + "zzz");
    }
}

class HouseDog extends Dog {

    // 생성자 오버로딩
    HouseDog(String name) {
        this.setName(name);
    }

    HouseDog(int type) {
        if (type == 1) {
            this.setName("1번");
        }else if (type == 2) {
            this.setName("2번");
        }
    }

    void sleep() {
        System.out.println(this.name + "zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + "zzz in house for" + hour + "hours");
    }
}

public class Sample {
    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog one = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(one.name);

        happy.sleep();
        one.sleep(3);
    }
}
