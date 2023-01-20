public class ThousandIslands {
    public static void main(String[] args) {
        int [][] islands = {{1,0,0},
                            {0,1,0},
                            {0,0,1}};
        System.out.println(countIslands(islands));
    }

    private static int countIslands(int[][] islands) {
        if (islands.length == 0)return 0;
        int count = 0;

        for (int i = 0; i < islands.length; i++) {
            for (int j = 0; j < islands[i].length; j++) {
                if (islands[i][j] == 1){
                    count++;
                    BFS(i,j, islands);
                }
            }

        }
        return count;
    }

    private static void BFS(int i, int j, int [][] island) {
        if (i < 0 || i >= island.length || j < 0 || j >= island.length || island[i][j] == 0){
            return;
        }
        island[i][j] = 0;
        BFS(i +1, j, island); //up
        BFS(i - 1, j, island);//down
        BFS(i, j + 1, island);//right
        BFS(i, j -1, island);//left
    }
}
