import java.sql.Array;
import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 6, 9};

       arr = squareSortedArray(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static int[] squareSortedArray(int[] arr) {
        int negPointer = 0;
        int posPointer = 0;
        while (arr[posPointer]< 0) {
            posPointer++;
        }
        negPointer = posPointer -1;

        int[] squaredArr = new int[arr.length];
        int counter = 0;
        while (negPointer >= 0 && posPointer < arr.length){
            if (arr[negPointer] * arr[negPointer] < arr[posPointer] * arr[posPointer]){
                squaredArr[counter] = arr[negPointer] * arr[negPointer];
                negPointer--;
                counter++;
            }else {
                squaredArr[counter] = arr[posPointer] * arr[posPointer] ;
                posPointer++;
                counter++;
            }
        }

        while (negPointer >= 0){
                squaredArr[counter] = arr[negPointer] * arr[negPointer];
                negPointer--;
                counter++;
        }
        while (posPointer < arr.length){
                squaredArr[counter] = arr[posPointer] * arr[posPointer];
                posPointer++;
                counter++;
        }
        return squaredArr;
    }
}
