package turtlemove;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUBA
 */
class ForwardCommand extends Command {

    public ForwardCommand() {
    
    }

    @Override
    public TurtleOrientation execute(Grid grid,Position position,Direction direction) {
    Position updatedPosition=position.newPositionForChangeInStep(direction.getStepXCoordinate(),direction.getStepYCoordinate());
    return position.hasOutsideBounds(updatedPosition)? new TurtleOrientation(direction,grid.getCellForPosition(updatedPosition)):null;
    }

   
        
    
}
