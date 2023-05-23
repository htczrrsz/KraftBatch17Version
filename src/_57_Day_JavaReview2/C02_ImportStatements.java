package _57_Day_JavaReview2;


import static java.lang.Math.PI;    // static import
import static java.util.Arrays.sort;

import java.util.Arrays;    // regular import statement java.util package name Arrays


public class C02_ImportStatements {
    public static void main(String[] args) {


        String [] group =  {"Hans","Sam","Tony","Jony","Hergel","Frank"};


        Arrays.sort(group);
        System.out.println(Arrays.toString(group));


        System.out.println("PI = " + PI);
        sort(group);

    }
}
