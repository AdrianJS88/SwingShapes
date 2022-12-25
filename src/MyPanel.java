import javax.swing.*;
import java.awt.*;



class MyPanel extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw Shapes here

        g.setColor(Color.blue);
        g.fillOval(50,50,70,70);
        g.drawOval(50,50,70,70);

        g.setColor(Color.red);
        g.fillOval(190,190,170,170);
        g.drawOval(50,50,70,70);

        g.setColor(Color.yellow);
        g.fillRect(120,120,120,120);
       g.drawRect(120,120,120,120);

        g.setColor(Color.black);
       g.drawString("ADRIAN" ,32,23);

        g.setColor(Color.red);
        g.drawRect(400, 410, 100, 100);

        g.setColor(Color.BLACK);
      g.drawArc(250,345,130,120,90,180);


    }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    DrawShapes.createAndShowGui();
                }
            });
    }}

