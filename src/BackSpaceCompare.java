public class BackSpaceCompare {
    public static void main(String[] args) {
        String value1 = "ad#c";
        String value2 = "c#e#c";
        System.out.println(backSpaceCompare2(value1, value2));
    }

    private static boolean backSpaceCompare(String value1, String value2) {
        StringBuilder stringBuilder1 = new StringBuilder("");
        StringBuilder stringBuilder2 = new StringBuilder("");
        for (int i = 0; i < value1.length(); i++) {
            if (value1.charAt(i) == '#' && stringBuilder1.length() >0){
                stringBuilder1.deleteCharAt((stringBuilder1.length()-1));
            }else if (value1.charAt(i) == '#' && i == 0)continue;
            else stringBuilder1.append(value1.charAt(i));
        }
        for (int i = 0; i < value2.length(); i++) {
            if (value2.charAt(i) == '#' && stringBuilder2.length() >0){
                stringBuilder2.deleteCharAt((stringBuilder2.length()-1));
            }else if (value2.charAt(i) == '#' && i == 0)continue;
            else stringBuilder2.append(value2.charAt(i));
        }
        if (stringBuilder1.toString().equals(stringBuilder2.toString()))return true;
        return false;
    }
    private static boolean backSpaceCompare2(String value1, String value2) {
  int s_pointer= value1.length()-1;
        int t_pointer= value2.length()-1;

        int s_skips = 0;
        int t_skips = 0;
        while (s_pointer >= 0 || t_pointer >= 0) {
            while (s_pointer >= 0) {
                if (value1.charAt(s_pointer) == '#') {
                    s_skips += 1;
                    s_pointer -= 1;
                } else if (s_skips > 0) {
                    s_pointer -= 1;
                    s_skips -= 1;
                } else {
                    break;
                }
            }

                while (t_pointer >= 0) {
                    if (value2.charAt(t_pointer) == '#') {
                        t_skips += 1;
                        t_pointer -= 1;
                    } else if (t_skips > 0) {
                        t_pointer -= 1;
                        t_skips -= 1;
                    } else {
                        break;

                    }
                }


                if (s_pointer >= 0 && t_pointer >= 0 && value1.charAt(s_pointer) != value2.charAt(t_pointer))
                    return false;
                if ((s_pointer >= 0) != (t_pointer >= 0)) return false;
                s_pointer -= 1;
                t_pointer -= 1;
            }

        return true;
    }
}
