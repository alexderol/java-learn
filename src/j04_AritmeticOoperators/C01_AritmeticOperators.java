package j04_AritmeticOperators;

public class C01_AritmeticOperators {
    public static void main(String[] args) {

        /// % mod alınır yani kalanını alır
       // int numA=2;
       // numA= numA+3;  normalde böyle yazarsan amele işi olur peki nasıl olacak
        // numA+=3;

        double cont=5;
        cont+=3;


        cont+=12;//20
        cont+=13;//33
        cont+=15;//48
        cont-=5;//43
        cont*=2;//86
        cont/=6;//14
        System.out.println("cont = " + cont);






        //int numB=10;
        // numB= numB*7;
        //yukarıdaki gibi değil
           //     böyle yaz
        // numB*=7

///++variable

       int a=13;
       int b=17;
       int c=47;
        System.out.println(b+a*c);
        System.out.println(c-a/(b-c)+a*b);

        int g=2;
        int h=3;
        String s= "javaCAN";
                                        //
        //TASK-- g h s variable kullanarak 61JavaCAN-1 yazanı print edin

        System.out.println((g*h)+""+(h-g)+s+""+(g-h));// string için araya string koy yani ""
        //erol25yeni a=erol
        //b=2
        //c=5
        //d=yeni

        int e=5, z=5;
        String m="erol",n="yeni";
        System.out.println(m+e*z+n);
















    }




}
