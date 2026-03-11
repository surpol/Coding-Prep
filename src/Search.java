public class Search {
   /*
            4. ☐ Implement Selection Sort
    Explanation: Select the minimum each pass and place at front.
            Example: [64,25,12,22,11] → [11,12,22,25,64]
            5. ☐ Implement Insertion Sort
    Explanation: Insert each element into the sorted prefix.
            Example: [12,11,13,5,6] → [5,6,11,12,13]
            6. ☐ Implement Merge Sort
    Explanation: Divide, sort halves, and merge (O(n log n)).
    Example: [38,27,43,3,9,82,10] → [3,9,10,27,38,43,82]
            7. ☐ Implement Quick Sort
    Explanation: Partition around a pivot and recurse on partitions.
    Example: [10,7,8,9,1,5] → [1,5,7,8,9,10]

    ****/

    /* 1. ☐ Implement Linear Search
    Explanation: Scan array sequentially to find target.
    Example: [4,2,7,1,9], target=7 → index=2 */
    public static int linear(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++ ) {
                if (arr[i] == target) {
                    return i;
                }
            }
        return -1;
    }
    /*2. ☐ Implement Binary Search
    Explanation: Halve a sorted array repeatedly to locate the target.
            Example: [1,3,5,7,9], target=5 → index=2*/
    public static int binary(int[] arr, int target){

        // curr variable
        // is target greater than curr
         // if yes go right else left
         // get length and half it
            // if curr == target
            // return
        int low = 0;
        int high = arr.length -1;
        int mid = arr.length/2;
        while (high != low) {
            if (arr[low] == target) { return low;}
            if (arr[mid] == target) {return mid;}
            if (arr[high] == target) { return high;}
            if (target > arr[mid]){
                low = mid + 1;
                mid = (high - low) / 2;
            }
            else {
                high = mid  - 1;
                mid = (high - low) / 2;
            }
        }

        return -1;
    }

    public static void main (String[] args) {
        int[] arr = { 4,2,7,1,9};
        int[] arr2 = { 2, 5, 4,2,7,1,9};
        int[] sortedArr = { 1, 2, 6, 7, 10, 12};

        int answer = linear(arr, 7); // Pass
        int answer2 = linear(arr2, 1); // Pass
        int answer3 = binary(sortedArr, 6);
        System.out.println("answer: " + answer3 );
    }
}



