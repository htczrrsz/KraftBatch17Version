package _43_Day_InheritanceAndAccessKeyword;

import _42_Day_StaticAndInheritance.Papagan;

public class Main {
    public static void main(String[] args) {


      Banka.karsilama();
      Banka banka1= new Banka();

      banka1.bankName="Akbank";
      banka1.genelMerkezAdresi="Ankara yenimahalle 13.sokak";
       banka1.genelMerkezTel="03123664578";

      Musteri musteri=new Musteri();


    }
}
