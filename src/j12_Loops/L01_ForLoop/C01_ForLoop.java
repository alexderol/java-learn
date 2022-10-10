package j12_Loops.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // 41 kere maşallah yazdır

        /*
        loop- döngü tekrarrlanan aksiyonlar için kullanılan kod bloklarıdır
         */
        //
        for (int i = 1; i <=41 ; i++) {
            System.out.println(i+ ".maaşallah" );

        }
        System.out.println( "selam javacanlar bolcana offer");

        //TASK--iki basamaklı tek sayıları yazdırın

        for (int i = 11; i <99 ; i+=2) {
            System.out.print(i+ ".");

        }
        System.out.println("********* yukarısı amele kod\nAşağısı clean code");
        for (int i = 10; i < 100; i++) {
            if(i%2==1){
                System.out.print(i+" ");
            }

        }//çalışmayan loop
        for (int i = 0; i > 10; i++) {//şartı sağlamayan-- false olan for body run olmaz
                                      // kod kırılarak sıradaki satırdan devam eder yani 35 ten devam
            System.out.println("çalıştı mı ");

        }
        System.out.println("bu metni okuduysan yukarıdaki code run olmadı");
        //durmayan loop
        for (int i = 0; i >=0 ; i++) {//bu for jüpitere kadar gider :) sonsuz döngü
            System.out.println(i);

        }


    }
}
