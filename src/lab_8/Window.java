
import lab_8.UnluckyException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import javax.swing.*;
import java.awt.event.*;


public class Window extends JFrame implements ActionListener{
    
    public Window() {
    }

    static JTextField dividend;
    static JTextField divisor;
    static JLabel quotient;
    static JButton button;
    static JFrame frame;
    Double dividend_value;
    Double divisor_value;

    public static void main(String[] var0) {
        dividend = new JTextField(10);
        divisor  = new JTextField(10);
        button   = new JButton("Submit");
        quotient = new JLabel("Result:");
        frame    = new JFrame("Dividetator");
        Window wind = new Window();

        button.addActionListener(wind);
        JPanel panel = new JPanel();

        panel.add(dividend);
        panel.add(divisor);
        panel.add(quotient);
        panel.add(button);


        frame.add(panel);

        frame.setSize(300, 300);
        frame.show();
    }

    public void readTop(String top) {
        String error = "";
        try {
            dividend_value = Double.valueOf(top);
        }
        catch(NumberFormatException e) {
            if(top.equals("")) error += "You haven't entered any value for the dividend";
            else error += "You've entered a non-number dividend.";
            error += "\n" + e + "\n";
            JOptionPane.showMessageDialog(frame, error);
        }
    }

    public void readBottom(String bottom) {
        String error = "";
        try {
            divisor_value = Double.valueOf(bottom);
        }
        catch(NumberFormatException e) {
            if(bottom.equals("")) error += "You haven't entered any value for the divisor";
            else error += "You've entered a non-number divisor.";
            error += "\n" + e + "\n";
            JOptionPane.showMessageDialog(frame, error);
        }
    }

    public void readFraction() {
        readTop(dividend.getText());
        readBottom(divisor.getText());
    }

    public void divide(double top, double bottom) throws UnluckyException {
        try {
            int res = (int)top / (int)bottom;
            Double c = top / bottom;
            quotient.setText(String.valueOf(c));
            if(bottom == 13) {
                throw new UnluckyException("Unlucky Divisor");
            }
        }
        catch(ArithmeticException e) {
            System.out.println("sup");
            JOptionPane.showMessageDialog(frame, e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        quotient.setText("");
        readFraction();
        try {
            divide(dividend_value, divisor_value);
        }
        catch (UnluckyException el) {
            JOptionPane.showMessageDialog(frame, el);
        }
    }
}
