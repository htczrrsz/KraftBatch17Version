package _14_Day_NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {

// ekran ciktisii asagidaki gibi olacak sekilde yazdirin.
        // 111111
        // 111111
        // 111111
        // 111111
        // 111111


//        for (int i=1; i<=6; i++){
//            System.out.print(1);
//        }

        for (int i=1 ; i<=6; i++){
            for (int j=1; j<=6; j++){
                System.out.print(1);
            }
            System.out.println();
        }


        System.out.println("==========");

        for (int i=1 ; i <=6; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

// *
// **
// ***
// ****
// *****
// ******


        System.out.println("-------------------");


//******
//*****
//****
//***
//**
//*

        for (int i=6; 0<=i ; i--){         // ---> satir
            for (int j=1; j<=i ; j++){     // ---> sutun duzenliyor.
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
