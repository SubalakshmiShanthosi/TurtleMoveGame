/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SUBA
 */
public class CommandFactory {
    private HashMap<String,Command> commandMap = new HashMap();
    private static CommandFactory instance = new CommandFactory();
    private CommandFactory() {
        commandMap.put("F", new ForwardCommand());
        commandMap.put("R", new RightCommand());
        commandMap.put("L", new LeftCommand());
        commandMap.put("J", new Jump());
                
    }
    
    private HashMap<String, Command> commandMap() {
        return this.commandMap;
    }
    public static Command commandForInput(String input) {
        return instance.commandMap().get(input);
    }
}