import java.util.*;

enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    private final int value;

    Rainbow(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class test {

    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();

        for (Rainbow rb : arr) {
            System.out.println(rb.getValue());
        }
    }

}
