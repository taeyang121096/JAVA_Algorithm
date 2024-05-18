public class ComparableTest implements java.lang.Comparable {

    private int height;

    private int age;

    ComparableTest(int height, int age){
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        ComparableTest other = (ComparableTest) o;
        return this.age - other.age;
    }

    public static void main(String[] args) {

    }

}
