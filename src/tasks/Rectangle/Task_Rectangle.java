package tasks.Rectangle;

import java.awt.*;

public class Task_Rectangle {
    /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan tasks.Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
    int width;
    int length;
    int cevre;
    int alan;

    public Task_Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
        cevre=(length+width)*2;
        alan= length*width;
    }
}
