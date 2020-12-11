import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame panel = new JFrame("My frame");
        panel.setSize(500, 400);
        panel.setLayout(null);
        panel.setVisible(true);


        JLabel name = new JLabel("What is your name?");
        name.setBounds(20, 20, 230, 20);
        panel.add(name);

        JTextArea textArea = new JTextArea("Enter your name");
        textArea.setBounds(250, 20, 230, 20);
        panel.add(textArea);

        JLabel surname = new JLabel("What is your surname?");
        surname.setBounds(20, 50, 230, 20);
        panel.add(surname);

        JTextField textField = new JTextField("Enter your surname");
        textField.setBounds(250, 50, 230, 20);
        panel.add(textField);

        JLabel genderLabel = new JLabel("What is your gender?");
        genderLabel.setBounds(20, 80, 230, 30);
        panel.add(genderLabel);

        String[] gender= { "Male", "Female", "Prefer not to say" };
        JComboBox comboBox = new JComboBox(gender);
        comboBox.setBounds(250, 80, 230, 30);
        panel.add(comboBox);

        JLabel language = new JLabel("What is your favorite language?");
        language.setBounds(20, 120, 230, 70);
        panel.add(language);

        DefaultListModel<String> languages = new DefaultListModel<>();
        languages.addElement("Java");
        languages.addElement("Python");
        languages.addElement("C");
        languages.addElement("PHP");
        JList<String> list = new JList<>(languages);
        list.setBounds(250, 120, 230, 70);
        panel.add(list);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem item1 = new JMenuItem("New"),
                item2 = new JMenuItem("Save"),
                item3 = new JMenuItem("Exit");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menuBar.add(menu);
        panel.setJMenuBar(menuBar);

        JOptionPane.showMessageDialog(panel, "Hello");

        JLabel age = new JLabel("What is your age?");
        age.setBounds(20, 200, 230, 100);
        panel.add(age);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(250, 200, 230, 100);
        panel.add(scrollBar);

        JPanel jPanel = new JPanel();
        jPanel.setBounds(190, 310, 120, 70);
        jPanel.setBackground(Color.cyan);
        panel.add(jPanel);

        JButton button = new JButton("Submit");
        button.setBounds(200, 320, 100, 50);
//        jPanel.add(button);
        panel.add(button);

    }
}
