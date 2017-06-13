/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
public class Cell{ 
   Position position;
   boolean isObstacle;

    @Override
    public String toString() {
        return "Cell{" + "p=" + position + ", isObstacle=" + isObstacle + '}';
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isIsObstacle() {
        return isObstacle;
    }

    public void setIsObstacle(boolean isObstacle) {
        this.isObstacle = isObstacle;
    }
   
   Cell(int x,int y,Boolean isObstacle)
   {
       this.position = new Position(x,y);
       this.isObstacle=isObstacle;
   }
}
