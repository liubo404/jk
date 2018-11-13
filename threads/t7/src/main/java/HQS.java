import java.util.Arrays;

public class HQS {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 2, 5,1, 4, 7, 6};
//        int[] arr = new int[]{3, 8, 5, 2, 4, 1, 6, 7};
//        int[] arr = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0,arr.length-1);
//        forwardScanSort(arr, 0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static  void forwardScanSort(int[] items, int start, int end) {
        if (start < end) {
            int i = forPartition(items, start, end);
            forwardScanSort(items, start, i - 1);
            forwardScanSort(items, i + 1, end);
        }
    }



    private static void quickSort(int[] arr, int left, int right) {

        if(left<right){
            int p = partition(arr,left,right);
            quickSort(arr,   left,p - 1);
            quickSort(arr, p + 1,right );
        }


    }

    private static int forPartition(int[] items, int start, int end) {
        int pivot = items[start];
        int i = start, j = start + 1;
        while (j <= end) {
            if (items[j] < pivot) {
                i++;
                swap(items, i, j);
            }
            j++;
        }
        swap(items, start, i);
        return i;
    }


    private static int partition(int[] arr,  int start, int end) {
        System.out.println("befor="+Arrays.toString(arr));

        int p = arr[start];
        System.out.println("p="+p);
        int i = start  ;
        for (int j = start+1;j<=end;j++){
            if(arr[j]<p){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,start,i);
        System.out.println("after="+Arrays.toString(arr));
        return i ;
    }

    private static void swap(int[] arr, int left, int i) {
        int t = arr[left];
        arr[left]=arr[i];
        arr[i]=t;
    }

}
