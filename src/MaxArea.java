public class MaxArea {
    public static void main(String[] args) {
        int [] arr = {1, 8, 6, 4, 3, 6, 8, 7, 2};

        System.out.println(maxArea(arr));
    }

    private static int maxArea(int[] arr) {
        int max = 0;
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if (arr[left] < arr[right]){
                max = Math.max(max, arr[left] * (right-left));
                left +=1;
            }else {
                max = Math.max(max, arr[right] * (right-left));
                right -=1;
            }

        }
        return max;
    }
}
