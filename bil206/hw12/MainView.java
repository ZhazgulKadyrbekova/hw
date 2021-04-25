import javax.swing.*;

public class MainView {
    private static JFrame frame = new JFrame();
    private final Controller controller;
    private JTextField fileName;
    private JTextField search;
    private JTextField replace;
    private static JTextArea content;
    private int totalChars;
    private int totalCharsWithoutSpace;
    private static JLabel totalChar;
    private static JLabel totalCharWithoutSpace;
    private int totalWordsLength;
    private static JLabel totalWords;
    JRadioButton radioButton1 = new JRadioButton();
    JRadioButton radioButton2 = new JRadioButton();
    JRadioButton radioButton3 = new JRadioButton();
    JRadioButton radioButton4 = new JRadioButton();

    public MainView() {
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

        fileName = new JTextField("bbb.txt");
        fileName.setBounds(10, 20, 180, 30);
        frame.add(fileName);

        ButtonGroup groupMenu = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("Count characters");
        radioButton1.addActionListener(controller);
        radioButton1.setActionCommand("countChar");

        JRadioButton radioButton2 = new JRadioButton("Count words");
        radioButton2.addActionListener(controller);
        radioButton2.setActionCommand("countWords");

        JRadioButton radioButton3 = new JRadioButton("Divide into syllables");
        radioButton3.addActionListener(controller);
        radioButton3.setActionCommand("syllables");

        JRadioButton radioButton4 = new JRadioButton("Search");
        radioButton4.addActionListener(controller);
        radioButton4.setActionCommand("search");

        JRadioButton radioButton5 = new JRadioButton("Palindromes");
        radioButton5.addActionListener(controller);
        radioButton5.setActionCommand("palindromes");

        JRadioButton radioButton6 = new JRadioButton("Repeated symbols");
        radioButton6.addActionListener(controller);
        radioButton6.setActionCommand("repeatedSymbols");

        JRadioButton radioButton7 = new JRadioButton("Replace");
        radioButton7.addActionListener(controller);
        radioButton7.setActionCommand("replace");

        JRadioButton radioButton8 = new JRadioButton("Longest substring");
        radioButton8.addActionListener(controller);
        radioButton8.setActionCommand("substring");

        JRadioButton radioButton9 = new JRadioButton("Past form");
        radioButton9.addActionListener(controller);
        radioButton9.setActionCommand("past");

        JRadioButton radioButton10 = new JRadioButton("Future form");
        radioButton10.addActionListener(controller);
        radioButton10.setActionCommand("future");

        radioButton1.setBounds(10, 70, 180, 30);
        radioButton2.setBounds(10, 100, 180, 30);
        radioButton3.setBounds(10, 130, 180, 30);
        radioButton4.setBounds(10, 160, 180, 30);
        radioButton5.setBounds(10, 190, 180, 30);
        radioButton6.setBounds(10, 220, 180, 30);
        radioButton7.setBounds(10, 250, 180, 30);
        radioButton8.setBounds(10, 280, 180, 30);
        radioButton9.setBounds(10, 310, 180, 30);
        radioButton10.setBounds(10, 340, 180, 30);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(radioButton4);
        frame.add(radioButton5);
        frame.add(radioButton6);
        frame.add(radioButton7);
        frame.add(radioButton8);
        frame.add(radioButton9);
        frame.add(radioButton10);
        groupMenu.add(radioButton1);
        groupMenu.add(radioButton2);
        groupMenu.add(radioButton3);
        groupMenu.add(radioButton4);
        groupMenu.add(radioButton5);
        groupMenu.add(radioButton6);
        groupMenu.add(radioButton7);
        groupMenu.add(radioButton8);
        groupMenu.add(radioButton9);
        groupMenu.add(radioButton10);

        search = new JTextField("Text field 1");
        search.setBounds(10, 400, 180, 30);
        frame.add(search);

        replace = new JTextField("Text field 2");
        replace.setBounds(10, 430, 180, 30);
        frame.add(replace);

        JLabel notifier = new JLabel("<html> Please, use radio buttons <br/> in stead of submit </html>");
        notifier.setBounds(10, 460, 200, 100);
        frame.add(notifier);

        totalChar = new JLabel();
        totalChar.setBounds(210, 10, 380, 30);
        totalChar.setVisible(false);
        frame.add(totalChar);

        totalCharWithoutSpace = new JLabel();
        totalCharWithoutSpace.setBounds(210, 50, 380, 30);
        totalCharWithoutSpace.setVisible(false);
        frame.add(totalCharWithoutSpace);

        totalWords = new JLabel();
        totalWords.setBounds(210, 10, 380, 30);
        totalWords.setVisible(false);
        frame.add(totalWords);

        content = new JTextArea();
        content.setBounds(550, 0, 250, 600);
        content.setVisible(false);
        frame.add(content);

        return frame;
    }

    public void countChars() {
        frame.revalidate();
        frame.repaint();

        totalWords.setVisible(false);
        content.setVisible(false);

        totalChar.setVisible(true);
        totalChar.setText("Total characters: " + totalChars);

        totalCharWithoutSpace.setVisible(true);
        totalCharWithoutSpace.setText("Total characters without space: " + totalCharsWithoutSpace);

        ButtonGroup group = new ButtonGroup();
        radioButton1.setText("Sort by character ascending");
        radioButton1.addActionListener(controller);
        radioButton1.setActionCommand("character-asc");

        radioButton2.setText("Sort by character descending");
        radioButton2.addActionListener(controller);
        radioButton2.setActionCommand("character-desc");

        radioButton3.setText("Sort by frequency ascending");
        radioButton3.addActionListener(controller);
        radioButton3.setActionCommand("frequency-asc");

        radioButton4.setText("Sort by frequency descending");
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

        radioButton1.setVisible(true);
        radioButton2.setVisible(true);
        radioButton3.setVisible(true);
        radioButton4.setVisible(true);
    }

    public void countWords() {
        frame.revalidate();
        frame.repaint();

        totalWords.setVisible(true);
        totalWords.setText("Total words: " + totalWordsLength);

        totalChar.setVisible(false);
        totalCharWithoutSpace.setVisible(false);
        content.setVisible(false);

        ButtonGroup group = new ButtonGroup();
        radioButton1.setText("Sort by word ascending");
        radioButton1.addActionListener(controller);
        radioButton1.setActionCommand("word-asc");

        radioButton2.setText("Sort by word descending");
        radioButton2.addActionListener(controller);
        radioButton2.setActionCommand("word-desc");

        radioButton3.setText("Sort by frequency ascending");
        radioButton3.addActionListener(controller);
        radioButton3.setActionCommand("word-frequency-asc");

        radioButton4.setText("Sort by frequency descending");
        radioButton4.addActionListener(controller);
        radioButton4.setActionCommand("word-frequency-desc");

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

        radioButton1.setVisible(true);
        radioButton2.setVisible(true);
        radioButton3.setVisible(true);
        radioButton4.setVisible(true);
    }

    public void addContent(String contentText) {
        content.setText(null);

        frame.revalidate();
        frame.repaint();

        content.setVisible(true);
        content.setText(contentText);
    }

    public void addContentInBigFormat(String contentText) {
        content.setText(null);
        totalWords.setVisible(false);
        totalChar.setVisible(false);
        totalCharWithoutSpace.setVisible(false);
        radioButton1.setVisible(false);
        radioButton2.setVisible(false);
        radioButton3.setVisible(false);
        radioButton4.setVisible(false);
        content.setBounds(300, 0, 500, 600);
        
        frame.revalidate();
        frame.repaint();

        content.setVisible(true);
        
        content.setText(contentText);
    }

    public String getFileName() {
        return fileName.getText();
    }

    public void setTotalChars(int totalChars) {
        this.totalChars = totalChars;
    }

    public void setTotalCharsWithoutSpace(int totalCharsWithoutSpace) {
        this.totalCharsWithoutSpace = totalCharsWithoutSpace;
    }

    public void setTotalWordsLength(int totalWordsLength) {
        this.totalWordsLength = totalWordsLength;
    }

    public String getSearch() {
        return search.getText();
    }

    public String getReplace() {
        return replace.getText();
    }

}
