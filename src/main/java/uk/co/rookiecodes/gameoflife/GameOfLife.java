package uk.co.rookiecodes.gameoflife;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GameOfLife {

    private final Map<String, Cell> state;

    public GameOfLife(Map<String, Cell> state) {
        this.state = state;
    }

    public Cell getCellAt(BigInteger x, BigInteger y) {
        return state.get(new Coordinate(x, y).coordinate());
    }

    public void nextGeneration() {
        Iterator stateIter = state.entrySet().iterator();
        while (stateIter.hasNext()) {
            Map.Entry pairs = (Map.Entry) stateIter.next();
            Cell currentCell = (Cell) pairs.getValue();
            if (currentCell.isAlive()) {
                // get list of all neighbour coordinates based on current cell
                // retrieve cells from neighbour coordinates
                // count how many are alive in state
                // if it has less than two live neighbours current cell marked as dead
                // put cell back in game state
                List<Cell> neighbours = currentCell.getNeighbours();
                for (Cell neighbour: neighbours) {
                    Coordinate neighbourCoordinate = neighbour.getCoordinate();
                    String coordinateHash = CoordinateUtils.generateCoordinateHash(
                            neighbourCoordinate.getX(), neighbourCoordinate.getY());
                    if (state.get(coordinateHash) != null) {
                        neighbour.alive(state.get(coordinateHash).isAlive());
                    }
                }

                int neighbourCellAliveCount = 0;
                for (Cell neighbourCell : neighbours) {
                    if (neighbourCell.isAlive()) {
                        neighbourCellAliveCount++;
                    }
                }

                if (neighbourCellAliveCount < 2) {
                    currentCell.dead();
                }



                // if it has 2 or 3 live neighbours
                // do nothing - it lives
                // if it has more than 3 live neighbours - dies from overcrowding
            }

        }
    }
}
