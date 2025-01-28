import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Makes Input section of the GUI and also holds a PursePanel
public class RegisterPanel extends JPanel{
    private Register register;
    private JPanel inputPanel;
    private JTextField input;
    private PursePanel changePanel;

    public RegisterPanel(){
        register = new Register();

        input = new JTextField(7); // allows only 7 characters
        inputPanel = new JPanel();
        JLabel label = new JLabel("Enter Amount in Wallet: $");
        inputPanel.add(label);
        inputPanel.add(input);

        changePanel = new PursePanel();
        this.setLayout(new BorderLayout());
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(changePanel, BorderLayout.CENTER);

        input.addActionListener(new InputListener());
    }

    private class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double amt = Double.parseDouble(input.getText());
            Purse newAmt = register.makeChange(amt);
            changePanel.refresh(newAmt);
        }
    }
}
