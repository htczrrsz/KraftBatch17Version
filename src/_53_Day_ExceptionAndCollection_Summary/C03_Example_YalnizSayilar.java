package _53_Day_ExceptionAndCollection_Summary;

import java.util.*;

public class C03_Example_YalnizSayilar {
    public static void main(String[] args) {



        List<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(3,3,4,5,9,9,7,1,1));
//        list.addAll(Arrays.asList(3,3,4,5,9,9,7,1,1,2,2));
        System.out.println(unique(list));
        System.out.println(list);

        System.out.println(uniqSayilar(list));

//        List<Integer> list=new ArrayList<>();
//        list.addAll(Arrays.asList(2,2,5,6,9,5,8,4,6,7));
//        System.out.println(unique(list));

    }


    // listin icindeki cifti olmayan yalniz sayilari bulan (unique) ve list olarak donduren metod

    public static List<Integer> unique (List<Integer> list){
        int count= list.size();
        List<Integer> resultList= new ArrayList();

        while (!list.isEmpty()){
            int deger=list.get(0);
            list.removeAll(Arrays.asList(list.get(0)));
            if (list.size()==count-1){
                resultList.add(deger);
            }
            count= list.size();
        }
        return resultList;
    }



//List'in içerindeki eşi olmayan (çifti olmayan) uniq sayıları bulun list olarak döndürelim ;
    //2,2,5,6,9,5,8,4,6
//5,6,9,5,8,4,6
//6,9,8,4,6
    public static List<Integer> uniqSayilar(List<Integer> list){
        int count= list.size();
        List<Integer> resultList=new ArrayList();

        while(!list.isEmpty()) {
            int deger=list.get(0);
            list.removeAll(Arrays.asList(list.get(0)));
            if(list.size()==count-1) {
                resultList.add(deger);
            }
            count= list.size();
        }
        return resultList;

    }

}
