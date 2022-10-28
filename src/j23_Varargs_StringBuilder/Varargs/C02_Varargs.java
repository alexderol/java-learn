package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method:
         */

        int arr [] = {24,42,33,19,34,45,58,38};

        // Task1 -> array elemanları toplamı print eden method create ediniz

        //Task2 -> task1 i varargs ile çalışınız
        System.out.println("arrTopla(arr) = " + arrTopla(arr));//task1 için
        System.out.println("varargs int değer toplam (24,42,33,19,34,45,58,38) = " + varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));

        //Trrrick de böyün -->varargs method parametreleri array gibi tanımladığı için varargs methoda parametre olarak array de verilebilir
        System.out.println("varargs int array değer toplam = " + varargsTopla(arr));

    }
    public static int arrTopla(int [] a){//task1 için
        int topla=0;
        for (int w:a) {
            topla += w;

        }


        return topla;
    }

    public static int varargsTopla(int ...b){//task2 iiçin
        int topla=0;
        for (int w:b) {
           topla += w;


        }

        return topla;
    }





}
