import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//  nested class example

public class Window extends JFrame {
    JTextArea textArea;
    JLabel welcome;
    public Window(String title)  {
        super(title);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        JLabel label = new JLabel("What is your name?");
        label.setBounds(50, 50, 400, 20);
        this.add(label);

        this.textArea = new JTextArea("Enter name");
        this.textArea.setBounds(50, 80, 400, 20);
        this.add(textArea);

        JButton button = new JButton("Submit");
        button.setBounds(200,110,100,30);

        this.welcome = new JLabel("Welcome");
        this.welcome.setBounds(50,150,400,20);
        this.add(welcome);

        button.addActionListener(new ListenerExample());

        this.add(button);
        this.setVisible(true);

    }

    class ListenerExample implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            welcome.setText("Welcome, " + textArea.getText());
        }
    }

    public static void main(String[] args) {
        Window window = new Window("My First Window");
    }
}
