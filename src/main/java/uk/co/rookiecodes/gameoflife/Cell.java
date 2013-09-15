package uk.co.rookiecodes.gameoflife;

import java.util.List;

public class Cell {

    private Coordinate coordinate;
    private boolean alive = false;

    public Cell(Builder builder) {
        this.coordinate = builder.coordinate;
        this.alive = builder.alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public List<Cell> getNeighbours() {
        return coordinate.getNeighbours();
    }

    public void dead() {
        this.alive = false;
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    public void alive(boolean alive) {
        this.alive = alive;
    }

    public static class Builder {
        private Coordinate coordinate;
        private boolean alive;

        public Builder alive(boolean alive) {
            this.alive = alive;
            return this;
        }

        public Builder coordinate(Coordinate coordinate) {
            this.coordinate = coordinate;
            return this;
        }

        public Cell build() {
            return new Cell(this);
        }
    }

    public boolean equals(Cell c) {
        return this.coordinate.getX() == c.coordinate.getX() &&
               this.coordinate.getY() == c.coordinate.getY();
    }

    public String toString() {
        return "State[" + isAlive() + "] " + getCoordinate().toString() + " Location: " + getCoordinate().coordinate();
    }
}
