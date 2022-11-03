package j25_Encapsulation.Encapsulation03;

public class Car {
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
     olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.

     */
    private String model;
    private String renk;
    private int motor;
    private int yıl;

    public Car(String model, String renk, int motor, int yıl) {
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        setMotor(motor);
        //this.yıl = yıl;
        setYıl(yıl);
    }


    public Car() {//4. step
    }
    public void setMotor(int motor) {
        if(motor < 1000){
           this.motor = 1001;
            System.out.println("bisiklete bineydin 1000 altı motor mu olur");}
        else this.motor=motor;
    }

    public void setYıl(int yıl) {
        if(yıl<0){
            this.yıl=yıl*(-1);
            System.out.println("Mö araba mı vardı !!!");
        }else
            this.yıl = yıl;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public int getYıl() {
        return yıl;
    }


    @Override
    public String toString() {
        return "model='" + model + "\n" +
                "--> renk='" + renk + "\n" +
                "--> motor=" + motor +"\n"+
                "--> yıl=" + yıl ;
    }
}
