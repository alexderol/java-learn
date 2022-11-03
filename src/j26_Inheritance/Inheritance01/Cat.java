package j26_Inheritance.Inheritance01;

public class Cat extends Mammal{//Mammal parent class cat torun yani
    /*
    child class obj olmadan parent class variabl ve methodlara ulaşabilir

     */

    public Cat() {
        System.out.println(" CAT cons calıstı");

    }
    public void cırmala(){

        System.out.println(" kedi fena cırmalar");
    }
}
