import java.util.Arrays;
import java.util.Collections;

public class Array{
    public static void main(String[] args) {

        Integer[] array = {1,3,2,4,5,6,7,8,9,10};

        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.sort(array);

        for(int i : array){
            System.out.print(i + " ");
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println();

        for(int i: array){
            System.out.print(i + " ");
        }


    }
}