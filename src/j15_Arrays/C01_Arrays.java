package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
        Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
        Array olusturulurken 2 seyi declare etmeliyiz:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
        2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
        array= tepsiye benzer..
        Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */
        int a;//declare edilen ama atanmayan primitive data
        int Arr[];//declare edilen ama atanmayan int type Array
        //tanımlanan Array atama yapılmadan kullanılmaz
        String isimArr[] = {"muharrem", "enise", "cebrail", "nazım", "özge"};// hem declare hem de  tanımlanan String Array
        int sayiArr[] = new int[5];//java heap memory de 5 default ->0 int array creaet edildi
        //[0,0,0,0,0]  kutular hazır ama boş

        ///Array'a eleman ekleme...
        sayiArr[2] = 34;
        sayiArr[0] = 35;
        sayiArr[1] = 43;
        sayiArr[3] = 94;
        sayiArr[0] = 34;//0 index array elamanı 34 ile update edildi
        //array elemanları unique olmak zorunda değildir tekrarlı array elemanı olabilir

        //array eleman sayısı boyut değeri

        System.out.println("sayiArr.length = " + sayiArr.length);

        //array son elamanı bulma
        System.out.println("isimArr[isimArr.length-1] = " + isimArr[isimArr.length - 1]);

        isimArr[isimArr.length - 1] = "QA Özge hanım";///Array son eleman update edildi

        // array de olmayan eleman

        //OKKALI bir İNTERVİEW sorusu

        //sayiArr[11]=23;//cte vermez ama olmayan eleman olduğu icin rte verir


        //array elemanlarını print etme

        for (int i = 0; i < isimArr.length; i++) {
            System.out.print(isimArr[i] + " ");


        }
        System.out.println();
        System.out.println(isimArr);//heap memory referans değerini yazdırır

        //interview sorusu yukarısı dikkat
        System.out.println(Arrays.toString(isimArr));// isimArr Stringe çevrildi


        //TASK ---> sayiArr elemallırndan değeri tek olanları print eden code create ediniz

        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] % 2 == 1) {
                System.out.println(sayiArr[i]);
            }

        }

        //TASK--> sayiArr çift index elemanları print eden code create edin

        for (int i = 0; i < sayiArr.length; i+=2) {
            System.out.print(sayiArr[i]);//

        }


        //TASK--> isimArr 5 harfli elemanlarından oluşan arrayın elemanlarını print eden code create ediniz
        String yeniArr[]= new String[isimArr.length];//isimArr elemanı kadar boş bir yeni array oluşturdu
        int koltukSayısı=0;
        for (int i = 0; i < isimArr.length; i++) {
            if(isimArr[i].length()==5){
                koltukSayısı++;
                yeniArr[i]=isimArr[i];
                //System.out.println(Arrays.toString(yeniArr));
                System.out.println(koltukSayısı);


            }


        }
        /// Array elemanlarını naturel (k->b: ascending b->k : descending, alfabetikk) sırala

        System.out.println(Arrays.toString(isimArr));//sıralama öncesi
        Arrays.sort(isimArr);//isimArr elemanları naturel sıralanır
        System.out.println(Arrays.toString(isimArr));//sıralama sonrası

        System.out.println(Arrays.toString(sayiArr));//sıralama öncesi
        Arrays.sort(sayiArr);
        System.out.println(Arrays.toString(sayiArr));//sıralama sonrası


    }

}
