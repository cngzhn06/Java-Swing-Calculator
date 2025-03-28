import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    private JPanel panel1;
    private JButton a0Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton division;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a9Button;
    private JButton multiplacition;
    private JButton backspace;
    private JButton compare;
    private JButton minus;
    private JButton plus;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JLabel downDisplay;
    double a,b,result;
    String op;


    public Form(){
        add(panel1);
        setSize(400,200);
        setTitle("Hesap Makinası");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
            }
        });
        multiplacition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");
            }
        });
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backSpace = null;
                if (txtDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backSpace = String.valueOf(strB);
                    txtDisplay.setText(backSpace);
                }
            }
        });
        compare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()) {
                    b = Double.parseDouble(txtDisplay.getText());

                    if (op.equals("+")) {
                        result = a + b;
                        txtDisplay.setText(String.valueOf(result));
                    } else if (op.equals("-")) {
                        result = a - b;
                        txtDisplay.setText(String.valueOf(result));
                    } else if (op.equals("*")) {
                        result = a * b;
                        txtDisplay.setText(String.valueOf(result));
                    } else if (op.equals("/")) {
                        if (b != 0 && a == 0) {
                            result = a / b;
                            txtDisplay.setText(String.valueOf(result));
                        } else {
                            downDisplay.setText("Division Err!");
                        }
                    }
                } else {
                    downDisplay.setText("Invalid Err!");
                }
            }
        });

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
    }

}
