import java.util.function.Function;

public class FunctionalInterFace {

    public static void main(String[] args) {
//        함수형 인터페이스
        RunSomething runSomething = () -> {
            System.out.println("hellow");
            System.out.println("lamda");
        };
        runSomething.doIt();
//        순수 함수
        RunMath runMath = (number) -> number+10;
        System.out.println(runMath.doIt(1));

//        기존 존재하는 함수형 인터페이스
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));
//         바로 구현하기
        Function<Integer,Integer> plus = (integer) -> 10+integer;
        System.out.println(plus.apply(1));
//        함수 조합
        Function<Integer,Integer> multiply2 = (i) -> i*2;
        System.out.println(plus.compose(multiply2).apply(1));
        System.out.println(plus.andThen(multiply2).apply(1));
    }
}
