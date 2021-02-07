import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

class GraphExample extends JPanel {
    int start, end;
    int x = 100, y = 400, x1, y1, x2, y2;

    public GraphExample(int start, int end) {
        this.start = start;
        this.end = end;

        this.setLayout(null);
        this.setSize(200, 500);
        this.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        Stroke stroke = new BasicStroke(1f);
        g2d.setStroke(stroke);
        g2d.drawLine(0, y, 500, y);
        g2d.drawLine(x, 0, x, 500);



        g2d.setColor(Color.RED);
        // creates a solid stroke with line width is 2
        stroke = new BasicStroke(3f);
        g2d.setStroke(stroke);
//        g2d.drawLine(20, 90, 100, 40);

        x1 = start;
        y1 = start * start - 5;
        for (int i = start+10; i <= end; i+=10) {
//            g2d.drawLine(20, 20 + i*20, 200, 20 + i*10);

//            int y = i*i-5;


            x2 = i;
            y2 = i*i - 5;
            g2d.drawLine(x + x1, y - y1, x + x2, y - y2);

            x1 = x2;
            y1 = y2;

//            g2d.draw(new Line2D.Double(x1, y1, x2, y2));

        }
    }
}