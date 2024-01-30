import java.util.HashMap;
import java.util.Map;

public class JavaAnagrams {
    public static void main(String[] args) {
        String a = "Angaram";
        String b = "margana";

        System.out.println(chaeckAnagram2(a, b)?"anagram":"not anagram");
    }

    private static boolean chaeckAnagram2(String a, String b) {
        char[] arr = new char[26];
        for (int i = 0; i <a.length() ; i++) {
            char current = Character.toLowerCase(a.charAt(i));
            int charIndex = current-'a';
            arr[charIndex] = arr[charIndex]++;
        }

        for (int i = 0; i <b.length() ; i++) {
            char current = Character.toLowerCase(b.charAt(i));
            int charIndex = current-'a';
            arr[charIndex] = arr[charIndex]--;
        }

        for (int i = 0; i <26 ; i++) {
            if (arr[i] != 0)return false;
        }

        return true;
    }

    private static boolean chaeckAnagram(String a, String b) {
        Map<Character, Integer> mapA = createMap(a);
        Map<Character, Integer> mapB = createMap(b);

        return mapA.equals(mapB);
    }

    private static Map<Character, Integer> createMap(String a) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(Character.toLowerCase(a.charAt(i)))){
                Integer b = map.get(a.charAt(i));
                map.put(a.charAt(i), (b+1));
            }else map.put(Character.toLowerCase(a.charAt(i)), 1);
        }
        System.out.println(map);
        return map;
    }
}
