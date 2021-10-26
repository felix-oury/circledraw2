import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Circle c;
    private Rect r;
    private Square s;

    // The constructor
    public Drawing(Circle circle,Rect rect,Square square) {
        c=circle;
        r=rect;
        s=square;

        setupFrame();
        Background();
    }

    private void Background() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window");// Instantiates the Frame
        f.add(this);// Adds the Canvas to the Frame
        f.setLayout(null);// Stops the frame from trying to layout contents
        f.setSize(400, 400);// Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }


    public void paint(Graphics g){//method
        c.draw(g);
        r.draw(g);
        s.draw(g);
    }
}