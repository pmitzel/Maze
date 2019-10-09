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
public class Outlab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //hardcoded maze for testing
        char[][] maze = {{'#','#','#','#','#','#','#','#','#','#','#','#'},
                {'#','.','.','.','#','.','.','.','.','.','.','#'},
                {'.','.','#','.','#','.','#','#','#','#','.','#'},
                {'#','#','#','.','#','.','.','.','.','#','.','#'},
                {'#','.','.','.','.','#','#','#','.','#','.','#'},
                {'#','#','#','#','.','#','F','#','.','#','.','#'},
                {'#','.','.','#','.','#','.','#','.','#','.','#'},
                {'#','#','.','#','.','#','.','#','.','#','.','#'},
                {'#','.','.','.','.','.','.','.','.','#','.','#'},
                {'#','#','#','#','#','#','.','#','#','#','.','#'},
                {'#','.','.','.','.','.','.','#','.','.','.','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#'}};
       
        //instance of maze class to call functions
        Maze run = new Maze();
        
        //calling the recursive function assuming we start at (row 2, column 3) and facing east (hand at (row 3, column 0)). 
        //These values can be changed to start somewhere else.
        run.move(maze, 2, 0, 3, 0);
        
        
    
    }
    
    
}
