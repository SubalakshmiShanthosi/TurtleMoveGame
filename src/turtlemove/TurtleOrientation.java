
package turtlemove;

public class TurtleOrientation {
   Direction direction;
   Cell currentCell;
   
  public TurtleOrientation()
   {
       this.direction=Direction.N;
       this.currentCell=new Cell(1,1,false);
   }
   public TurtleOrientation(Direction d, Cell currentCell)
   {
       this.currentCell=currentCell;
       this.direction=d;
   }

    public Direction getCurrentDirection() {
        return direction;
    }
 
    public Cell getCurrentCell() {
        return currentCell;
    }
   
    public TurtleOrientation move(Grid grid,TurtleOrientation turtle,String aInput)
    {
     TurtleOrientation turtleOrientation=CommandFactory.commandForInput(aInput).execute(grid,turtle.getCurrentCell().getPosition(),turtle.getCurrentDirection());
     if(turtleOrientation!=null && turtleOrientation.getCurrentCell().isIsObstacle())
     {
         System.out.println("Hit obstacle at "+turtleOrientation.getCurrentCell().toString()+"Picking next command");     
         return turtle;
     }
     else
     return turtleOrientation;
    
    }
    
    
    @Override
    public String toString() {
        return "Turtle{" + "currentDirection=" + direction.toString() + ", currentCell=" + currentCell + '}';
    }
    
}
