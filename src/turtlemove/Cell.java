
package turtlemove;

public class Cell{ 
   Position position;
public boolean isObstacle;

    @Override
    public String toString() {
        return "Cell{" + "p=" + position + ", isObstacle=" + isObstacle + '}';
    }

    public Position getPosition() {
        return position;
    }



    public boolean isIsObstacle() {
        return isObstacle;
    }
   
   Cell(int x,int y,Boolean isObstacle)
   {
       this.position = new Position(x,y);
       this.isObstacle=isObstacle;
   }
}
