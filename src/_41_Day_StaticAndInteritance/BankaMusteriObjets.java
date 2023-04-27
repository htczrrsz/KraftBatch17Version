package _41_Day_StaticAndInteritance;

public class BankaMusteriObjets {
    public static void main(String[] args) {

        BankaMusteri harun= new BankaMusteri();

        System.out.println("harun.getHesapNo() = " + harun.getHesapNo());
        BankaMusteri hatice= new BankaMusteri();
        System.out.println("hatice.getHesapNo() = " + hatice.getHesapNo());
      //  hatice.setHesapNo(BankaMusteri.hesapNoOlustur(),"safak");

        System.out.println("hatice.getHesapNo() = " + hatice.getHesapNo());

        hatice.paraEkle(400);
        System.out.println("hatice.getBakiye() = " + hatice.getBakiye());
        hatice.paraEkle(300);
        System.out.println("hatice.getBakiye() = " + hatice.getBakiye());
        hatice.setAdSoyad("Hatice Zararsiz");
        System.out.println("hatice = " + hatice);
        BankaMusteri z=new BankaMusteri("Hatice",580,"12345");
        System.out.println("z = " + z);

BankaMusteri h=new BankaMusteri();
hatice.getHesapNo();
        System.out.println("z.getAdSoyad() = " + z.getAdSoyad());
        System.out.println("z.getHesapNo() = " + z.getHesapNo());

        BankaMusteri Mehmet = new BankaMusteri();

        Mehmet.setAdSoyad("Mehmet Arslan");
        Mehmet.getHesapNo();
        System.out.println("Mehmet = " + Mehmet);

        BankaMusteri aslan= new BankaMusteri();

        aslan.setAdSoyad("Aslan Arslan");
        System.out.println("aslan = " + aslan);

       // Mehmet.setHesapNo(BankaMusteri.yeniHesapOlustur(),"safak");  eger metod icinde private metodu cagirsaydik
      //  System.out.println("Mehmet.getHesapNo() = " + Mehmet.getHesapNo());

    }
}
