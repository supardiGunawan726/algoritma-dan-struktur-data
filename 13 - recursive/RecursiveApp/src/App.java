import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nMerge sort with recursive");
        int[] arr = {0, 3, 1, 5, 13, 8, 7, 15, 18, 11};
        System.out.print("Array : ");
        printArray(arr);
        mergeSort(arr);
        System.out.print("Sorted array : ");
        printArray(arr);

        System.out.println("\nBinary Search with recursive");
        System.out.print("Array : ");
        printArray(arr);
        int element = Integer.parseInt(System.console().readLine("Element to search: "));
        int result = binarySearch(arr, 0, arr.length, element);
        if (result != -1){
            System.out.println("found at index " + result);
        }else {
            System.out.println("Not found");
        }

        System.out.println("\nFibonacci with recursive");
        int length = Integer.parseInt(System.console().readLine("Length: "));

        Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++){
            System.out.print(fibonacci(i, memo) + ", ");
        }
    }

    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            return binarySearch(arr, mid + 1, r, x);
        }
 
        return -1;
    }

    static void mergeSort(int arr[]){
        if (arr.length < 2){
            return;
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for (int i = 0; i < left.length; i++){
            left[i] = arr[i];
        }
        for (int j = 0; j < right.length; j++){
            right[j] = arr[middle + j];
        }

        mergeSort(left);
        mergeSort(right);

        int i = 0,  j = 0, k = 0;
        while (i < left.length && j < right.length){
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
    }

    static int fibonacci(int index,  Map<Integer, Integer> memo){
        if (index == 0 || index == 1) return index;
        if (memo.containsKey(index)) return memo.get(index);
        
        int result = fibonacci(index - 1, memo) + fibonacci(index - 2, memo);
        memo.put(index, result);
        return result;
    }

	// A utility function to print array of size n
	static void printArray(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
