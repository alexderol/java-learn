package j21_ImmutableClass;

import java.util.ArrayList;

public class C06_OCA_ImmutableCLass {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("method öncesi values = " + values);//[]
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);

        for (Integer v : values) System.out.println(v);
        System.out.println("method sonrası values = " + values);//[6] -> arrayList mutable bir class'dır.


    }

}
