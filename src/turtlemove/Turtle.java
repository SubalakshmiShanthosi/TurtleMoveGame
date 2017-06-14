
package turtlemove;

public class Turtle {
   Direction d;
   Cell currentCell;
   
   Turtle()
   {
       this.d=Direction.N;
       this.currentCell=new Cell(1,1,false);
   }
   Turtle(Direction d, Cell currentCell)
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
             if(!grid.getCellForPosition(position).isIsObstacle())
             {
                turtle.currentCell=grid.getCellForPosition(position);
             }
             
   }

    public boolean isValidTurtleState()
    {
        return currentCell.isIsObstacle();
    }
    @Override
    public String toString() {
        return "Turtle{" + "currentDirection=" + d.toString() + ", currentCell=" + currentCell + '}';
    }
    
}
