package shapes;

import java.awt.*;

public class Square extends Rect{
    private int size;
    //whats up bpys1
    
    public Square(Point initPos, Color col, int size){ // The constructor
        super(initPos,col,size,size);
        this.size=size;// Initialize fields

    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,size,size);
    }
}
