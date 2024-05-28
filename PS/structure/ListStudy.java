import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStudy {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        List<String> test = new ArrayList<>(Arrays.asList("test"));
        test.add("1");

        ArrayList<String> test1 = new ArrayList<>() {{
            add("1");
            add("2");
            add("3");
        }};
        test1.add("5");

        System.out.println(test1);

        for (String ls : test1){
            ls = "12";
        }
        System.out.println(test1);

        System.out.println(test);


        System.out.println(test1);
    }
}
