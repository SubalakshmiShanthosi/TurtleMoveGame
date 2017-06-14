/*
 * To change this license header, choose License Headers in Project Properties.
 * To change thi
 * s template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
   public Cell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

    @Override
    public String toString() {
        return "Turtle{" + "currentDirection=" + d.getText() + ", currentCell=" + currentCell + '}';
    }
    
}
