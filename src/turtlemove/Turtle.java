
package turtlemove;

public class Turtle {
   Direction direction;
   Cell currentCell;
   
  public Turtle()
   {
       this.direction=Direction.N;
       this.currentCell=new Cell(1,1,false);
   }
   public Turtle(Direction d, Cell currentCell)
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
   
    public Turtle move(Grid grid,Turtle turtle,String aInput) throws NullPointerException
    {
     Turtle turtleOrientation=CommandFactory.commandForInput(aInput).execute(grid,turtle.getCurrentCell().getPosition(),turtle.getCurrentDirection());
     if(turtleOrientation.getCurrentCell().isIsObstacle())
     {
         System.out.println("Hit obstacle at "+turtleOrientation.getCurrentCell().toString()+"Picking next command");     
         return turtle;
     }
     return turtleOrientation;
    }
    
    
    @Override
    public String toString() {
        return "Turtle{" + "currentDirection=" + direction.toString() + ", currentCell=" + currentCell + '}';
    }
    
}
