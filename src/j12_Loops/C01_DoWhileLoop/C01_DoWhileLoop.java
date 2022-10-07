package j12_Loops.C01_DoWhileLoop;

public class C01_DoWhileLoop {

    public static void main(String[] args) {
        /*
        while loop -->önce şart kontrol edilir eğer şart sonucu true alınırsa body run olur
        do-while loop--> önce body action çalışır sonra şart kontrol edilir.şart true ise run olur false ise
        döngü kırılır ve sonraki ilk satır çalışır---daha çok game app de kullanılır
         */
        //TRİCK-->while loop şart sağlanmazsa hiç çalışmaya bilir ama do-while şart sağlasın sağlamasın en az bir kez çalışır

        int yas=33;

        while (yas<33){
            System.out.println("agam yas " + yas + " gayet basarılı");
            System.out.println("while body action....");yas++;
        }
        do {
            System.out.println("agam yas 33 gayet basarılı :)");
            System.out.println("do while body action");
            yas++;
        }while (yas<33);

    }
}
