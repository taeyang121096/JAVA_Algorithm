import java.util.*;

public class ArrayStudy {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 5, 6, 4, 3};

        Arrays.sort(ints);

        for(int i : ints){
            System.out.print(i + " ");
        }

//        원시타입의 경우 사용할 수 없다, collections reverse order의 경우 comparaotr의 구현체로 레퍼런스 타입만 가능
//        Arrays.sort(ints, Collections.reverseOrder());

        Integer[] test = {1,2,3,41,2,3,56,4,3,6};

        Arrays.sort(test, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ?  1: -1;
            }
        });


        Arrays.sort(test, Collections.reverseOrder());

        for(int i : test){
            System.out.print(i+ " ");
        }

    }
}
