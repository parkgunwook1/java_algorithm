package StringReverse;

public class StringReverse {
    public static void main(String[] args) {

        // 문자열 뒤집기
        String str = "ABCDE";

        // 문자열을 뒤집은것을 담아줄 변수 생성
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("reverse = " + reverse);

        // StringBuffer reverse 메서드 사용
        String str1 = "ABCDE";
        StringBuffer sb = new StringBuffer(str1);
        String reverse1 = sb.reverse().toString();

        System.out.println(sb);
        System.out.println(reverse1);
    }

}
