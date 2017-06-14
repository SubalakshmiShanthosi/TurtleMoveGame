
package turtlemove;

public enum ExecuteCommand{
    F("F"),
    L("L"),
    R("R");
    String text;
    
    private ExecuteCommand(String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return "ExecuteCommand{" + "text=" + text + '}';
    }
    public static ExecuteCommand fromString(String text) {
    for (ExecuteCommand b : ExecuteCommand.values()) {
      if (b.text.equalsIgnoreCase(text)) {
        return b;
      }
    }
    return null;
  }
}