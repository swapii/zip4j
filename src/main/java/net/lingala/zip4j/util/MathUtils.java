package net.lingala.zip4j.util;

public class MathUtils {

    /**
     * Clone of {@link java.lang.Math#negateExact(long)} for support older versions of JRE (including old Android).
     *
     * Returns the negation of the argument, throwing an exception if the
     * result overflows a {@code long}.
     *
     * @param a the value to negate
     * @return the result
     * @throws ArithmeticException if the result overflows a long
     * @since 2.6.1
     */
    public static long negateExact(long a) {
        if (a == Long.MIN_VALUE) {
            throw new ArithmeticException("long overflow");
        }
        return -a;
    }

}
