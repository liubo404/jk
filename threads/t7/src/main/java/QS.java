import java.util.Arrays;

/**
 *
 */
public class QS {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 5, 2, 4, 1, 6, 7};

        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (r > l) {
            int p = partition(arr, l, r);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int p = arr[l];
        int i = l +1;
        for(int j =l+1; j <r;j++){
            if(arr[j] < p){
                swap(arr,j,i);
                i++;
            }
        }

        swap(arr,l,i);
        return i ;
    }

    private static void swap(int[] arr, int l, int i) {
        int t = arr[l];
        arr[l]=arr[i];
        arr[i]=t;
    }


}
