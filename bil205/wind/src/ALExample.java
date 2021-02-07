import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ALExample {

    public static void main(String[] args) {
        Frame frame = new Frame("Action Listening Window");
        JLabel label = new JLabel("What is your name?");
        label.setBounds(50, 50, 300, 20);
        frame.add(label);

        JTextField field = new JTextField("name");
        field.setBounds(50, 80, 300, 20);
        frame.add(field);

        Button button = new Button("Submit");
        button.setBounds(100, 110, 60, 30);

        JLabel welcome = new JLabel("Welcome ");
        welcome.setBounds(50, 150, 300, 50);
        frame.add(welcome);

        button.addActionListener(new ListenerExample(field, welcome));
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent actionEvent) {
//                welcome.setText("Welcome " + field.getText().toUpperCase());
//            }
//        });
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

class ListenerExample implements ActionListener {
    JTextField field;
    JLabel label;

    public ListenerExample(JTextField field, JLabel label) {
        this.field = field;
        this.label = label;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        this.label.setText("Welcome " + this.field.getText().toUpperCase());
    }
}
