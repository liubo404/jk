package algorithm.sorts;

import java.util.Arrays;

public class InsertionSorts {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] a = {6,5,4,3,2,1};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i -= 1;
            }
            arr[i+1] =key;
        }
    }
}
