/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import turtlemove.Cell;
import turtlemove.Command;
import turtlemove.Direction;
import turtlemove.Grid;
import turtlemove.IOUtils;
import turtlemove.TurtleOrientation;

/**
 *
 * @author SUBA
 */
public class TurtleTest {
    
    public TurtleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp(){
        }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void checkTurtleInitialConfiguration() 
     { 
        TurtleOrientation turtleInstance;
        turtleInstance = new TurtleOrientation();
        Assert.assertEquals(turtleInstance.getCurrentDirection(),Direction.N);
        Assert.assertEquals(turtleInstance.getCurrentCell().toString(),new Cell(1,1,false).toString());
     }
     @Test
     public void checkForwardMove() throws FileNotFoundException, IOException
     {
       TurtleOrientation turtle=new TurtleOrientation();
       Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));
       turtle.move(grid, turtle,"F");
       Assert.assertEquals(turtle.toString(),new TurtleOrientation(Direction.N,new Cell(1,2,false)).toString());
     }
     @Test
     public void checkChangeInFacingDirection()throws FileNotFoundException, IOException
     {
       TurtleOrientation turtle=new TurtleOrientation();
       Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));
       turtle.move(grid, turtle,"L");
       Assert.assertEquals(turtle.toString(),new TurtleOrientation(Direction.W,new Cell(1,1,false)).toString());
       turtle.move(grid, turtle,"R");
       Assert.assertEquals(turtle.toString(),new TurtleOrientation(Direction.N,new Cell(1,1,false)).toString());
     }
     
}
    
