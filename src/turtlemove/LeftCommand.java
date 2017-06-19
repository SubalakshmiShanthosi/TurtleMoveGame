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
public class LeftCommand extends Command {

    public LeftCommand() {
    }

    @Override
    public TurtleOrientation execute(Grid grid,Position position,Direction direction) {
       return new TurtleOrientation(direction.left(),grid.getCellForPosition(position));
    }

    

    
}
