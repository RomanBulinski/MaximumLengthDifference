import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.abs;

public class Main {


    public static int mxdiflg(String[] a1, String[] a2) {

        int a1max =a1[0].length();
        int a1min =a1[0].length();

        int a2max =a2[0].length();
        int a2min =a2[0].length();

        for( int i = 0 ; i < a1.length; i++  ){
            if( a1[i].length() > a1max ){
                a1max = a1[i].length();
            }
            if( a1[i].length() < a1min ){
                a1min = a1[i].length();
            }
        }

        for( int j = 0 ; j < a2.length; j++  ){
            if( a2[j].length() > a2max ){
                a2max = a2[j].length();
            }
            if( a2[j].length() < a2min ){
                a2min = a2[j].length();
            }
        }

        List<Integer> results = new ArrayList<>();

        results.add( abs(a1max - a2max) );
        results.add( abs(a1max - a2min) );
        results.add( abs(a1min - a2max) );
        results.add( abs(a1min - a2min) );

        Collections.sort(results);

        results.stream().forEach( n-> System.out.println(n) );

        return results.get(3);

    }


}
