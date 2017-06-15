/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import turtlemove.Grid;
import turtlemove.IOUtils;
import turtlemove.Turtle;

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
     public void checkMoveOnObstacleHit() throws FileNotFoundException, IOException {
       Turtle turtle=new Turtle();
       Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));     
     
     }
}