/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab5;

/**
 *
 * @author Peter Mitzel
 */
public class Maze {
    
    //Recursive method for making a move
    public int move(char[][] maze, int row, int col, int hrow, int hcol){
        if (maze[hrow][hcol] == 'F'){
               System.out.println("FINISHED! Nice job.\n");
               return 0;
        }else if(hrow > row){//facing east
            maze[row][col] = 'O';
            printMap(maze);
            if(maze[row+1][col] == '.' || maze[row+1][col] == 'X'){//turn right move one
                maze[row][col] = 'X';
                return move(maze, ++row, col, hrow, --hcol);
            }else if(maze[row][col+1] == '.' || maze[row][col+1] == 'X'){//move forward one
                maze[row][col] = 'X';
                return move(maze, row, ++col, hrow, ++hcol);
            }else{//turn left
                return move(maze, row, col, --hrow, ++hcol); 
            }
        }else if(hrow < row){//facing west
            maze[row][col] = 'O';
            printMap(maze);
            if(maze[row-1][col] == '.' || maze[row-1][col] == 'X'){//turn right move one
                maze[row][col] = 'X';
                return move(maze, --row, col, hrow, ++hcol);
            }else if(maze[row][col-1] == '.' || maze[row][col-1] == 'X'){//move forward one
                maze[row][col] = 'X';
                return move(maze, row, --col, hrow, --hcol);
            }else{//turn left
                return move(maze, row, col, ++hrow, --hcol); 
            }
        }else if(hcol > col){//facing north
            maze[row][col] = 'O';
            printMap(maze);
            if(maze[row][col+1] == '.' || maze[row][col+1] == 'X'){//turn right move one
                maze[row][col] = 'X';
                return move(maze, row, ++col, ++hrow, hcol);
            }else if(maze[row-1][col] == '.' || maze[row-1][col] == 'X'){//move forward one
                maze[row][col] = 'X';
                return move(maze, --row, col, --hrow, hcol);
            }else{//turn left
                return move(maze, row, col, --hrow, --hcol); 
            }
        }else if(hcol < col){//facing south
            maze[row][col] = 'O';
            printMap(maze);
            if(maze[row][col-1] == '.' || maze[row][col-1] == 'X'){//turn right move one
                maze[row][col] = 'X';
                return move(maze, row, --col, --hrow, hcol);
            }else if(maze[row+1][col] == '.' || maze[row+1][col] == 'X'){//move forward one
                maze[row][col] = 'X';
                return move(maze, ++row, col, ++hrow, hcol);
            }else{//turn left
                return move(maze, row, col, ++hrow, ++hcol); 
            }
        }
        return 0;
    }
        //function for printing out the maze
       public void printMap(char[][] n){
           for(int i=0;i<12;i++){
               System.out.print("\n");
               for(int j=0;j<12;j++){
                   System.out.print(n[i][j] + "  ");
               }
           }
           System.out.println("");
       }
}
