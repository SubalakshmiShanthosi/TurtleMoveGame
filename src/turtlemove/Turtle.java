
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
   
    public void move(Grid grid,Turtle turtle,Command command)
    {
      if(command.compareTo(Command.F)==0)
      {
         checkAndUpdateMove(grid,turtle,turtle.getCurrentDirection());
      }
      if(command.compareTo(Command.L)==0)
          turtle.direction=turtle.getCurrentDirection().left();
      if(command.compareTo(Command.R)==0)
          turtle.direction=turtle.getCurrentDirection().right();
    }
    
    private void checkAndUpdateMove(Grid grid,Turtle turtle,Direction currentDirection)
    {   
        Position position=turtle.getCurrentCell().getPosition().newPositionForChangeInStep(currentDirection.getStepXCoordinate(),currentDirection.getStepYCoordinate());
        if(turtle.getCurrentCell().getPosition().hasOutsideBounds(position))
        {
            Cell cell=grid.getCellForPosition(position);     
        if(!cell.isIsObstacle() && cell!=null)
             {
                turtle.currentCell=grid.getCellForPosition(position);
             }
        else if(cell.isIsObstacle() && cell!=null)
       {
           System.out.println("Hit obstacle at"+cell.toString()+"No movement possible");
       }
             
   }
        else
            System.out.println("IIlegal move ");
    }
    
    @Override
    public String toString() {
        return "Turtle{" + "currentDirection=" + direction.toString() + ", currentCell=" + currentCell + '}';
    }
    
}
