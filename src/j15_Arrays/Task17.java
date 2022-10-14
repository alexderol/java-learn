package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {
        //TASK sayı arryindeki en büyük elemanı print eden code create ediniz

        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 0, -41}};

        int maxEleman=sayi[0][0];
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j]>maxEleman){
                    maxEleman=sayi[i][j];
                }
            }

        }
        System.out.println(maxEleman);


    }

}
