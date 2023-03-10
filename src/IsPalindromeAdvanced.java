public class IsPalindromeAdvanced {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeAdvanced(s));
    }

    private static boolean isPalindromeAdvanced(String s) {
        if (s.length() == 0)return true;

        int left = 0;
        int right = s.length()-1;

        while (left <= right){
            if (!Character.isLetterOrDigit(s.charAt(left))){
                ++left;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))){
                --right;
                continue;
            }


            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))return false;
            left++;
            right--;
        }
        return true;
    }

}
