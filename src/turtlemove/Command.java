package turtlemove;
import java.util.HashMap;
import java.util.Map;
import turtlemove.CommandFactory;
import turtlemove.Direction;
import turtlemove.Position;

public abstract class Command {
    
    public abstract TurtleOrientation execute(Grid aGrid,Position position,Direction direction);
    
}
