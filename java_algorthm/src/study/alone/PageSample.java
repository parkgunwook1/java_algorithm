package study.alone;

class SampleTest1 {

    static int getTotalPage(int t, int p) {
        if (t % p == 0) {
            return t / p;
        } else {
        return t / p + 1;
        }
    }
}

public class PageSample {
    // 페이징을 하는데 총 보여질 페이지 개수 10개
    // 총 페이지 개수 15개
    public static void main(String[] args) {

    SampleTest1 sm = new SampleTest1();
    System.out.println(SampleTest1.getTotalPage(10,24));
    }
}
