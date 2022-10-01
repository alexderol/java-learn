package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen String içindeki istenen index deki karakteri print eden code create edin
         */
        //Scanner scan = new Scanner(System.in);
        //System.out.println(" kelime gir");
        //String str = scan.nextLine();
        //System.out.println("istediğin karakter için index gir");
        //int index = scan.nextInt();
        //if (str.length() > index) {
        //    System.out.println(str.substring(index, index + 1));//bu olur burada ayrıcı substring(5,6) bu 5i al ama 6 yı alma demek ya burdan düşün
        //    System.out.println(str.charAt(index));//bu da olur ikiside olur yani
        //} else System.out.println("girilen index metinden büyük olamaz ki ");
        String a="girilen kelime bu olsu";
        //System.out.println(a.substring(a.indexOf('l'),a.indexOf('e')));
                                        //5               6
        System.out.println(a.substring(a.lastIndexOf('s',a.lastIndexOf('s'))));
        int b  =10;
        System.out.println(b=+2);


    }
}
