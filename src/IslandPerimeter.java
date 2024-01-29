public class IslandPerimeter {
    static int result = 0;
    static boolean[][] haveVisisted;
    public static void main(String[] args) {
        int [][] islands = {{0,0,0},
                            {0,1,0},
                            {0,1,1}};
        haveVisisted = new boolean[islands.length][islands[0].length];
        System.out.println(islandPerimeter(islands));
    }

    private static int islandPerimeter(int[][] islands) {

        if(islands ==null || islands.length == 0 || islands[0].length ==0 )return 0;

        for (int i = 0; i < islands.length; i++) {
            for (int j = 0; j < islands[i].length; j++) {
                if (islands[i][j]==1){
                    result+=4;

                    if (i> 0 && islands[i-1][j] ==1){
                        result-=2;
                    }
                    if (j> 0 && islands[i][j-1] ==1){
                        result-=2;
                    }


                }
            }
        }
        return result;
    }

    private static void countPerimeter(int i, int j, int[][] islands) {

        if (j >= islands[0].length || i >= islands.length || j <=0 || i <= 0 || islands[i][j]==0 ){
            result++;

        }
        else {
            countPerimeter(i, ++j, islands);
            countPerimeter(++i, j, islands);
            countPerimeter(i, --j, islands);
            countPerimeter(--i, j,islands );
        }
    }
}
