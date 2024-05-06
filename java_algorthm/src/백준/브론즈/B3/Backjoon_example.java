package 백준.브론즈.B3;

import java.util.HashSet;
import java.util.Set;

public class Backjoon_example {



    private static int[] shuffle(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random()* arr.length);

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] sum = new int[original.length];
        for (int i = 1; i < original.length; i++) {
            System.out.print(i + "");
        }
        System.out.println(sum);

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

    }
}
