package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*Task--> kullanıcının cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000
        den fazla ise emekliliğinin,
        kullanıcının cinsiyeti erkek ise 65 yaşından büyük ve prim günü 7000
        den fazla ise emekliliğini kontrol edip kalan yıl ve prim gününü print eden
         code create ediniz
        * */

        Scanner scan = new Scanner(System.in);
        System.out.print("Cinsiyetinizi \n kadın için 'K' \n Erkek için 'E' \ngiriniz =");
        char cinsiyet = scan.next().charAt(0);

        if (cinsiyet=='K'){
            System.out.print("Yaşınızı Giriniz =");
            int yas = scan.nextInt();
            if (yas>60){//cinsiyet kontrol edildi

            System.out.print("Prim gününüzü giriniz = ");
            int prim = scan.nextInt();
            if (prim>6000){///prim günü 6000 den büyüklüğü kontrol edildi
                System.out.println("Emekli oldunuz güle güle harca");

            } else System.out.println("Emekliliğiniz için "+ (6000-prim)+ " gün prim yatırmanız lazım");

        }
            else System.out.println("emekliliğinize daha "+ (60-yas)+ " yıl var" );


        }
        else if (cinsiyet=='E'){
            System.out.print("Yaşınızı Giriniz =");
            int yas = scan.nextInt();
            if (yas>65){
            int prim = scan.nextInt();
            if (prim>7000){
                System.out.println("Emekli oldunuz muck muck");
            }else System.out.println("Emekliliğiniz için "+ (7000-prim)+ " gün prim yatırmanız lazım");

        } else System.out.println("emekliliğinize daha "+ (65-yas)+ " yıl var" );


        }
        else System.out.println("ne olduğunu yaz seni emekli edeyim");




    }
}
