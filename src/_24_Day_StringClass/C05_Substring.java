package _24_Day_StringClass;

public class C05_Substring {
    public static void main(String[] args) {

        String str="Java Programming Language";
        //          0123456789012345678901234   24

        // SUBSTRING metodu iki sekilde kullanilabilir.
        // Tek parametreli , girilen indeksten baslayip sonuna kadar yazar
        // cift parametreli, girilenden baslayip ikinciye kadarkine kadar yazar. ikinci dahil DEGIL !

        System.out.println(str.substring(5)); // Programming Language
        System.out.println(str.substring(0)); //hepsii gelcek
        System.out.println(str.substring(str.length())); //emptyIndex , hiclik ""

        System.out.println(str.substring(str.length() - 3)); //age

        // SUBSTRING(beginningIndex, EndingIndex) ama endingIndex dahil degil.
        System.out.println(str.substring(2, 4)); //va
        System.out.println(str.substring(5, 16)); // programming

        System.out.println(str.substring(0, 1)); // J
        System.out.println(str.substring(str.length()-1,str.length())); //sonuncusu --> e
        System.out.println(str.substring(5, 5));  //hicbi sey
    //    System.out.println(str.substring(5, 3)); //hata verir. runtime error. ancak calistigi zaman verir.


    }
}
