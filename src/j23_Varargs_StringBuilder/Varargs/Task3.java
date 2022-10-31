package j23_Varargs_StringBuilder.Varargs;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task--> girilen bir sayı ile girilen String lerin en uzun hafr sayısını çarpıp print eden methot create ediniz
         */

        int sayi = 5;

        String str1 = "Muharrem";
        String str2 = "ugur";
        String str3 = "ebikGabık";
        carpStringTopla(3,str1,str2,str3);


    }

    public static void carpStringTopla(int carpacak, String... str) {
        String enUzun = "";

        for (String avuc : str) {// en uzun kelimeyi bulmak için yaptık bunu aşağıda çarptık
            if (avuc.length() > enUzun.length()) {
                enUzun = avuc;
            }

        }
        System.out.println("tasta istenilen = " +carpacak * enUzun.length()+" en uzun kelime ise "+enUzun);
    }


}
