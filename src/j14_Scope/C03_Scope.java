package j14_Scope;

public class C03_Scope {

    public static void main(String[] args) {

       C01_InstanceVariable kus= new C01_InstanceVariable();
       kus.name="HÜMA";
       kus.developerMı=false;

        System.out.println("kus = " + kus);//hüma
        C01_InstanceVariable.staticMethod();//class name ile static method call ettik
        kus.non_Static();



    }

}
