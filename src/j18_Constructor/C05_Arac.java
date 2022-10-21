package j18_Constructor;

public class C05_Arac {
    //field yani objenin ürtilirken alacağı değerler instance variablellar
    //bir classta birden çok constructor tanımlanır overloading yani
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */
    int maxHiz;
    String model;

    public C05_Arac() {//parametresiz constructor -----------------------

    }

    public C05_Arac(int maxHiz) {// bir parametreli constructor
        this(180,"HacıMurat");// 2 parametreli constructor call edilir
        this.maxHiz = maxHiz;
        maxHiz=maxHiz;//this olmadığı için parametre değeri instance variable a atanmaz obje değerini instance da ne varsa o yazar
        System.out.println(" bu seferde bir parametreli constructor call edildi");
    }

    public C05_Arac(int maxHiz, String model) {// iki parametreli constructor
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println(" bu yazıyı okuduysan iki parametleri constructor call edilmiştir");
    }
    public C05_Arac( String model,int maxHiz) {// iki parametreli constructor parametre sırası değişik o yüzden olur
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println(" bu yazıyı okuduysan iki parametleri constructor call edilmiştir");
    }

}
