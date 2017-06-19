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
class RightCommand extends Command {

    public RightCommand() {
    }

    @Override
    public TurtleOrientation execute(Grid grid,Position position,Direction direction) {
        return new TurtleOrientation(direction.right(),grid.getCellForPosition(position));
        
    }
        
         
    
}
