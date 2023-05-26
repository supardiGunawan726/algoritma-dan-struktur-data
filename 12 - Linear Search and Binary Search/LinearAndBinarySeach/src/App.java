public class App {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i * 2;
        }

        System.out.println("\nArray: ");
        printArray(arr);
        int target = Integer.parseInt(System.console().readLine("Search target (0-1998): "));

        long start = System.nanoTime();
        int result = binarySearch(arr, 0, arr.length, target);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        if (result >= 0){
            System.out.println("Binary search, Found " + target + " at index " + result + ". Execution time: " + elapsedTime + " nanoseconds");
        }else{
            System.out.println("Binary search, " + target + " not found within " + elapsedTime + " nanoseconds");
        }

        start = System.nanoTime();
        result = linearSearch(arr, target);
        end = System.nanoTime();
        elapsedTime = end - start;
        if (result >= 0){
            System.out.println("Linear search, Found " + target + " at index " + result + ". Execution time: " + elapsedTime + " nanoseconds");
        }else{
            System.out.println("Linear search, " + target + " not found within " + elapsedTime + " nanoseconds");
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


    static int linearSearch(int arr[], int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    static void printArray(int arr[]){
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + ",");
        System.out.println();
	}
}
