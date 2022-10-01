package j04_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        System.out.println("   **** Increment---Artırma ******");

      //f int a=7;
      //f System.out.println(++a);//8 önce arttırır sonra yazdırır a 7 bir arttır a= 8 oldu
      //f System.out.println(a++);// a artık 8 olarak buraya geldi a++ önce yazdırır sonra arttırır yazdırınca 8 olur ancak aşağıya 9 gider
      //f System.out.println(a);//a 9 olarak geldi
      //f// System.out.println(a++ + ++a);// a 9 olarak geldi a++ önce yazdırır sonra arttırır a++ 10 olarak ++a ya gelir, ++a önce arttırır sonra yazdırır
      //f                                 // yani ++a 11 olur ikisinin toplamı 20 olur.

      //f System.out.println(a++);



        // TASK ->
        int k = 5;
                 //    6     6     7    7     7
       // int sonuc = ++k + k++ + k++ + --k + k;
        //++k--sonuç 6 k=6
        //k++--sonuc 7 k=6
        //k++--sonuc 7 k=7
        //--k--sonuç 6 k=6
       //k=6
      //f System.out.println(++k);//6 k aşağıya 6 gider
      //fSystem.out.println( k++);//6 k aşağıya 7 gider
      //fSystem.out.println( k++);//7 k aşağıya 8 gider
      //fSystem.out.println(++k);//9 k aşağıya 9 gider
      //fSystem.out.println(k);//9
      //fSystem.out.println(--k);//8 k aşağıya 8 gider

        int m=3;
        System.out.println(++m);//4 m 4
        System.out.println(m++);//4 m 5
        System.out.println(m);//5 m 5
        System.out.println(++m);//6 m 6
        System.out.println(--m);//5 m 5
        System.out.println(++m);//6 m 6
        System.out.println(--m);//5 m 5
        System.out.println("43. satırdaki toplam ="+ m++ + ++m);//5+7
////    m 7
        //        8 m8+8 m7 +8 m8+8m8+ 9m9
        int son=(++m + m-- + ++m + m + ++m);//8+8+8+8+9
        System.out.println("son = " + son);

        int n=2;
        int top=( m++ + ++n + n++ + --n);
//m++= 10 m ise9
        //++n= 3 n ise3
        //n++= 3 n ise 4
        //--n= 3 n ise 3

        System.out.println("yeni karmaşık işlemler");
        System.out.println("50. satır top = " + top);

        System.out.println("ayrı ayrı");
        System.out.println(m++);
        System.out.println(++n);
        System.out.println(n++);
        System.out.println(--n);






        ///   System.out.println(++k +""+ k++ +"" + k++ +""+ --k +""+ k-- + ""+ k);
		//System.out.println("sonuc = " + sonuc);
     ///   System.out.println("k = " + k);

               







    }





}
