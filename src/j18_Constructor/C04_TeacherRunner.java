package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
        C04_Teacher hoca= new C04_Teacher();
        hoca.ad="erol";
        hoca.soyAd="Demir";
        hoca.brans="matematik";
        hoca.id=1907;
        hoca.maaş=23000;
        hoca.tecrübe=15;
        hoca.emekli=false;




        C04_Teacher hocaHanım=  new C04_Teacher("halide","demir",15,"türkce",3999,10,false);
        System.out.println(hocaHanım);

        hoca.dersSaati();


    }

}
