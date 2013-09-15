package uk.co.rookiecodes.gameoflife;

import org.junit.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;

public class GameOfLifeTest {


//    Any live cell with fewer than two live neighbours dies, as if caused by under-population.
//    Any live cell with two or three live neighbours lives on to the next generation.
//    Any live cell with more than three live neighbours dies, as if by overcrowding.
//    Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.


    public Map<String, Cell> initialState = new HashMap<String, Cell>();

    private Coordinate origin = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(0));
    private Coordinate neighbour = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(1));

    @Test
    public void aLiveCellWithFewerThanTwoNeighboursDies() {
        Cell originCell = new Cell.Builder().coordinate(origin).alive(true).build();
        Cell adjacentCell = new Cell.Builder().coordinate(neighbour).alive(true).build();

        initialState.put(origin.coordinate(), originCell);
        initialState.put(neighbour.coordinate(), adjacentCell);
        GameOfLife gameOfLife = new GameOfLife(initialState);

        Cell cell = gameOfLife.getCellAt(BigInteger.valueOf(0), BigInteger.valueOf(0));
        gameOfLife.nextGeneration();

        assertFalse(cell.isAlive());
    }
    
    @Test
    public void () {
        
    }
}
