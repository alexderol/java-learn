package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        System.out.println("ll1 = " + ll1);//[javaCAN,Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
        //LİnkdList remove()...ilk node silinir ve silinen node return edilir
        System.out.println("ll1.remove() = " + ll1.remove());//javaCAN
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]

        System.out.println("ll1.remove(3) = " + ll1.remove(3));//Adem->silinen node return eder.
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, javaCAN, Merve]

        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));//true
        System.out.println("ll1.remove(\"javaTAR\") = " + ll1.remove("javaTAR"));//false->olmayan node false olan node true return eder
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, javaCAN]

        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));//true
        System.out.println("ll1 = " + ll1);//[Gülsüm, Ebubekir, İlker, javaCAN]

        System.out.println("ll1.element() = " + ll1.element());//ilk node return eder-> Gülsüm

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan", "Harun", "Haluk", "Hasmayan"));

        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));//
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
        //LinkedList get() getFirst() getLast()....girilen index ve ilk son node return eder..
        System.out.println("ll2.get(2) = " + ll2.get(2));//Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//javaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast());//Hasmayan

    }
}
