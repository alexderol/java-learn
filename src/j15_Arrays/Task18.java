package j15_Arrays;

public class Task18 {
    public static void main(String[] args) {
        //TASK -- sayı arraydeki iç arrayleri toplamını yeni bir arraya atayıp print eden code create ediniz

        // input int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 0, -41}}; daireleri topla yani
        // output int yeniArr[]={6,11,-7};

        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 0, -41}};

        int yeniArr[] =new int[sayi.length];
        int top=0;

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                top++;
            }

        }












    }
}