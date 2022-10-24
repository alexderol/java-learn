package tasks;

import java.awt.*;

public class Task_Rectangle {
    /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
    int width;
    int length;

    public Task_Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    int cevre;
    int alan;

    public Task_Rectangle() {

    }

    public void Rectangle(){
        cevre=(width+length)*2;
        alan=width*length;
    }

   
}
