
package turtlemove;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SUBA
 */
public class GameHelper {

private  Grid grid;
private  TurtleOrientation turtle;


 public GameHelper(Grid grid,TurtleOrientation turtle)
 {
     this.grid=grid;
     this.turtle=turtle;
 }
    public Grid getGrid() {
        return grid;
    }

    public TurtleOrientation getTurtle() {
        return turtle;
    }

public void startPlaying(final String inputCommand) throws  NullPointerException, IOException
{   
    char[] inputCommandString=inputCommand.toCharArray();
    for(Character c:inputCommandString)
    {
         TurtleOrientation aNewOrientation=getTurtle().move(getGrid(),getTurtle(),c.toString());       
         if(aNewOrientation!=null)
             this.turtle=aNewOrientation;
         else
             System.out.println("Illegal move!");
    }
    
    finishGame();
}

public void finishGame()
{
   System.out.println(this.turtle.currentCell.position.toString()+this.turtle.direction.toString());
}
}
