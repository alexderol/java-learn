package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    //public static void main(String[] args) throws FileNotFoundException {//read öncesi
    public static void main(String[] args) throws IOException {//ıoexception  haz adem IOException için
          /*

             Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


            Bir kod yazilirken olasi exception'lar ongorulup
            exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.


                 1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                     2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */


        FileInputStream fis = new FileInputStream("src/j29_Exceptions/ebikGabık");
        // ilgili dosayaya ulaşmak için fis obj tanımlandı parametre olarak ulaşılcak dosya yolu (path ) girildi
        /*
        eğer bir method Checked CTE riskli olan exception varasa method sinature (method name den sonraki bölüm) hata uyarısı verir
        kırmızı çizigi yani..........komut derlemesine izin vermez ve kod üzerine gelindğinde add...exception  handle tavsiye eder.
        otomatik throws exception eklenir...bu şekilde methodu call eden komutların try cathc alınması garanti yol olur
         */

        int k;

        while ((k = fis.read())!=-1){
            System.out.print((char) k);
        }
        System.out.println("sorun handle edildi");

        //aksiyonları yap throws exception yap denir ama kod burada kırılır






    }

}
