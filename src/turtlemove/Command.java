package turtlemove;
import java.util.HashMap;
import java.util.Map;
import turtlemove.CommandFactory;
import turtlemove.Direction;
import turtlemove.Position;

//
//package turtlemove;
//
//public enum Command {
//    /**
//     *
//     */
//    F("F")
//            {
//        @Override
//        public void executeCommand() {
//              
//        }
//    },
//    L("L") {
//
//        @Override
//        public void executeCommand() {
//             
//        }
//    },
//    R("R"){
//        @Override
//        public void executeCommand() {
//             
//             
//        }
//    },
//    J("J"){
//        @Override
//        public void executeCommand() {
//             //To change body of generated methods, choose Tools | Templates.
//        }
//    };
//    String command;
//    
//    private Command(String command){
//        this.command=command;
//    }
//public abstract void executeCommand();
//
//
//@Override
//    public String toString() {
//        return "ExecuteCommand{" + "text=" + command + '}';
//    }
//    public static Command fromString(String text) {
//    for (Command b : Command.values()) {
//      if (b.command.equalsIgnoreCase(text)) {
//        return b;
//      }
//    }
//    return null;
//  }
//}
public abstract class Command {
    
    public abstract Turtle execute(Grid aGrid,Position position,Direction direction);
    
}
