import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Example extends JFrame {
    JTextField field1, field2;
    JTextArea textArea;
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    JButton go, func;

    public Example(String title) {
        super(title);

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);

        JLabel label1 = new JLabel("x start:");
        label1.setBounds(10, 20, 180, 30);
        this.add(label1);

        this.field1 = new JTextField("Text Field 1");
        this.field1.setBounds(200, 20, 290, 30);
        this.add(field1);

        JLabel label2 = new JLabel("x end:");
        label2.setBounds(10, 70, 180, 30);
        this.add(label2);

        this.field2 = new JTextField("Text Field 2");
        this.field2.setBounds(200, 70, 290, 30);
        this.add(field2);

        ButtonGroup group = new ButtonGroup();
        this.radioButton1 = new JRadioButton("Find max");
        this.radioButton2 = new JRadioButton("Find root");
        this.radioButton3 = new JRadioButton("Find square");
        this.radioButton4 = new JRadioButton("Print points");
        this.radioButton1.setBounds(10, 120, 180, 20);
        this.radioButton2.setBounds(10, 140, 180, 20);
        this.radioButton3.setBounds(10, 160, 180, 20);
        this.radioButton4.setBounds(10, 180, 180, 20);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(radioButton4);
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);
//        this.add(group);

        this.go = new JButton("GO!");
        this.go.setBounds(200, 120, 290, 35);
        this.go.addActionListener(new ActionListenerExample());
        this.add(go);

        this.func = new JButton("Draw function");
        this.func.setBounds(200, 165, 290, 35);
        this.func.addActionListener(new ActionListenerExample());
        this.add(func);

        JLabel result = new JLabel("Result");
        result.setBounds(10, 220, 180, 20);
        this.add(result);

        this.textArea = new JTextArea("Text Area");
        this.textArea.setBounds(200, 220, 290, 100);
        this.add(textArea);
    }

    class ActionListenerExample implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            int start = Integer.parseInt(field1.getText());
            int end = Integer.parseInt(field2.getText());
            Integer res;
            // F(x)=x*x-5
            if (actionEvent.getSource() == go && radioButton1.isSelected()) {
                Integer max = Integer.MIN_VALUE;
                res = 0;
                for (Integer i = start; i <= end; i++) {
                    res = i*i-5;
                    if (res > max)
                        max = res;
                }

                textArea.setText(String.valueOf(max));
            }

            else if (actionEvent.getSource() == go && radioButton2.isSelected()) {
                double startD = (double) start, endD = (double) end, epsilon = 0.000001, mid;

                while (endD - startD > epsilon) {
                    mid = (startD + endD)/2;
                    if ((endD * endD - 5) * (mid * mid- 5) <= 0)
                        startD = mid;
                    else
                        endD = mid;
                }

                textArea.setText(String.valueOf((startD + endD) / 2));
            }
            else if (actionEvent.getSource() == go && radioButton3.isSelected()) {
                int area = 0;
                for (int i = start; i <= end; i++) {
                    if (i == 0)
                        continue;
                    area += Math.abs(i*i-5);
                }

                textArea.setText(String.valueOf(area));
            }
            else if (actionEvent.getSource() == go && radioButton4.isSelected()) {

                String text = "x   f(x)\n";

                for (Integer i = start; i <= end; i++) {
                    res = i*i-5;
                    text+=(i.toString() + "   " + res.toString() + "\n");
                }
                textArea.setText(text);
            }
            else if (actionEvent.getSource() == func) {
                GraphExample mainPanel = new GraphExample(start, end);

                JFrame frame = new JFrame("Graph Example");
                frame.getContentPane().add(mainPanel);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(200, 500);
                frame.setVisible(true);

            }
        }
    }

    public static void main(String[] args) {
        Example windowExample = new Example("Final exam");
    }
}
