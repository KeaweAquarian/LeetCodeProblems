import java.util.Arrays;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4,4,};
        removeDuplicates(arr);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0)return 0;
        int left = 0;
        int right = nums.length-1;
        int count = 1;
        int current = left;

        while(current <= right){


            while(current <= right && nums[left] == nums[current]){

                current++;

            }
            if(current <= right)nums[left+1] = nums[current];


            left++;

        }
        return left;
    }
}
