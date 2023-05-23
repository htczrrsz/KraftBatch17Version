package _58_Day_JavaReviews3;

import java.util.*;

public class C04_CollectionReview {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        Integer[] array = set.toArray(new Integer[0]);  //  !!!!!!!!
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

//        List<String> name= null;
//        System.out.println("name.size() = " + name.size());   nullpointerexception

    }
}
