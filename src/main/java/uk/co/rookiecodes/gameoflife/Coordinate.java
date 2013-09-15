package uk.co.rookiecodes.gameoflife;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Coordinate {

    private final BigInteger x;
    private final BigInteger y;

    public Coordinate(BigInteger x, BigInteger y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 373; // Constant can very, but should be prime
        hash = 37 * hash + getX().intValue();
        hash = 37 * hash + getY().intValue();
        return hash;
    }

    public String coordinate() {
        return BigInteger.valueOf(hashCode()).toString();
    }

    public BigInteger getX() {
        return x;
    }

    public BigInteger getY() {
        return y;
    }

    public List<Cell> getNeighbours() {
        List<Cell> neighbours = new ArrayList<Cell>();
        neighbours.add(new Cell.Builder().coordinate(this.north()).build());
        neighbours.add(new Cell.Builder().coordinate(this.northEast()).build());
        neighbours.add(new Cell.Builder().coordinate(this.east()).build());
        neighbours.add(new Cell.Builder().coordinate(this.southEast()).build());
        neighbours.add(new Cell.Builder().coordinate(this.south()).build());
        neighbours.add(new Cell.Builder().coordinate(this.southWest()).build());
        neighbours.add(new Cell.Builder().coordinate(this.west()).build());
        neighbours.add(new Cell.Builder().coordinate(this.northWest()).build());
        return neighbours;
    }

    private Coordinate north() {
        return new Coordinate(getX().add(BigInteger.valueOf(1)), getY());
    }

    private Coordinate northWest() {
        return new Coordinate(getX().add(BigInteger.valueOf(1)), getY().subtract(BigInteger.valueOf(1)));
    }

    private Coordinate west() {
        return new Coordinate(getX(), getY().subtract(BigInteger.valueOf(1)));
    }

    private Coordinate southWest() {
        return new Coordinate(getX().subtract(BigInteger.valueOf(1)), getY().subtract(BigInteger.valueOf(1)));
    }

    private Coordinate south() {
        return new Coordinate(getX(), getY().subtract(BigInteger.valueOf(1)));
    }

    private Coordinate southEast() {
        return new Coordinate(getX().subtract(BigInteger.valueOf(1)), getY().add(BigInteger.valueOf(1)));
    }

    private Coordinate east() {
        return new Coordinate(getX(), getY().add(BigInteger.valueOf(1)));
    }

    private Coordinate northEast() {
        return new Coordinate(getX().add(BigInteger.valueOf(1)), getY().add(BigInteger.valueOf(1)));
    }
}
