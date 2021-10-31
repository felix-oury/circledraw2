import shapes.Circle;
import shapes.Drawble;
import shapes.Rect;
import shapes.Square;

import java.awt.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Point p1=new Point(50,50);
        Color c1=new Color(0x992266);
        Point p2=new Point(100,100);
        Color c2=new Color(0x5C9922);
        Point p3=new Point(250,250);
        Color c3=new Color(0x223699);


        Drawing d = new Drawing();
        d.addCircle(p1,c1,100);
        d.addRect(p2,c2,200,100);
        d.addSquare(p3,c3,100);
    }
}
