package _45_Day_FinalHiddingAndAbstractClass;

 public abstract class  Animal {

    // alt siniflara kalitim versin ama obje olusturulmasin diyosak abstract kullaniriz.

     public abstract void konus(); // body'si olmaz abstract metodlarin.

// abstract metod abstract classlarda kullanilabilir


     public void hareketEt(){ // abstract olmadigi icin body zorunlu
         System.out.println("Hayvan hareket ediyor.");
     }

     int x=5;

   // Animal(){}




}
