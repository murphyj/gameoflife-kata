package uk.co.rookiecodes.gameoflife;

import java.math.BigInteger;

public class CoordinateTestSupport {

    public static final Coordinate ORIGIN    = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(0));
    public static final Coordinate N_ORIGIN  = new Coordinate(BigInteger.valueOf(1), BigInteger.valueOf(0));
    public static final Coordinate NE_ORIGIN = new Coordinate(BigInteger.valueOf(1), BigInteger.valueOf(1));
    public static final Coordinate E_ORIGIN  = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(1));
    public static final Coordinate SE_ORIGIN = new Coordinate(BigInteger.valueOf(-1), BigInteger.valueOf(1));
    public static final Coordinate S_ORIGIN  = new Coordinate(BigInteger.valueOf(-1), BigInteger.valueOf(0));
    public static final Coordinate SW_ORIGIN = new Coordinate(BigInteger.valueOf(-1), BigInteger.valueOf(-1));
    public static final Coordinate W_ORIGIN  = new Coordinate(BigInteger.valueOf(0), BigInteger.valueOf(-1));
    public static final Coordinate NW_ORIGIN = new Coordinate(BigInteger.valueOf(1), BigInteger.valueOf(-1));

}
