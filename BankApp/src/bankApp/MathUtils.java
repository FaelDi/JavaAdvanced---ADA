package bankApp;

public class MathUtils {

    public static final Integer NUMBER_ZERO = 0;
    public static final Double DOUBLE_ZERO = 0d;
    public static final Integer NUMBER_MIL = 1000;

    static Integer generateNumber(Integer max) {
        return (int) Math.floor(Math.random() * max + 1);
    }
}
