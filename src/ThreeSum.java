import java.sql.Array;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {1, -2, 4, 6, -5, 2, 3, 6, 1};
        int target = 4;
        System.out.println(threeSum(arr, target));
    }

    private static int threeSum(int[] arr, int target) {
        int sum = arr[0] + arr[1] + arr[arr.length-1];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            int left = i +1;
            int right = arr.length-1;

            while (left < right){
                int currentValue = arr[i] + arr[left] + arr[right];
                if (currentValue < sum){
                    left++;
                }else right--;

                if (Math.abs(currentValue - target) < Math.abs(sum -  target))sum = currentValue;
            }

        }
        return sum;
    }
}
