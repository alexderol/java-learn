package Tasks;

public class Task13 {
    public static void main(String[] args) {
        /*
A
B B
C C C
D D D D
E E E E E
F F F F F F
şekli yazdırınız
*/
        int harf=65;// A ascii değeri
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(harf+i);//apartmanlar değişiyor yani i

            }


        }

        System.out.println();//dumy




    }

}
