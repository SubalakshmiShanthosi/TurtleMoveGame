/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;

import java.util.Objects;

/**
 *
 * @author SUBA
 */
public class Position {
    private Integer xCoordinate,  yCoordinate;
    public Position(String x,String y)
    {
    xCoordinate=Integer.parseInt(x);
    yCoordinate=Integer.parseInt(y);
    }

    public Position(Integer xCoord, Integer yCoord) {
        this.xCoordinate = xCoord;
        this.yCoordinate = yCoord;
    }
    @Override
    public String toString() {
        return "Position{" + "xCoord=" + xCoordinate + ", yCoord=" + yCoordinate + '}';
    }
    @Override
   public boolean equals(Object obj) 
{
        Position position=(Position)obj;
        return this.xCoordinate==position.xCoordinate && this.yCoordinate == position.yCoordinate;
}
}
