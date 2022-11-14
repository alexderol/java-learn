package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        //NumberFormatException--> sayı formatında olmayan bir datayı parseInt() method run ederek Integer e çevrildiğinde oluşan RTE Exception dır
        //java da String içinde ki rakam karakterler parseInt ile int değere atanabilir
        String str = "1907";
        System.out.println(str + 5);//19075 concat oldu
        int sayiStr=Integer.parseInt(str);// str sayiStr ye atandı int oldu
        System.out.println(sayiStr);//1907
        System.out.println(sayiStr + 5);//1912

        //String id="57l622";
        //System.out.println(Integer.parseInt(id));//NumberFormatException çünkü id içinde "l" girilmiş  dolayıslma Integer.parseInt() çalışamaz
        String id="57l622";
        try {
            System.out.println(Integer.parseInt(id));
            System.out.println("try çalışmış demektir bunu gördüysen catch çalışmadı");


        }catch (NumberFormatException e){
            System.out.println("try çalışmamış ki catch çalışıyor şuan ");
        }
        System.out.println("handle edilmiş kod kırılmamıştır");

    }
}
