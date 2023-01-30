public class peakMountainArray {
    public static void main(String[] args){

        int [] arr = {1, 2, 3, 2, 1};
        System.out.println(PeakMountainArray(arr));
    }

    private static int PeakMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length;

        while (left < right){
            int mid = left + (right - left)/2;

            if (arr[mid] < arr[mid+1] ){
                left = mid +1;
            }else right = mid;
        }
        return right;
    }
}
