package tasks.grade;

import java.util.ArrayList;
import java.util.List;

public class Student {
    /*
     Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
    derslerin toplam kredi miktarını return eden  toplamKredisi method
     */
    String name;
    int maxCredit = 10;

    ArrayList<Lesson> dersler = new ArrayList<>();

    public int toplamKredi() {

        int toplamKredi = 0;
        for (Lesson les : dersler) {
            toplamKredi += les.credit;

        }


        return toplamKredi;
    }
}
