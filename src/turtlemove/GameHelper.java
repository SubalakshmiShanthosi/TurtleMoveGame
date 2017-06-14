
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

public  Grid gridInstance;
public  Turtle turtleInstance;


 GameHelper(Grid gridIns,Turtle turtleIns)
 {
     this.gridInstance=gridIns;
     this.turtleInstance=turtleIns;
 }
    public Grid getGridInstance() {
        return gridInstance;
    }

    public Turtle getTurtleInstance() {
        return turtleInstance;
    }

public boolean isValidStateOfTurtle()
{
    return getTurtleInstance().getCurrentCell().isIsObstacle();
}
public void setUpGame() throws FileNotFoundException, IOException
{
    this.gridInstance=IOUtils.initializeGrid(new File("GridInitiation.txt"));
    this.turtleInstance=new Turtle();
    
}
public void startPlaying() throws FileNotFoundException, NullPointerException, IOException
{   
    Scanner scanner=new Scanner(System.in);
    
    char[] gameInput=scanner.nextLine().toCharArray();
    for(Character c:gameInput)
    {
      if(!isValidStateOfTurtle()&& ExecuteCommand.fromString(c.toString())!=null)
          
          this.turtleInstance.executeCurrentMove(getGridInstance(),getTurtleInstance(),ExecuteCommand.fromString(c.toString()));
    }
    
    finishGame();
}

public void finishGame()
{
   System.out.println(this.turtleInstance.currentCell.position.toString()+this.turtleInstance.d.toString());
}
}
