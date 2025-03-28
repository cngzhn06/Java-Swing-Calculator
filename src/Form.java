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
    private JButton CButton;
    private JLabel lblDisplay;
    double a,b,result;
    String op;


    public Form(){
        add(panel1);
        setSize(500,300);
        setTitle("Hesap Makinası");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
                lblDisplay.setText("");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
                lblDisplay.setText("");
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
                lblDisplay.setText("");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
                lblDisplay.setText("");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
                lblDisplay.setText("");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
                lblDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
                lblDisplay.setText("");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
                lblDisplay.setText("");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
                lblDisplay.setText("");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
                lblDisplay.setText("");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()){
                    a= Double.parseDouble(txtDisplay.getText());
                    op = "+";
                    txtDisplay.setText("");
                }else {
                    lblDisplay.setText("enter number");
                }
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
                if (!txtDisplay.getText().isEmpty()){
                    a= Double.parseDouble(txtDisplay.getText());
                    op = "*";
                    txtDisplay.setText("*");
                }else {
                    lblDisplay.setText("enter number");
                }
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()){
                    a= Double.parseDouble(txtDisplay.getText());
                    op = "/";
                    txtDisplay.setText("");
                }else {
                    lblDisplay.setText("enter number");
                }
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
                        if (b != 0 && a != 0) {
                            result = a / b;
                            txtDisplay.setText(String.valueOf(result));
                        } else {
                            lblDisplay.setText("Division Err!");
                        }
                    }
                } else {
                    lblDisplay.setText("Invalid Err!");
                }
            }
        });

        CButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
    }

}