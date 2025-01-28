import javax.swing.*;

// the big JFrame
public class MakingChange {
    public static void main(String[] args) {
        JFrame Making_Change = new JFrame("Making Change");
        Making_Change.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Making_Change.setSize(800, 600);
        Making_Change.setVisible(true);

        RegisterPanel RegisterPanel = new RegisterPanel();
        Making_Change.add(RegisterPanel);
        Making_Change.setVisible(true);
    }
}
