package j12_Loops.C01_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //task-> girilen tam sayının pozitif tam bölen sayısını print eden code create edin
        //20-->1,2,4,5,10,20 20 nin 6 tane tam böleni var gibi
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı girin");
        int num = scan.nextInt();

        int bölenSayı=1;
        int tamBölenAdedi=0;

        while (bölenSayı<=num){
            if (num%bölenSayı==0){//sayı bölenSayıya tam bölünme şartı
                tamBölenAdedi++;
            }
            bölenSayı++;//loop sonsuza düşmemesi için ve diğer sayıların böldüğü kontrol edilmesi için yazıldı


        }
        System.out.println("girilen "+num+" sayısının "+tamBölenAdedi+ " kadar tam böleni var");









    }
}
