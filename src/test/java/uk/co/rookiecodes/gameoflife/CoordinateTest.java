package uk.co.rookiecodes.gameoflife;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class CoordinateTest {

    @Test
    public void hashcodeSupportsNegativeCoordinates() {
        Coordinate negativeCoordinate = new Coordinate(BigInteger.valueOf(-1), BigInteger.valueOf(0));
        assertTrue(negativeCoordinate.hashCode() != 0);
    }

    @Test
    public void hashcodeOppositeNegativeXandYCoordinateNotEqual() {
        Coordinate yCoordinate = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(-1));
        Coordinate xCoordinate = new Coordinate(BigInteger.valueOf(-1), BigInteger.valueOf(0));
        assertNotSame(yCoordinate.hashCode(), xCoordinate.hashCode());
    }

    @Test
    public void hashcodeOppositePositiveXandYCoordinateNotEqual() {
        Coordinate yCoordinate = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(1));
        Coordinate xCoordinate = new Coordinate(BigInteger.valueOf(1), BigInteger.valueOf(0));
        assertNotSame(yCoordinate.hashCode(), xCoordinate.hashCode());
    }
}
