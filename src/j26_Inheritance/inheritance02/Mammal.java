package j26_Inheritance.inheritance02;

public class Mammal extends Animals {//Mammal Animalsa uzanır yani baba

    public Mammal() {// p siz cons
        this('Y');
        System.out.println("MAMMAL cons çalıştı");


    }

    public Mammal(char c) {// p li cons
        super(17);
        System.out.println("MAMMAL cons çalıştı");


    }

    public void mC() {
        System.out.println("mC--> Mammal classtan methhod call");
    }

    int m = 1;
    int c = 4;

    @Override
    public void mM() {//ezen method
        System.out.println("mM --> Mammal classtan call edildi");
    }
}
