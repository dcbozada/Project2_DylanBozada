import java.util.Scanner;

public class ConnectFour {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(Scanner.in)
      
    char[][] grid = new char[6][7];
    
    // Initializing array
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
              grid[row][col] = ' ';
      }
    }
    
    int turn = 1;
    char player = 'R';
    boolean winner = false;
    
    // Players turn
    while(winner == false && turn <= 42) {
      boolean goodInput;
      int play;
      do {
        display(grid);
        
        System.out.print("Please choose a column (0-6) to drop the " player + " disk: ");
        play = in.nextInt();
        
        // Good input
        isGood(play, grid);
        
        // Dropping disk 
        }(while is
        
        
      }
    }
  
  
  }
  
  public static void display(char[][] grid){
    System.out.println(" 0 1 2 3 4 5 6");
    System.out.println("");
    for (int row = 0; row < grid.length; row++) {
      System.out.print("|");
      for (int col = 0; col < grid[0].length; col++) {
        System.out.print(grid[row][col]);
        System.out.print("|");
      }
      System.out.println();
    }
    Systemm.out.println();
    System.out.println(" 0 1 2 3 4 5 6");
  }
  
  public static boolean isGood(int column, char[][] grid) {
    // good column:
    if (column < 0 || column > grid[0].length){
      return false;
    }
    // is column full
    if (grid[0][column] != ' ') {
      return false
    }
    
    return true;
  }
  
  
}
