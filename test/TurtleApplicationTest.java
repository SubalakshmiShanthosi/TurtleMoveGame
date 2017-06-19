/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import turtlemove.Direction;
import turtlemove.GameHelper;
import turtlemove.Grid;
import turtlemove.IOUtils;
import turtlemove.Position;
import turtlemove.TurtleOrientation;

/**
 *
 * @author SUBA
 */
public class TurtleApplicationTest {
    
    public TurtleApplicationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void checkIllegalMove() throws FileNotFoundException, IOException {
       TurtleOrientation turtle=new TurtleOrientation();
       Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));     
       final String command="RFRFLFF";
       GameHelper game=new GameHelper(grid,turtle);
       game.startPlaying(command);
       Assert.assertEquals(game.getTurtle().getCurrentCell().getPosition(),new Position(4,1));
       Assert.assertEquals(game.getTurtle().getCurrentDirection(),Direction.E);
     }
     
     @Test
     public void checkObstacleHit() throws FileNotFoundException, IOException {
       TurtleOrientation turtle=new TurtleOrientation();
       Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));     
       final String command="FFRFF";
       GameHelper game=new GameHelper(grid,turtle);
       game.startPlaying(command);
       Assert.assertEquals(game.getTurtle().getCurrentCell().getPosition(),new Position(2,3));
       Assert.assertEquals(game.getTurtle().getCurrentDirection(),Direction.E);
     }
     @Test
     public void checkJumpOverHit()throws FileNotFoundException,IOException{
     TurtleOrientation turtle=new TurtleOrientation();
       Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));     
       final String command="JRJ";
       GameHelper game=new GameHelper(grid,turtle);
       game.startPlaying(command);
       Assert.assertEquals(game.getTurtle().getCurrentCell().getPosition(),new Position(4,3));
       Assert.assertEquals(game.getTurtle().getCurrentDirection(),Direction.E);
    
     }
}