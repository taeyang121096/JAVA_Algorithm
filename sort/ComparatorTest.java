import java.util.Comparator;

public class ComparatorTest implements Comparator<ComparatorTest> {

    private int age;

    private int height;

    public ComparatorTest(int age, int height) {
        this.age = age;
        this.height = height;
    }

    @Override
    public int compare(ComparatorTest o1, ComparatorTest o2) {
        return o1.age - o2.age;
    }


    public static void main(String[] args) {

    }

}
