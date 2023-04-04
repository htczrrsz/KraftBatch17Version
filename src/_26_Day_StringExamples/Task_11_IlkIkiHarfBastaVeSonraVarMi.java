package _26_Day_StringExamples;

public class Task_11_IlkIkiHarfBastaVeSonraVarMi {
    public static void main(String[] args) {

        System.out.println(ilkIkiHarfSondaVarMi("Ankara",2));
        System.out.println(ilkIkiHarfSondaVarMi("Kafka",2));
        System.out.println(ilkIkiHarfSondaVarMi("Salsa",2));
        System.out.println(ilkIkiHarfSondaVarMi("Saksi",2));

    }

// Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi
// sonunda yer alıyorsa true almıyorsa false yazdırın.

         public static boolean ilkIkiHarfSondaVarMi(String kelime, int ilkKacHarf){
           String str = kelime.substring(0,ilkKacHarf);
            return str.equalsIgnoreCase(kelime.substring(kelime.length()-ilkKacHarf)) ;

         }

}
