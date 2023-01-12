public class IsBadVersion {
    public static void main(String[] args) {
        System.out.println(isBadVersion(4));
    }

    static boolean[] arr = {true, true, true, false, false, false};
    private static int isBadVersion(int n) {
        int left = 0;
        int right= n;
        while (left < right){
            int mid = left + (right - left)/2;
            if (!isBadVersionTest(mid))right = mid;
            else left = mid + 1;
        }
        if (left == right && !isBadVersionTest(left))return left;
        return -1;
    }

    private static boolean isBadVersionTest(int mid) {
        return arr[mid];
    }
}
