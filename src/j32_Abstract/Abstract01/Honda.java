package j32_Abstract.Abstract01;

public abstract class Honda {//parent abstract class

    public abstract void motor();

    void sunroof() {
        System.out.println("sunroof extra ucrete tabidir");
    }
// abstract parent classda variable tanımlanabilir mi--olur tanımlanabilir

    //variable'lar abstract olur mu?--kesinlikle olmaz

    abstract void koltuk();

    abstract void kapi();
 //final void finalMethod();// concrete method bodysiz olamaz
 //final abstract void finalMethod();//abstract method final olamaz
  // private void privateMethod();//concrete method bodysiz
    //static void gunesMethod();//concrete method bodysiz
    //static abstract void gunesMethod();//concrete method bodysiz

    ///Honda obj = new Honda();//melekler dogurmaz yani abstract class obj üretmez

}
