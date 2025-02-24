import java.util.ArrayList;
import java.util.Arrays;

class Maze {
  public static void main(String[] args) {
    // ArrayList<String> ans = pathListDiagonal("",3, 3);
    // System.out.println(ans);
    boolean[][] board = {
      {true, true, true},
      {true, true, true},
      {true, true, true}
    };
    int[][] path = {
      {0,0,0},
      {0,0,0},
      {0,0,0}
    };
    allPath("", board, 0, 0, path, 1);
  }

  static int maze(int row, int col) {
    if(row == 1 || col == 1) {
      return 1;
    }
    int down = maze(row - 1, col);
    int right = maze(row, col - 1);
    return down + right;
  }

  static void path(String p, int row, int col) {
    if(row == 1 && col == 1) {
      System.out.println(p);
      return;
    }

    if(row > 1) {
      path(p + 'D', row - 1, col);
    } 
    if (col > 1) {
      path(p + 'R', row, col - 1);
    }
  }
  static ArrayList<String> pathList(String p, int row, int col) {
    if(row == 1 && col == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> ans = new ArrayList<>();
    if(row > 1) {
      ans.addAll(pathList(p + 'D', row - 1, col));
    } 
    if (col > 1) {
      ans.addAll(pathList(p + 'R', row, col - 1));
    }
    return ans;
  }
  static ArrayList<String> pathListDiagonal(String p, int row, int col) {
    if(row == 1 && col == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> ans = new ArrayList<>();
    if(row > 1) {
      ans.addAll(pathListDiagonal(p + 'V', row - 1, col));
    } 
    if (col > 1) {
      ans.addAll(pathListDiagonal(p + 'H', row, col - 1));
    } if (col > 1 && row > 1) {
    ans.addAll(pathListDiagonal(p + 'D', row - 1, col - 1));
    }
    return ans;
  }
  public static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
    if(r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }
    if(maze[r][c] == false) {
      return;
    }

    if(r < maze.length - 1) {
      pathRestrictions(p + 'D', maze, r + 1, c);
    }
    if(c < maze[0].length - 1) {
      pathRestrictions(p + 'R', maze, r, c + 1);
    }
  }
  public static void pathBack(String p, boolean[][] maze, int r, int c) {
    if(r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }
    if(maze[r][c] == false) {
      return;
    }
    maze[r][c] = false;

    if(r < maze.length - 1) {
      pathBack(p + 'D', maze, r + 1, c);
    }
    if(c < maze[0].length - 1) {
      pathBack(p + 'R', maze, r, c + 1);
    }
    if(r > 0) {
      pathBack(p + 'U', maze, r - 1, c);
    }
    if(c > 0) {
      pathBack(p + 'L', maze, r, c - 1);
    }

    maze[r][c] = true;
  }
  public static void allPath(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
    if(r == maze.length - 1 && c == maze[0].length - 1) {
      path[r][c] = step;
      for(int[] nums : path) {
        System.out.println(Arrays.toString(nums));
      }
      System.out.println(p);
      System.out.println();
      return;
    }
    if(maze[r][c] == false) {
      return;
    }
    maze[r][c] = false;
    path[r][c] = step;

    if(r < maze.length - 1) {
      allPath(p + 'D', maze, r + 1, c, path, step + 1);
    }
    if(c < maze[0].length - 1) {
      allPath(p + 'R', maze, r, c + 1, path, step + 1);
    }
    if(r > 0) {
      allPath(p + 'U', maze, r - 1, c, path, step + 1);
    }
    if(c > 0) {
      allPath(p + 'L', maze, r, c - 1, path, step + 1);
    }

    maze[r][c] = true;
    path[r][c] = 0;
  }
}