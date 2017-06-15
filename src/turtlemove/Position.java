
package turtlemove;

import java.util.Objects;

/**
 *
 * @author SUBA
 */
public class Position {
    private Integer xCoordinate,  yCoordinate;
    public Position(String x,String y)
    {
    xCoordinate=Integer.parseInt(x);
    yCoordinate=Integer.parseInt(y);
    }

    public Position(Integer xCoord, Integer yCoord) {
        this.xCoordinate = xCoord;
        this.yCoordinate = yCoord;
    }
    
   public Position newPositionForChangeInStep(Integer newStepXCoordinate,Integer newStepYCoordinate)
   {
       return new Position(this.xCoordinate+newStepXCoordinate,this.yCoordinate+newStepYCoordinate);
   }
    
   public boolean hasOutsideBounds(Position position)
   {
       return isXCoordinateInOutsideBounds(position.xCoordinate) && isYCoordinateInOutsideBounds(position.yCoordinate);
   }
   
   public boolean isXCoordinateInOutsideBounds(Integer xCoord){
       return xCoord >= this.xCoordinate;
   }
   
   public boolean isYCoordinateInOutsideBounds(Integer yCoord){
       return yCoord >= this.yCoordinate;
   }
   @Override
    public String toString() {
        return  xCoordinate +","+yCoordinate;
    }

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    @Override
   public boolean equals(Object obj) 
{
        Position position=(Position)obj;
        return this.xCoordinate==position.xCoordinate && this.yCoordinate == position.yCoordinate;
}
}
