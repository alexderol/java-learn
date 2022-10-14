package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {

        //TASK sayi arrayindeki son elemanları çarpımını print edencode create ediniz
        int sayi[][] = {{1, 2, 3}, {9, 8}, {24, 0, 4}};
        //0.kat    1.kat  2. kat
        int carpm = 1;

        for (int i = 0; i < sayi.length; i++) {

            System.out.println(carpm *= sayi[i][sayi[i].length - 1]);// son daire yi al

        }

    }


}

