
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
        
        Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));
        Turtle turtle=new Turtle();
        GameHelper game=new GameHelper(grid,turtle);
        game.setUpGame();
        game.startPlaying();
    }
}
