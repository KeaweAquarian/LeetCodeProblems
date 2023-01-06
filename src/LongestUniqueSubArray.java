import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray("abcabcdjfj"));
    }

    private static int maxSubArray(String s) {

        int max = 0;
        if(s.length() == 0)return max;
        Map<Character, Integer> checked = new HashMap<>();
        for (int r = 0, l = 0; r < s.length(); r++) {
            char charToCheck = s.charAt(r);
            if (checked.containsKey(charToCheck) && checked.get(charToCheck) >= l){
                l = checked.get(charToCheck)+ 1;
            }
            checked.put(s.charAt(r), r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
