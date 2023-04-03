package _25_Day_Summary;

public class Homework11_Task7_StringUret {
    public static void main(String[] args) {

        System.out.println(yeniString());
    }
// Dün akşam eve giderken onları görmüştüm. Cümlesindeki ü harfinin
// önünde ve arkasında olan harflerden bir string üreten bir method yazın.

    public static String yeniString(){
        String cumle = "Dun aksam eve giderken onları gormuştum.";
        int uNunIndeksi = cumle.indexOf("u");
        int uNunLastIndeksi = cumle.lastIndexOf("u");
        String yeni= (cumle.substring(uNunIndeksi-1,uNunIndeksi+2).replace("u","").
                concat(cumle.substring(33).replace("u","")));
        return yeni;
    }


}
