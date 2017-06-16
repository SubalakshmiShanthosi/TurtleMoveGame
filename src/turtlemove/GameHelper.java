
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

public  Grid grid;
public  Turtle turtle;


 public GameHelper(Grid grid,Turtle turtle)
 {
     this.grid=grid;
     this.turtle=turtle;
 }
    public Grid getGrid() {
        return grid;
    }

    public Turtle getTurtle() {
        return turtle;
    }

public void startPlaying(final String inputCommand) throws  NullPointerException, IOException
{   
    char[] inputCommandString=inputCommand.toCharArray();
    for(Character c:inputCommandString)
    {
      if(Command.fromString(c.toString())!=null)
          
          this.turtle.move(getGrid(),getTurtle(),Command.fromString(c.toString()));
    }
    
    finishGame();
}

public void finishGame()
{
   System.out.println(this.turtle.currentCell.position.toString()+this.turtle.direction.toString());
}
}
