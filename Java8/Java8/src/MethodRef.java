import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodRef {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
//        static method ref
        UnaryOperator<String> hi = Greeting::hi;
//        instance method ref
        UnaryOperator<String> hello = greeting::hello;
//      생성자
        Supplier<Greeting> newGreeting = Greeting::new;
        Function<String ,Greeting> greeting2 = Greeting::new;

//        임의의 인스턴스
        String[] names = {"keesun", "whiteship", "toby"};

        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }
}
