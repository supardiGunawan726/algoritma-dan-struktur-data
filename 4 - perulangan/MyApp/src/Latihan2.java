import java.util.Arrays;

public class Latihan2 {
  public static void main(String[] args){
    splitArray(new int[] {90,65,85,55,85,70,75,65});
  }

  static void splitArray(int[] nums){
    int[] nums1 = new int[nums.length / 2];
    int[] nums2 = new int[nums.length - nums1.length];

    System.out.println("\n================");
    System.out.println("nums: " + Arrays.toString(nums));

    for (int i = 0; i < nums.length; i++){
      if (i < nums.length / 2){
        nums1[i] = nums[i];
      }else {
        nums2[i - nums.length / 2] = nums[i];
      }
    }

    int minDiff = getSum(nums2) - getSum(nums1);
    boolean perfectSolution = false;
    for (int i = 0; i < nums1.length; i++){
      for (int j = 0; j < nums2.length; j++){
        int sum1 = getSum(nums1);
        int sum2 = getSum(nums2);

        sum1 -= nums1[i];
        sum1 += nums2[j];

        sum2 -= nums2[j];
        sum2 += nums1[i];

        int diff = sum2 - sum1;
        if ((diff < minDiff && diff >= 0) || (diff > minDiff && diff <= 0)){
          int tmp = nums1[i];
          nums1[i] = nums2[j];
          nums2[j] = tmp;

          if (diff == 0){
            perfectSolution = true;
            System.out.println("====SOLUTION====");
            System.out.println("nums1: " + Arrays.toString(nums1));
            System.out.println("nums2: " + Arrays.toString(nums2));
          }
        }
      }
    }

    if (!perfectSolution){
      System.out.println("====SOLUTION====");
      System.out.println("nums1: " + Arrays.toString(nums1));
      System.out.println("nums2: " + Arrays.toString(nums2));
    }
  }

  static int getSum(int[] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      sum += nums[i];
    }
    return sum;
  }
}
