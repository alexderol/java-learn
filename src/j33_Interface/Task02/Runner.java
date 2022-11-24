package j33_Interface.Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

       Vehicle bus = new Bus("xc90","beyaz");
       Vehicle bus1 = new Bus("xc90","beyaz");
       Vehicle tesla = new TeslaCar("mekme","mekme");
       Vehicle tesla2 = new TeslaCar("mekme","mekme");
       Vehicle toy = new ToyotaPirus(" mekamia","emkeme");
       Vehicle toy2 = new ToyotaPirus(" mekamia","emkeme");

       List<Vehicle> buslist = new ArrayList<>(Arrays.asList(bus,bus1));

        List<List<Vehicle>> araclistesi = new ArrayList<>();
       araclistesi.add(buslist);
       araclistesi.add(Arrays.asList(tesla,tesla2));







    }

}
