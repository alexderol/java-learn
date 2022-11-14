package j26_Inheritance.Task02;

public class SubClass extends SuperClass{

    public static void main(String[] args) {


        SubClass obj = new SubClass();
        obj.my_method();
    }

    int num= 10;

    public void  my_method(){
        göster();
        super.göster();//atadan süper ile gelir
        System.out.println("subClas int = "+ num);
        System.out.println("super.num = " + super.num);

    }

    @Override
    public void göster() {

        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }



}
