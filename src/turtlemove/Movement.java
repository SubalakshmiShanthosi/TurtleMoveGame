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
public enum Movement {
  F("F");
  private String text;

  Movement(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }

  public static Movement fromString(String text) {
    for (Movement b : Movement.values()) {
      if (b.text.equalsIgnoreCase(text)) {
        return b;
      }
    }
    return null;
  }
}