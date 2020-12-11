import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass implements ActionListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Window");
        final TextField field = new TextField();
        field.setBounds(50, 50, 150, 20);
        Button button = new Button("Submit");
        button.setBounds(50, 100, 60, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                field.setText("Welcome");
            }
        });
        frame.add(button);
        frame.add(field);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
    }
}
