import java.util.*;

import jdk.internal.jshell.tool.resources.l10n;

public class test {

    public static void main(String[] args) {
        
        int[] arr = {1,3,2,4};

        for(int i: arr) System.out.print(i+" ");
        System.out.println();

        Arrays.sort(arr);
        
        for(int i: arr) System.out.print(i+" ");
        System.out.println();

        System.out.print(Arrays.asList(arr).indexOf(3));
        
    }

}
