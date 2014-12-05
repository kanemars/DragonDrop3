package rachelandkane;

import javax.swing.*;
import java.awt.*;

public class StringDialogThread implements Runnable {
    @Override
    public void run() {

        JFrame frame = new JFrame();
        frame.setBounds(200,200,400,75);
        frame.setLayout(new GridLayout());

        JLabel label = new JLabel();
        label.setText("Enter tab name");
        JTextField textField = new JTextField();
        JButton okButton = new JButton();
        okButton.setText("OK");
        //okButton.

        frame.add(label);
        frame.add(textField);
        frame.add(okButton);

        textField.transferFocus();
        frame.setVisible(true);
        frame.toFront();
        frame.repaint();

        //String newTabName = JOptionPane.showInputDialog(new JFrame(), "Enter the new tab name");
    }
}
