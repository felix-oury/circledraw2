import shapes.Circle;
import shapes.Rect;
import shapes.Square;

import java.awt.*;

public class Main{
    public static void main(String[] args) {

        Point p1=new Point(200,200);
        Color c1=new Color(0x992266);
        Point p2=new Point(100,100);
        Color c2=new Color(0x5C9922);
        Point p3=new Point(300,300);
        Color c3=new Color(0x223699);
        Circle cir=new Circle(p1,c1,100) ;
        Rect rect= new Rect(p2,c2,140,40);
        Square carre= new Square(p3,c3,100);

        Drawing d = new Drawing(cir,rect,carre);
    }
}
