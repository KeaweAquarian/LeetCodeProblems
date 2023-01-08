public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(-89845));
    }

    private static int reverseInteger(int i) {
        if (i == 0)return 0;
        int reversedInt = 0;
        int removedInt;

        while (i != 0){
            removedInt = i %10;
            i /=10;
            if (reversedInt > Integer.MAX_VALUE/10 || reversedInt == Integer.MAX_VALUE/10 && removedInt > 7)return 0;
            if (reversedInt < Integer.MIN_VALUE/10 || reversedInt == Integer.MIN_VALUE/10 && removedInt < -8)return 0;
            reversedInt = (reversedInt * 10) + removedInt;
        }
        return reversedInt;
    }
}
