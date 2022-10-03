package j11_MethodCreation;

import static j11_MethodCreation.C04_MethodDepo.topla;

public class C04_MethodCreation {
    public static void main(String[] args) {
        String name = "haluk";
        System.out.println(" car car "+name);
        C04_MethodDepo.gecmeNotu(24);//depoclastan class name ile method call ettik
        //classname (C04_MethodDepo) bu classdaki methodu run eder

        topla(3,5);//8
        //Yani kendi clasından method çağırdığın gibi başka clasdan çağırabilirsin
        /*
        farklı class dan method call etmek için...
        1. method static--> gökteki güneş (güneş olsun ki her gezegenlere gidebilsin)
        2. ClassName.methodName() şeklinde call edilir. aynı clastaki method methodName ile call edilir


         */
        selamVer();//aynı class dan methodName ile call edin
        C03_MethodOverloading.topla(36,1);//37


    }
    public static void selamVer(){
        System.out.println("agam selamlar Devamkeeee :)");
    }


}
