package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        //TASK--> arr elemanlarının tümünün çarpımını print eden code create ediniz

        int sayi[][]={{1,2,3},{9,8}};
        int çarpım=1;
        for (int i = 0; i < sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
                çarpım*=sayi[i][j];

            }

        }
        System.out.println(çarpım);

    }
}
