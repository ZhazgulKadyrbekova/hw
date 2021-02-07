import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Final extends JFrame {
    JButton btn;

    public Final(String title) {
        super(title);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);


    }

    class ActionListenerExample implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    public static void main(String[] args) {
        Final window = new Final("Final exam");
    }
}
