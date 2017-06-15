
package turtlemove;

public enum Command{
    F("F"),
    L("L"),
    R("R");
    String command;
    
    private Command(String command){
        this.command=command;
    }

    @Override
    public String toString() {
        return "ExecuteCommand{" + "text=" + command + '}';
    }
    public static Command fromString(String text) {
    for (Command b : Command.values()) {
      if (b.command.equalsIgnoreCase(text)) {
        return b;
      }
    }
    return null;
  }
}