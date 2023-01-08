public class CheckIntegerIsPalindrome {
    public static void main(String[] args) {
        System.out.println(intCheckPalindrome(1321));
    }

    private static boolean intCheckPalindrome(int i) {
        if (i == 0)return true;

        if (i < 0 || i%10 == 0)return false;

        int valueReversed = 0;
        while (valueReversed < i){
            int reversed = i % 10;
            i /=10;
            valueReversed = (valueReversed * 10) + reversed;
        }
        if (i == valueReversed || i  == valueReversed / 10)return true;
        else return false;
    }
}
