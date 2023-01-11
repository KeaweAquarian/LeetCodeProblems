public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        System.out.println(myBinarySearch(arr, 8));
    }

    private static int myBinarySearch(int[] arr, int i) {
        if (arr.length == 0)return -1;
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == i) return mid;
            if (arr[mid] > i) right = mid - 1;
            else left = mid + 1;

        }
        return -1;
    }
}
