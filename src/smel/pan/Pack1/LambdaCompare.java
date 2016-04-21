package smel.pan.Pack1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by SmelayaPanda on 20.04.2016.
 */
public class LambdaCompare {

    public static void main(String[] args) {

        /**
         * Compare sort a list of string in Java 7 and Java 8
         *
         * @lambda
         */

        List<String> names = Arrays.asList("Lisa", "Katya", "Oleg", "Leha");
//-----------------------------------------------------------------------------
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(names);
//-----------------------------------------------------------------------------
        Collections.sort(names, String::compareTo);
        System.out.println(names);
//-----------------------------------------------------------------------------
        Collections.sort(names, (b, a) -> b.compareTo(a));
        System.out.println(names);
//-----------------------------------------------------------------------------


    }
}

