import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseLettersInString {
    public static void main(String[] args) {
        String string = "ab-dj-DJ_dkjf";
        char [] characters = string.toCharArray();


        // populate the vector

        // printing the vector before swap
        System.out.println("Before swap: " + Arrays.toString(characters));

        int left = 0;
        int right = string.length()-1;
        while ( left < right){
            if (!Character.isLetter(characters[left])){
                left++;
                continue;
            }
            if (!Character.isLetter(characters[right])){
                right--;
                continue;
            }
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }
        System.out.println("after swap: " + Arrays.toString(characters));
    }
}
