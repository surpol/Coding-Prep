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

    private static void swap(int[] arr, int target) {
        int temp = arr[target - 1];
        arr[target-1] = arr[target] ;
        arr[target] = temp;
    }

    /*4. ☐ Implement Selection Sort
    Explanation: Select the minimum each pass and place at front.
            Example: [64,25,12,22,11] → [11,12,22,25,64]*/
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 5, 1};
        arr = bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
