/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlemove;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {
    public static Grid initializeGrid(final File file) throws FileNotFoundException, IOException
 {
        String st;
        List<Position> obstaclePositions = new ArrayList<>();
        final List<Cell> result = new ArrayList<>();
        if (file == null || !file.canRead()) {
            throw new IllegalArgumentException("file not readable: " + file);
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        Integer gridSize=Integer.parseInt(br.readLine().trim());
        while((st = br.readLine()) != null){
            String[] coordinates = st.trim().split(",");
            obstaclePositions.add(new Position(coordinates[0], coordinates[1]));
        }
        for(int i=1;i<=gridSize;i++){
            for(int j=1; j<=gridSize;j++){
                result.add(new Cell(i,j, obstaclePositions.contains(new Position(i, j))));
            }
        }
     return new Grid(gridSize, result);
 }
public static Turtle initializeTurtleOrientation(final File file,Grid grid) throws FileNotFoundException, IOException
{
    String st;
        if (file == null || !file.canRead()) {
            System.out.println(file.canRead());
            throw new IllegalArgumentException("file not readable: " + file);
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String currentDirection=br.readLine().trim();
        String[] coordinates = null;
        while((st = br.readLine()) != null){
             coordinates = st.trim().split(",");
        }
    return new Turtle(currentDirection.charAt(0),grid.getCellForPosition(new Position(coordinates[0],coordinates[1])));
}
}
