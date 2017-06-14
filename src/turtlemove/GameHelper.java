
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


 GameHelper(Grid gridIns,Turtle turtleIns)
 {
     this.grid=gridIns;
     this.turtle=turtleIns;
 }
    public Grid getGrid() {
        return grid;
    }

    public Turtle getTurtle() {
        return turtle;
    }

public void setUpGame() throws FileNotFoundException, IOException
{
    this.grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));
    this.turtle=new Turtle();    
}
public void startPlaying() throws FileNotFoundException, NullPointerException, IOException
{   
    Scanner scanner=new Scanner(System.in);
    
    char[] gameInput=scanner.nextLine().toCharArray();
    for(Character c:gameInput)
    {
      if(ExecuteCommand.fromString(c.toString())!=null)
          
          this.turtle.executeCurrentMove(getGrid(),getTurtle(),ExecuteCommand.fromString(c.toString()));
    }
    
    finishGame();
}

public void finishGame()
{
   System.out.println(this.turtle.currentCell.position.toString()+this.turtle.d.toString());
}
}
