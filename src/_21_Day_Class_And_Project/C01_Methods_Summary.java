package _21_Day_Class_And_Project;

public class C01_Methods_Summary {
    public static void main(String[] args) {



//int x= seven();
//        System.out.println(x);

        seven2();


    }

// f()=7
   // public static int seven(){
//        return 7;
//    }



    public static int seven2() {
        int i = 0;
        while (true) {
            i++;
            if (i == 5) {
                continue;
            } else if (i == 7) {
               // return i;
                break;  // eger buraya return i; yazarsak buraya geldiginde dirrekt metoddan cikardi. seven2 metodundan
            }
            System.out.print(i+ " ");
        }
        return i;
    }
}
