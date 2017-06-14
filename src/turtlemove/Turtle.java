
package turtlemove;

public class Turtle {
   Direction d;
   Cell currentCell;
   
  public Turtle()
   {
       this.d=Direction.N;
       this.currentCell=new Cell(1,1,false);
   }
   public Turtle(Direction d, Cell currentCell)
   {
       this.currentCell=currentCell;
       this.d=d;
   }

    public Direction getCurrentDirection() {
        return d;
    }
 
    public Cell getCurrentCell() {
        return currentCell;
    }
   
    public void executeCurrentMove(Grid grid,Turtle turtle,ExecuteCommand command)
    {
      if(command.compareTo(ExecuteCommand.F)==0)
      {
         checkAndUpdateMove(grid,turtle,turtle.getCurrentDirection());
      }
      if(command.compareTo(ExecuteCommand.L)==0)
          turtle.d=turtle.getCurrentDirection().left();
      if(command.compareTo(ExecuteCommand.R)==0)
          turtle.d=turtle.getCurrentDirection().right();
    }
    
    public void checkAndUpdateMove(Grid grid,Turtle turtle,Direction currentDirection)
    {
        Position position=
             turtle.getCurrentCell().getPosition().newPositionForChangeInStep(currentDirection.getStepXCoordinate(),currentDirection.getStepYCoordinate());
        Cell cell=grid.getCellForPosition(position);     
        if(cell!=null)
             {
                turtle.currentCell=grid.getCellForPosition(position);
             }
       if(cell.isIsObstacle())
       {
           System.out.println("Hit obstacle at"+cell.toString()+"No movement ");
       }
             
   }

    public boolean isValidTurtleState(Grid grid)
    {
        
        return currentCell.isIsObstacle();
    }
    @Override
    public String toString() {
        return "Turtle{" + "currentDirection=" + d.toString() + ", currentCell=" + currentCell + '}';
    }
    
}
