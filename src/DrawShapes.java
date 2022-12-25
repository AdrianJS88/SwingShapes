import java.awt.*;
import javax.swing.*;

public class DrawShapes extends MyPanel {
    private static final int RECT_X = 200;
    private static final int RECT_Y = RECT_X;
    private static final int RECT_WIDTH = 300;
    private static final int RECT_HEIGHT = RECT_WIDTH;


    @Override
    public Dimension getPreferredSize() {
        // frame dimension
        return new Dimension(RECT_WIDTH + 2 * RECT_X, RECT_HEIGHT + 2 * RECT_Y);
    }

    // create the GUI explicitly on the Swing event thread
    public static void createAndShowGui() {
        DrawShapes mainPanel = new DrawShapes();

        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    }



