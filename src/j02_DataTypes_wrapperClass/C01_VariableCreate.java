package j02_DataTypes_wrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
        //1. yol...Best Practice(Recomended) tavsiye edilen
        int yas= 36;
        int maas= 37000;
        System.out.println(yas);// yaşı yazdırır
        System.out.println("yas");// burada yaş yazar ekranda

        //2. yol...
        int boy=175; // değeri atanmayan bir boy isminde bir int tanımlandı declaration
        System.out.println(boy);// değeri atanmamış değişkeni hiçbir aksiyonda kullanamazsınız
        boy=175;
        System.out.println("boyunuz"+ boy);

        //3. yol
        int yevmiye,age,kilo;//birden çok aynı tipte değişken tanılandı
        age=33;
        yevmiye=1000;
        kilo=99;// tanımlanan değişkenlere dere ataması yapıldı...

        int günlük=1500, yıl=2022, agırlık=99;
        // TRİCK bir varieble bir kez tanımlanabilir ama birden çok değer atanabilir
        System.out.println(günlük);
        günlük=1800;
        System.out.println("günlük son değeri" + günlük);


        /*
        denemeler başlıyor hayırlısıyla
         */
        int hafta=52;
        int day=365;
        int sezon=3;
        System.out.println("hafta sayısı "+hafta);
        System.out.println("day of the year account "+day );

        int elma,armut,domates,biber;
        elma=20;
        armut=25;
        domates=12;
        biber=15;
        System.out.println("meyve sebze fiyatları "+elma+armut+domates+biber);
        System.out.println("fiyatlarımız TL cinsindendir");
        System.out.println("elma fiyatı "+elma);
        System.out.println("armut fiyatı "+armut);
        System.out.println("domates fiyatı "+domates);
        System.out.println("biber fiyatı "+biber);

        int a=12;
        int b=23;
        System.out.println("a+b="+(a+b));
        System.out.println("iki sayının çarpımının yarısı= "+(a*b)/2);
        System.out.println("bunu \n nasıl yazdıracak");
        System.out.println("P\na\nz\na\nr\n");
        System.out.println("\"java\" ile hayat \'afilli\'");






    }



}
