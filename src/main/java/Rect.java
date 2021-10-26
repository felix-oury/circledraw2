import java.awt.*;

public class Rect extends Shape{
    private int width;// Fields
    private int length;

    public Rect(Point initPos, Color col, int width, int length){ // The constructor
        super(initPos,col);
        this.width=width;// Initialize fields
        this.length=length;

    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,length);
    }
}