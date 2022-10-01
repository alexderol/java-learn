package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        //TASK--> String type verilen iki adet bağış miktarını toplayan code create edin
        String bagıs1="1500";
        String bagıs2="2500";

        int sayıBagıs1=Integer.valueOf(bagıs1);//artık String içindeki sayı değerleri integer a çevrildi şimdi git topla
        int sayıBagıs2=Integer.valueOf(bagıs2);
        System.out.println("toplam bağış değeri = "+ (sayıBagıs1+sayıBagıs2));//4000

        int yeni =Integer.parseInt(bagıs1)+Integer.parseInt(bagıs2);// burada ınteger kullanarak direkt topla o da aynısı
        System.out.println(yeni);
        //Double.parseDouble() primitive double değer döndürür. Double.valueOf wrapper Double değer döndürür.
        // Biri sınıf değeri biri temel değişken tipi olarak dönüş sağlar. merve hanım yazdı anlamazsan sor

        int tc=1234567;
        String str =String.valueOf(tc);
        System.out.println(str);

        String fiyat = "$150";//fiyatı "150" yapmalıyız $ dan kurtul replaceAll ile kaldırabilirsin $ ı


        int yeniFiyat=Integer.valueOf(fiyat);



    }
}
