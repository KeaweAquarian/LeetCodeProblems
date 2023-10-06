import java.util.Arrays;

public class FirstAndLastindexIntegerArray {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4,4,};

        System.out.println(Arrays.toString(searchRange(arr, 3)));


    }
    public static int[] searchRange(int[] nums, int target) {
        //input array and target int
        //output array
        int[] result = {-1,-1};
        if(nums.length == 0){
            return result;
        }
        int low = 0;
        int high = nums.length-1;

        while (low <= high){
            int mid = (high-low)/2 + low;
            if (nums[mid] == target){
                result[0] = mid;
                high = mid-1;
            }else if(nums[mid] < target){
                low = mid +1;
            }else high = mid-1;
        }
        low = 0;
        high = nums.length-1;
        while(low <= high){
            int mid = (high-low)/2 + low;
            if (nums[mid] == target){
                result[1] = mid;
                low = mid+1;

            }else if(nums[mid] < target){
                low = mid +1;

            }else high = mid-1;
        }
        return result;

    }
}
