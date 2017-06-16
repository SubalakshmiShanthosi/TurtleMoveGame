
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
public class TurtleApplication {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));
        Turtle turtle=new Turtle();
        GameHelper turtleCommand=new GameHelper(grid,turtle);
        Scanner scanner =new Scanner(System.in);
        turtleCommand.startPlaying(scanner.nextLine().toUpperCase());
    }
}
