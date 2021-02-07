import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);


        JLabel name = new JLabel("What is your name?");
        name.setBounds(20, 20, 230, 20);
        frame.add(name);

        JTextArea textArea = new JTextArea("Enter your name");
        textArea.setBounds(250, 20, 230, 20);
        frame.add(textArea);

        JLabel surname = new JLabel("What is your surname?");
        surname.setBounds(20, 50, 230, 20);
        frame.add(surname);

        JTextField textField = new JTextField("Enter your surname");
        textField.setBounds(250, 50, 230, 20);
        frame.add(textField);

        JLabel genderLabel = new JLabel("What is your gender?");
        genderLabel.setBounds(20, 80, 230, 30);
        frame.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(250, 80, 100, 30);
        female.setBounds(370, 80, 100, 30);
        frame.add(male);
        frame.add(female);

        JLabel language = new JLabel("What is your favorite language?");
        language.setBounds(20, 120, 230, 70);
        frame.add(language);

        JCheckBox java = new JCheckBox("Java");
        JCheckBox c = new JCheckBox("C++");
        JCheckBox python = new JCheckBox("Python");
        JCheckBox php = new JCheckBox("PHP");
        java.setBounds(250, 120, 230, 20);
        c.setBounds(250, 140, 230, 20);
        python.setBounds(250, 160, 230, 20);
        php.setBounds(250, 180, 230, 20);
        frame.add(java);
        frame.add(c);
        frame.add(python);
        frame.add(php);


        JButton button = new JButton("Submit");
        button.setBounds(200, 220, 100, 50);
        frame.add(button);

    }
}
