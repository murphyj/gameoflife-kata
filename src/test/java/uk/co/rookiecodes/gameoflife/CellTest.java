package uk.co.rookiecodes.gameoflife;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CellTest extends CoordinateTestSupport {

    Coordinate origin = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(0));

    private Cell originCell   = new Cell.Builder().coordinate(ORIGIN).build();
    private Cell nOriginCell  = new Cell.Builder().coordinate(N_ORIGIN).build();
    private Cell neOriginCell = new Cell.Builder().coordinate(NE_ORIGIN).build();
    private Cell eOriginCell  = new Cell.Builder().coordinate(E_ORIGIN).build();
    private Cell seOriginCell = new Cell.Builder().coordinate(SE_ORIGIN).build();
    private Cell sOriginCell  = new Cell.Builder().coordinate(S_ORIGIN).build();
    private Cell swOriginCell = new Cell.Builder().coordinate(SW_ORIGIN).build();
    private Cell wOriginCell  = new Cell.Builder().coordinate(W_ORIGIN).build();
    private Cell nwOriginCell = new Cell.Builder().coordinate(NW_ORIGIN).build();

    List<Cell> expectedNeighbours = new ArrayList<Cell>();

    @Before
    public void setUp() {
        expectedNeighbours.add(nOriginCell);
        expectedNeighbours.add(neOriginCell);
        expectedNeighbours.add(eOriginCell);
        expectedNeighbours.add(seOriginCell);
        expectedNeighbours.add(sOriginCell);
        expectedNeighbours.add(swOriginCell);
        expectedNeighbours.add(wOriginCell);
        expectedNeighbours.add(nwOriginCell);
    }

    @Test
    public void returnsAListOfCellsNeighbours() {
        List<Cell> neighbours = origin.getNeighbours();

        boolean found = false;
        for (Cell neighbour: neighbours) {
            int count = 0;
            for (Cell expectedNeighbour: expectedNeighbours) {
                if (neighbour.equals(expectedNeighbour)) {
                    found = true;
                    break;
                }

                if (count == expectedNeighbours.size()) {
                    fail("expectedNeighbour not found: " + expectedNeighbour);
                }
                count++;
            }
        }

        assertTrue(found);
    }
}
