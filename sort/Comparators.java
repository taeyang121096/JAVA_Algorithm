import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {

    public static void main(String[] args) {
//        익명 객체 : 이름이 존재 하지 않은 객체
//        반드시 상속할 대상이 있어야 한다. (타입이 존재하지 안힉 때문)

        List<Person> ls = List.of(
                new Person("test",1,2,3),
                new Person("test",3,2,3),
                new Person("test",4,2,3),
                new Person("test",2,2,3)
        );

        ls.stream().sorted(Comparator.comparing(Person::getAge).reversed())
                        .forEach(p -> System.out.println(p.getAge()));
        System.out.println(ls);


        Comparator<Test> comp = new Comparator<Test>() {
            @Override
            public int compare(Test o1, Test o2) {
                return o1.age - o2.age;
            }
        };
    }

    class Test {
        int age;
        int height;

        public Test(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public int getAge() {
            return age;
        }

        public int getHeight() {
            return height;
        }
    }
}
