
package turtlemove;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Grid {

 List<Cell>cells =new ArrayList<Cell>();
 int gridSize;

    public Grid(int gridSize, List<Cell> cells) {
        this.gridSize = gridSize;
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return cells;
    }
    public Cell getCellForPosition(Position pos)
    {
        for(Cell cell: cells){
            if(cell.getPosition().equals(pos))
                return cell;
        }
        return null;
    }
    public int getGridSize() {
        return gridSize;
    }
 
 public void printGrid()
 {
    for(Cell c : cells)
    {
        System.out.println(c.toString());
    }
 }
}
