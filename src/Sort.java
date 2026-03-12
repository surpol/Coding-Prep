public class Sort {

    /*3. ☐ Implement Bubble Sort
    Explanation: Swap adjacent out-of-order elements repeatedly.
    Example: [5,1,4,2,8] → [1,2,4,5,8] */

    public static int[] bubble(int[] arr) {
        //  for (i = 1)
        //      while (i < i - 1) swap(i, i - 1);

        //  private static int[] swap (int[] arr, target){
        //      temp = arr[target];
        //      arr[target-1] = arr[target] ;
        //      arr[target] = arr[target-1];
        for (int i = 1 ; i <arr.length; i++)  {
            int k = i;
            while (k > 0 && arr[k] < arr[k - 1]) {
                swap(arr, k);
                k--;
            }
        }

        return arr;
    }

    /*4. ☐ Implement Selection Sort
    Explanation: Select the minimum each pass and place at front.
            Example: [64,25,12,22,11] → [11,12,22,25,64]*/

    public static int[] selection(int[] arr) {
        // loop list
        //  find min num (loop)
        //      if curr != min num ; swap;
        //
        for (int i = 0; i < arr.length; i++) {
            int min = findMin(arr, i);
            if (arr[i] != arr[min]) {
                swap(arr, min, i);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int target) {
        int temp = arr[target - 1];
        arr[target-1] = arr[target] ;
        arr[target] = temp;
    }
    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2] ;
        arr[i2] = temp;
    }

    private static int findMin(int[] arr, int start) {
        int maxValue = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = start; i <arr.length; i++) {
            if (arr[i] < maxValue) {
                maxValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /* 5. ☐ Implement Insertion Sort
    Explanation: Insert each element into the sorted prefix.
            Example: [12,11,13,5,6] → [5,6,11,12,13]*/

    public static int[] insertion(int[] arr) {

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 5, 1};
        int[] arr2 = new int[]{3, 4, 2, 5, 1, 0};

        // Bubble Sort
        arr = bubble(arr);
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println("----");
        // SelectionSort
        arr2 = selection(arr2);
        for (int j : arr2 ) {
            System.out.println(j);
        }


    }
}
