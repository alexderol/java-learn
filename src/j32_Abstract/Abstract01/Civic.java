package j32_Abstract.Abstract01;

public class Civic extends Lastik {//Honda   parent abstract clasa extends child concrete class
/*
extend Honda yazılarak honda classa concrete bir civic clas tanımlandı
java cte verir
çözüm;
a- unimplemented(uygulanmamıs) method implement edilmeli
b- parent Honda clastan abstract keyword kaldırılmalı
c- concrete olan child civic clas abstract yapılmalı
 */

    //concrete clasta abstract method tanımlanır mı???
    //el-cevap--> sen sefil dünyalısın ne işin var meleklerle yani olmaz

    //public abstract void absmethod(); // ya class abstract olmalı yada method concrete body olmalı
    //Trick-->>> child concrete class parent abstract clasın abstract methodlarını mutlaka implement override etmek zorunda



    @Override
    public void motor() {
        System.out.println("1.6 eco motor az yakar cok kacar");
    }

    @Override
    void koltuk() {
        System.out.println("koltuklar timsah derisi");
    }

    @Override
    void kapi() {
        System.out.println("5 kapı sedan");
    }
    public int vites(){//concrete child method( cünkü bodysi var)

        return 5;
    }

    @Override
    public void lastikEbat() {
        System.out.println("21' lastik");

    }

   // Honda obj = new Civic();// honda oglu civic (hoda data typle civic obj create ettik)
   // Civic obj1 = new Civic();//civic oglu civic
}
