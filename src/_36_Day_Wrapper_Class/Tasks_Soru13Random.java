package _36_Day_Wrapper_Class;

import java.util.Random;

public class Tasks_Soru13Random {





        public static void main(String[] args) {
//int[] arr={1,2,3};
            //  System.out.println(enCokVeriyiDondur(arr));
            System.out.println(enBuyukIkinciSayi(randomSayiAta(10, 10, 1000)));

        }

        //Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
        //arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
        //(Array.sort kullanılmayacak)

        public static int enBuyukIkinciSayi(int[] arr){
            int max=maxArray(arr);
            int enBuyukIkinciSayi=arr[0];
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]>=enBuyukIkinciSayi&&arr[i]!=max){
                    enBuyukIkinciSayi=arr[i];
                }
            }
            return enBuyukIkinciSayi;
        }
        public static int maxArray(int[] arr){
            int max=arr[0];
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]>=max){
                    max=arr[i];
                }
            }
            return max;
        }

        public static int[] randomSayiAta(int boyut, int from,int to){
            int[] arr=new int[boyut];
            Random random=new Random();

            for (int i = 0; i < arr.length ; i++) {
                arr[i]=random.nextInt(to-from)+from; // aradaki fark içeriye minimumda dışarıya artı olarak yazılır.
            }
            return arr;

        }










        //Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız.
        // (eşitlik durumda herhangi birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
        //[2,3,3,3,6,6,5,6,3] → 3 [2,4,5,8,8] → 8
        //[2,4,5,8] → -1

        public static int enCokVeriyiDondur(int[] arr){
            int maxCount=1;
            int deger=0;
            for (int i = 0; i < arr.length ; i++) {
                int count=0;
                for (int j = 0; j <arr.length ; j++) {
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>maxCount){
                    maxCount=count;
                    deger=arr[i];
                }
            }

            if(maxCount==1){
                return -1;
            }
            return deger;





        }



    }


