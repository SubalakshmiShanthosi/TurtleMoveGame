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
class Jump extends Command {

    public Jump() {
    
    }

    @Override
    public Turtle execute(Grid aGrid,Position position,Direction direction) {
    Position updatedPosition=position.newPositionForChangeInStep(direction.getStepXCoordinate()*2,direction.getStepYCoordinate()*2);
    return position.hasOutsideBounds(updatedPosition)? new Turtle(direction,aGrid.getCellForPosition(updatedPosition)):null;
    }
     
    
}
