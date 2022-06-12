import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Lamda {
    public static void main(String[] args) {
        Lamda lamda= new Lamda();
        lamda.run();
    }
    private void run(){
        int baseNumber = 10;
//        로컬 클래스
        class LocalCalss{
            int baseNumber = 11;
            void printBaseNumber(){
                System.out.println(baseNumber);
            }
        }
//      익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };
        integerConsumer.accept(11);
//      람다
        IntConsumer printInt = (i) -> System.out.println(i+baseNumber);
    }
}
