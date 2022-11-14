package j26_Inheritance.inheritance02;

public class Cat extends Mammal {//Mammal parent class cat torun yani
    /*
    child class obj olmadan parent class variabl ve methodlara ulaşabilir

     */

    public Cat() {
        System.out.println(" CAT cons calıstı");

    }
    public Cat(String str) {
        this();
        System.out.println(super.c);
        System.out.println(" CAT parametreli cons calıstı");

    }
    int c=2;
    int d=5;

    @Override
    public void mC() {//Mammal parent den ezen method
        System.out.println(" mC --> CAT classtan method call ");
    }
}
