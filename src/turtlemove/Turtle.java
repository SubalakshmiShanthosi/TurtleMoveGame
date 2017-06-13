/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;

/**
 *
 * @author SUBA
 */
public class Turtle {
   Character currentDirection;
   Cell currentCell;
   Turtle(Character currentDirection, Cell currentCell)
   {
       this.currentDirection=currentDirection;
       this.currentCell=currentCell;
   }

    public Character getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Character currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

    @Override
    public String toString() {
        return "Turtle{" + "currentDirection=" + currentDirection + ", currentCell=" + currentCell + '}';
    }
    
}
