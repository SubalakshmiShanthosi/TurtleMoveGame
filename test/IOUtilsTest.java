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
import turtlemove.Grid;
import turtlemove.IOUtils;
import turtlemove.MainDriver;
import turtlemove.Position;

/**
 *
 * @author SUBA
 */
public class IOUtilsTest {
    
    public IOUtilsTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testInitiationOfGrid() throws FileNotFoundException, IOException {
    Grid grid=IOUtils.initializeGrid(new File("GridInitiation.txt"));
    Cell returnedInstance=grid.getCellForPosition(new Position(1,7));
    Assert.assertEquals("Grid initiation failed",returnedInstance.isIsObstacle(),true);
    Cell returnedInstanceTwo=grid.getCellForPosition(new Position(2,3));
    Assert.assertEquals("Grid initiation failed",returnedInstanceTwo.isIsObstacle(),false);
    
     }
}