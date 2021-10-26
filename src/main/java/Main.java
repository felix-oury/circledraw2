import java.awt.*;

public class Main{
    public static void main(String[] args) {

        Point p=new Point(200,200);
        Color c=new Color(0x992266);
        Circle cir=new Circle(p,c,100) ;

        Drawing d = new Drawing(cir);
    }
}
