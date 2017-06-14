/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; 
/**
 *
 * @author SUBA
 */
public class MainDriver {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
        GameHelper game=new GameHelper();
        game.setUpGame();
        game.startPlaying();
        */
        Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));
        Turtle turtle=new Turtle();
        
        GameHelper game=new GameHelper(grid,turtle);
        game.setUpGame();
        game.startPlaying();
        /*    
        Scanner scanner=new Scanner(System.in);
    
    char[] gameInput=scanner.nextLine().toCharArray();
    for(Character c:gameInput)
    {
    
    if(Movement.fromString(c.toString())!=null)
          turtle.executeCurrentMove();
     else if(Direction.fromString(c.toString())!=null)
          turtle.changeOrientation();
   
    }  
    */
    }
}
