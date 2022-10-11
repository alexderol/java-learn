package j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {
        int yas=33;//main method local variable
        System.out.println("yas = " + yas);//33

        for (int i = 0; i <7 ; i++) {//for bası
            System.out.print( yas+" :)");// yas local variabel aynı locale call edildi...
        }//for sonu
        //i=36; i yi burada çağırılmaz çünkü onun for scope dışında yani kendi çöplüğünde değil o doranın local variable

        yas=35;//localvariable localinde call edildi



    }
}
