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
import java.util.Scanner;
/**
 *
 * @author SUBA
 */
public class MainDriver {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Grid grid = IOUtils.initializeGrid(new File("GridInitiation.txt"));
        grid.printGrid();
    }
}
