public class TrackRobot {
    public static void main(String[] args) {
        //Input: String
        //Output: boolean

        String s = "UDD";

        System.out.println(trackRobot(s));
    }

    private static boolean trackRobot(String s) {
        if (s.length() == 0)return true;

        int hor = 0;
        int vert = 0;

        for (Character moves:s.toCharArray()
             ) {
            switch (moves){
                case 'R':
                    hor++;
                    break;
                case 'L':
                    hor--;
                    break;
                case 'U':
                vert++;
                break;
                case 'D':
                    vert--;
                    break;
                default:
            }
        }
        if (hor == 0 && vert == 0)return true;
        return false;
    }
}
