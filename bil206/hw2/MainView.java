import javax.swing.*;

public class MainView {
    private Controller controller;
    private JTextField fileName;
    private int totalChars;
    private int totalCharsWithoutSpace;
    private static JFrame frame = new JFrame();
    private static JTextArea content;
    private static JLabel totalChar;
    private static JLabel totalCharWithoutSpace;

    public MainView(String title) {
        controller = new Controller(this);

        frame = createMenu(controller);

        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        menuBar.add(file);
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
    }

    private JFrame createMenu(Controller controller) {

        fileName = new JTextField();
        fileName.setBounds(10, 80, 180, 50);
        frame.add(fileName);

        ButtonGroup group = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("Count characters");
        radioButton1.addActionListener(controller);
        radioButton1.setActionCommand("countChar");

        JRadioButton radioButton2 = new JRadioButton("Radio Button 2");
        JRadioButton radioButton3 = new JRadioButton("Radio Button 3");
        JRadioButton radioButton4 = new JRadioButton("Radio Button 4");
        radioButton1.setBounds(10, 180, 180, 30);
        radioButton2.setBounds(10, 210, 180, 30);
        radioButton3.setBounds(10, 240, 180, 30);
        radioButton4.setBounds(10, 270, 180, 30);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(radioButton4);
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);


        JTextField textField = new JTextField("Text field");
        textField.setBounds(10, 350, 180, 50);
        frame.add(textField);

        JButton submit = new JButton("Submit");
        submit.setBounds(50, 450, 100, 30);
//        submit.addActionListener(controller);
//        submit.setActionCommand(radioButton1.isSelected() ? "countChar" : null);

        frame.add(submit);

        totalChar = new JLabel();
        totalChar.setBounds(210, 10, 380, 30);
        totalChar.setVisible(false);
        frame.add(totalChar);

        totalCharWithoutSpace = new JLabel();
        totalCharWithoutSpace.setBounds(210, 50, 380, 30);
        totalCharWithoutSpace.setVisible(false);
        frame.add(totalCharWithoutSpace);

        content = new JTextArea();
        content.setBounds(550, 50, 250, 500);
        content.setVisible(false);
        frame.add(content);

        return frame;
    }

    public void countChars() {
        frame.revalidate();
        frame.repaint();

        totalChar.setVisible(true);
        totalChar.setText("Total characters: " + totalChars);

        totalCharWithoutSpace.setVisible(true);
        totalCharWithoutSpace.setText("Total characters without space: " + totalCharsWithoutSpace);

        ButtonGroup group = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("Sort by character ascending");
        radioButton1.addActionListener(controller);
        radioButton1.setActionCommand("character-asc");

        JRadioButton radioButton2 = new JRadioButton("Sort by character descending");
        radioButton2.addActionListener(controller);
        radioButton2.setActionCommand("character-desc");

        JRadioButton radioButton3 = new JRadioButton("Sort by frequency ascending");
        radioButton3.addActionListener(controller);
        radioButton3.setActionCommand("frequency-asc");

        JRadioButton radioButton4 = new JRadioButton("Sort by frequency descending");
        radioButton4.addActionListener(controller);
        radioButton4.setActionCommand("frequency-desc");

        radioButton1.setBounds(210, 100, 340, 30);
        radioButton2.setBounds(210, 130, 340, 30);
        radioButton3.setBounds(210, 160, 340, 30);
        radioButton4.setBounds(210, 190, 340, 30);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(radioButton4);
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);
    }

    public void addContent(String contentText) {
        content.setText(null);

        frame.revalidate();
        frame.repaint();

        content.setVisible(true);
        content.setText(contentText);
    }
    public String getFileName() {
        return fileName.getText();
    }

    public int getTotalChars() {
        return totalChars;
    }

    public void setTotalChars(int totalChars) {
        this.totalChars = totalChars;
    }

    public void setTotalCharsWithoutSpace(int totalCharsWithoutSpace) {
        this.totalCharsWithoutSpace = totalCharsWithoutSpace;
    }

    public static JFrame getFrame() {
        return frame;
    }

    public static void setFrame(JFrame frame) {
        MainView.frame = frame;
    }
}
