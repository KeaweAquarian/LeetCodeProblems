public class SearchA2DMatrix {
    public static void main(String[] args) {

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
            int current = right + (right-left)/2;
            int midElement = matrix[current/current][current%rows];
            if (midElement == target){
                result = true;
                return result;
            } else if (target < midElement) {
                left = current++;

            } else if (midElement > target ) {
                right = current--;
            }
        }





        return result;

    }
}
