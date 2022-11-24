package j33_Interface;

public interface DisDonanim {

    public void kapi();//abstract method abstract yazmasına gerek yok

    void kaporta();//abstract method abstract yazmasına gerek   yok

    String RENK = "Kırmızı";//public static final variable--bunları yazmasakta başında var gibi yazsanda olur

    public default String sisLamp() {//default concrete method
        return "sisli havada dikkat";
    }

    static void aga() {
        System.out.println("sensiz olmaz sensiz olmaz ");
    }

    ///DisDonanim obj = new DisDonanim();//DisDonanim' is abstract; cannot be instantiated--obj olamaz

    /* public static void main(String[] args) {//bad practice-- projede tek bir main method ve main class kullanılır

         System.out.println(RENK);
         aga();//static method olduğu için call edilebilir

     */
    // public static default void sorunMethod() {}  -->static ve default aynı anda kullanılamaz
    static void anten(){
        System.out.println("yine antin kuntin işlerdesin");
    }


}



