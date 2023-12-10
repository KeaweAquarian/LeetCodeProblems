public class SearchA2DMatrix {
    public static void main(String[] args) {

        //runs O(log(n*n))
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows*columns-1;

        while (left <= right){
            int current = left + (right-left)/2;
            int midElement = matrix[current/columns][current%columns];
            if (midElement == target){
                result = true;
                return result;
            } else if (midElement < target) {
                left = current + 1;

            } else {
                right = current - 1;
            }
        }





        return result;

    }
}
