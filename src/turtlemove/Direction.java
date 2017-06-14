/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;
public enum Direction {
  E("E"),
  W("W"),
  N("N"),
  S("S");

  private String text;

  Direction(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }

  public static Direction fromString(String text) {
    for (Direction b : Direction.values()) {
      if (b.text.equalsIgnoreCase(text)) {
        return b;
      }
    }
    return null;
  }
}