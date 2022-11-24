package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("nur","Gamze","Erol","Bekir"));
        System.out.println("l1 list ilk hali  --> " + l1);
        //l1 elemanları for lop kullanarak print ediniz

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        System.out.println("*********\n");
        System.out.println();

        ///foreachLoop yazdır

        for (String w:l1 ) {
            System.out.print(w+" ");
        }

        //l1 elemanlarına :)  for loop ile update edip print edin

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i,l1.get(i)+":)");//i yi getir set et
        }
        System.out.print("updat sonrası l1 "+l1);

        ///l1 elamnlarına for each ile :) set et

        for (String w:l1 ) {
            w=w+":(";


        }
        System.out.println(l1);

        /*
        ındex desteklemeyen yapılarda tekrarlayan aksiyon icin for each loop update yapamayabilir yukarıdaki son örnekte olduğu gibi l1 değismedi
        bu durumda java iterator interface inden tanımlanacak variable ile bu tekrarlayan aksiyonlar index olmaksızın yapılır
        */
        System.out.println("*******ITERATORS*******\n\n");

        Iterator<String> it1=l1.iterator();
        while (it1.hasNext()){//it1 elemanları için pointer olduğu yerde true yoksa false verir ve pointer bir sonraki eleman önüne koyulur

             System.out.println(it1.next() + " ");//list in pounter önündeki elemanını return eder
        }
        List<String> l2 = new ArrayList<>(Arrays.asList("baran","gülsüm","akif","nazım"));
        System.out.println("iterator öncesi l2---> "+l2);
        Iterator<String> it2 = l2.iterator();
        while (it2.hasNext()){//hikaye şu hasNext pointer sonra eleman var mı diye bakar varsa döngü devam yoksa durur
            it2.next();//döngüde sıradaki elemanı getirir
            it2.remove();//getirelen elemanı silerrr
        }
        System.out.println("iterator remove sonrası l2 ---> "+l2);//sonucta da döngü tamamlanana kadar l2 de kimse kalmaz herkes silinir
        System.out.println("********LİSTİTERATORS******\n\n");

        List<String> l3 = new ArrayList<>(Arrays.asList("Baran","Gülsüm","Akif","Nazım"));
        //l3 elemanlrını iterator ile :) set ediniz

        ListIterator<String> it3= l3.listIterator();
        System.out.println("listIterator öncesi l3--> "+l3);
        while (it3.hasNext()){

            it3.set(it3.next().toUpperCase() + ":)" );
        }
        System.out.println("listIterator sonrası l3--> "+l3);

        List<String> l4 = new ArrayList<>(Arrays.asList("Serhat","Yakup","Mustafa","Nazlı"));
        System.out.println("islem öncesi l3--->"+l3);
        //l4 elamanlarının ilk harfi buyuk kalan harfi küçük yappı l4 e ekle
        ListIterator<String> it4 = l3.listIterator();//ilimanlır l3 ten alır
        String eklenen=" fenerBahce";
        int eklencekMi=1907;
        String ekle="sampiyon";
        while (it4.hasNext()){

            it4.set(it4.next().toUpperCase().charAt(0)+"***");///next ile gelen l4 elemanı ilk harf büyük kalan üüc harf * ile set edildi
            it4.add(String.valueOf(eklencekMi));//l3 e l4 add edildi
            it4.add(eklenen);//l3 e l4 add edildi
            it4.add(ekle);//l3 e l4 add edildi
        }
        System.out.println("islem sonrası----> "+l3);







    }
}
