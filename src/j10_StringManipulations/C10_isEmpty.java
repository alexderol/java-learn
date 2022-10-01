package j10_StringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {
    /*
  StringIsEmpty
   String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
  isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
  Yani o String'in length() 0 demektir.
  *///yani Stringin dengi 0 demek
        String s="hi";
        System.out.println(s.isEmpty());// false verdi çünkü s de bir değer atanmış
        System.out.println(s.replaceAll("\\w", "").isEmpty());//true oldu çünkü s nin içini hiçlik yaptık yani boşalttık o yüzden isEmpty ile içi boş mu dedik evet boş yani true oldu
                        //   tam buranın üstü methodchain oldu yani method zinci ////






    }

}
