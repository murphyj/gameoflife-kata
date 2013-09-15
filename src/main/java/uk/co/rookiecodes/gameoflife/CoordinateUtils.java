package uk.co.rookiecodes.gameoflife;

import java.math.BigInteger;

public class CoordinateUtils {

    public static String generateCoordinateHash(BigInteger x, BigInteger y) {
        int sum = x.intValue() + y.intValue();
        sum = sum * (sum + 1)/2 + y.intValue();
        return String.valueOf(sum);
    }
}
