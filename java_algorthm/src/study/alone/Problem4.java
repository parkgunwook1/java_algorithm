package study.alone;

public class Problem4 { // public 을 쓸때는 클래스명과 파일명이 같아야함.
    static int getCharCount(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getCharCount("점프 투 자바"));
        System.out.println(getCharCount("점프 투 자바의 연습문제 풀이"));
    }
}
