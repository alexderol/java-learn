package j18_Constructor;

public class MyConstructor {

    int x = 3;
    int y = 5;

    public MyConstructor() {
        x += 1;// ins variable update edildi
        System.out.println("-x" + x);//-x4
    }

    public MyConstructor(int i) {
        this();// p siz constructor call
        this.y = i;//cons parametresi i değri inst variable a yani y ye atandı
        x += y;
        System.out.println("-x" + x);//-x7

    }

    public MyConstructor(int i, int i2) {
        this(3);
        this.x -= 4;//7-4=3  int x variable 3 update edildi
        System.out.println("-x" + x);//-x3
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4, 3);
    }
}




