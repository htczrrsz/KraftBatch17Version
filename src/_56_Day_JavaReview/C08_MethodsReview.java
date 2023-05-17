package _56_Day_JavaReview;

public class C08_MethodsReview {
    public static void main(String[] args) {


        String str1= "Disaster";

        printEach(str1);

        System.out.println("---------------------");

        int[] arr= {1,2,3,4,5};

        printEach(arr);


    }

       public static void printEach(String str){
           for (int i = 0; i <str.length() ; i++) {
               System.out.println(str.charAt(i));
           }
       }


        public static void printEach (String[] arr){
           for (String each : arr){
               System.out.println(each);
            }
        }



         public static void printEach (int[] arr){
           for (int each : arr){
             System.out.println(each);
            }
         }




}
