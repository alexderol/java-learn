package j11_MethodCreation;

public class C04_MethodDepo {


    //main method olmayacak
    /*
    Her class da main methoda gerek yoktur. Belirli aksiyonlara özel classlar tanımlanabilir
     */

    public static void gecmeNotu(int not){
        if(not>=85){
            System.out.println("agam tebrik cooook basarılısın :)");
        }else if (not>=70){
            System.out.println("agam basarılı");
    }else if (not>=60){
            System.out.println("agam sadece gectin");
        }else if (not>=45){
            System.out.println("agam ucuz yırttın :)");
        }else System.out.println(" agam fena caktın :(");
    }
    public static void topla(int a, int b){
        System.out.println(a+b);
    }




}
