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
    public TurtleOrientation execute(Grid aGrid, Position position, Direction direction) {
        Position updatedPosition = position.newPositionForChangeInStep(direction.getStepXCoordinate() * 2, direction.getStepYCoordinate() * 2);
        TurtleOrientation aOrientation = position.hasOutsideBounds(updatedPosition) ? new TurtleOrientation(direction, aGrid.getCellForPosition(updatedPosition)) : null;
        if (!aOrientation.getCurrentCell().isIsObstacle()) {
            return aOrientation;
        } else {
            TurtleOrientation aJumpOverObstacle;
            System.out.println("Hit obstacle at" + aOrientation.getCurrentCell().toString() + "Jump over a obstacle");
            while ((aJumpOverObstacle = CommandFactory.commandForInput("F").execute(aGrid, updatedPosition, direction)) != null) {
                return !aJumpOverObstacle.getCurrentCell().isIsObstacle() ? aJumpOverObstacle : null;

            }
        }
        return null;
    }
}