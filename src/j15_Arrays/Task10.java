package j15_Arrays;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int [] arr={1,2,-3,4,-5,-6};
        isaret(arr);


    }

    private static void isaret(int[] arr) {
        int [] arrYeni= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                arrYeni[i]=arr[i]*-1;
            }else if(arr[i]<0){
                arrYeni[i]=arr[i]*-1;
            }
        }
        System.out.println("Arrays.toString(arrYeni) = " + Arrays.toString(arrYeni));
    }


}
