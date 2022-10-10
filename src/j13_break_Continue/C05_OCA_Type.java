package j13_break_Continue;

public class C05_OCA_Type {
    public static void main(String[] args) {


        int count = 0;
        //for (int row = 1; row <= 3; row++) {
        //    for (int col = 1; col <= 2; col++) {
        //        if (row * col % 2 == 0) continue;//raw*col cift ise bekleme yapma devam ticari: count artma
        //        count++;
        //    }
        //}
        //System.out.println(count);

        RAW_LOOP:
        for (int row = 1; row <= 3; row++)//dış loop
            //  System.out.println(); -> iç dış arası komut girerse looplar arası ilişki kopar
            for (int col = 1; col <= 2; col++) {//iç loop
                if (row * col % 2 == 0) continue RAW_LOOP;
                count++;
            }
    }


}

