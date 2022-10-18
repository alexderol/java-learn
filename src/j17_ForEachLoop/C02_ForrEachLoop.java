package j17_ForEachLoop;

public class C02_ForrEachLoop {
    public static void main(String[] args) {
        // TASK array elemanlarının çarpımını print eden code create ediniz
        //nested forech var yani

        int arr [][]={{2,3},{4},{5,6,7}};
        int carp=1;

        for (int [] i : arr  ) {
            for (int j: i ) {
                carp*=j;

            }

        }
        System.out.println( carp);


    }
}
