import shapes.*;
import shapes.Shape;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas  implements Drawble
{
            ArrayList<Shape> shapes = new ArrayList<Shape>(); // FIELDS
            private Frame f; // =private field  of class frame, in awt
            private Circle c;
            private shapes.Rect r;
            private Square q;
            private Graphics g;

    public Drawing() //constructor
    {
        setupFrame();
        setupBackground();
    }
        public void addCircle(Point initPos, Color col, int radius) // Methods
        {
            Circle circ = new Circle(initPos,col,radius);
            shapes.add(circ);
        }

        public void addRect(Point initPos, Color col, int width, int height)
        {
            Rect rect = new Rect(initPos,col,width,height);
            shapes.add(rect);
        }

        public void addSquare(Point initPos, Color col, int side)
        {
            Square square = new Square(initPos, col, side);
            shapes.add(square);
        }


    private void setupBackground() {
        setBackground(Color.WHITE);  //sets Canvas background
        setSize(400,400);              // Sets Canavs size to same of frame
    }

    private void setupFrame() {
        f = new Frame("My window"); //instantiates Frame
        f.add(this);                //Adds Canvas to Frame
        f.setLayout(null);          //Stops frame from trying to layout contents
        f.setSize(400,400);         //Sets dimensions of frame
        f.setVisible(true);         //makes frame appear on screen
        f.addWindowListener(new WindowAdapter() //closes program if close window clicked
        {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });
    }


    public void paint (Graphics g)
    {
        for (Shape s: shapes)
        {
            s.draw(g);
        }
    }
}