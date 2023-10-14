package Backtracking;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{0,1,0},{1,1,1}};
        System.out.println(RatinMaze(arr));
    }
   public static boolean RatinMaze(int[][] maze){
        int[][] path = new int[maze.length][maze.length];
        boolean ans = solveMaze(maze,0,0,path);
//       System.out.println(Arrays.deepToString(path));
       for (int i = 0; i <maze.length ; i++) {
           for (int j = 0; j <maze.length ; j++) {
               System.out.print(path[i][j]+" ");
           }
           System.out.println();
       }
       return ans;

   }
   public static boolean solveMaze(int[][] maze,int x,int y,int[][] path){
        if(x<0 || x>= maze.length || y<0 || y>= maze.length || maze[x][y]==0 || path[x][y]==1){
           return false;}
        path[x][y] = 1;
        if (x== maze.length-1 && y== maze.length-1) {

            return true;
        }
        if (solveMaze(maze,x-1,y,path)) return true;
        if (solveMaze(maze,x+1,y,path)) return true;
        if (solveMaze(maze,x,y+1,path)) return true;
        if (solveMaze(maze,x,y-1,path)) return true;

        return false;
   }
   public static boolean isValid(int[][] maze,int x,int y,int[][] path){
        if(x<0 || x>=maze[maze.length].length || y<0 || y>= maze.length || maze[x][y]==0 || path[x][y]==1){
            return false;
        }else {
            return true;
        }
   }

}
