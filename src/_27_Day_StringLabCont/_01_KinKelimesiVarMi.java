package _27_Day_StringLabCont;

public class _01_KinKelimesiVarMi {
    public static void main(String[] args) {

        System.out.println(kinKelimesi("Kinlenmek"));
        System.out.println(kinKelimesi("Kin tutmak"));
        System.out.println(kinKelimesi("Ekin ektim"));
        System.out.println(kinKelimesi("Keskin ilcesinden geciyorum."));
        System.out.println(kinKelimesi("Neden kin tutuyorsun"));


//        String kelime= "kinlenmek";
//        String kotrol="Kin";
//        System.out.println(kinKelimesi2(kelime, kotrol));
    }

// Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
// ilk karakterden sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
//Kinlenmek true
//Kin tutmak true
//Ekin ektim true
//Keskin ilçesinden geçiyorum false Neden kin tutuyorsun false

    public static boolean kinKelimesi(String str){
        if ((str.substring(0,3).equalsIgnoreCase("kin") || str.substring(1,4).equalsIgnoreCase("kin"))){
            return true;
        }return false;
    }


//    public static boolean kinKelimesi2(String str,String target){
//        if (target==null) return false;
//        str=str.toLowerCase();
//        target=target.toLowerCase();
//        return str.startsWith(target) || str.substring(1).startsWith(target);
    }


//}
