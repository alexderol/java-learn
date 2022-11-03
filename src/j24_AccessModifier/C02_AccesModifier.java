package j24_AccessModifier;

public class C02_AccesModifier {
    public static void main(String[] args) {
        //C01_AccessModifier obj1 = new C01_AccessModifier();// private p siz cons call edilemez çünkü private
        C01_AccessModifier obj2 = new C01_AccessModifier(23,45);// public 2 p li cons

        obj2.protectedMethod();
        System.out.println(obj2.publicYas);
        System.out.println(obj2.protectedYas);
      //  obj2.privateMethod(); privaetMethod


    }
}
