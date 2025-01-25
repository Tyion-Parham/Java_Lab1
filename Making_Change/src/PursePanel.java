import javax.swing.*;
import java.awt.*;


public class PursePanel extends JPanel {
    private Purse purse;

    public PursePanel() {
        this.purse = new Purse();
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(800, 500));
    }

    public void refresh(Purse p) {
        this.purse = p;
        this.removeAll(); // Remove all previous images
        repaint();
    }

    protected void paintComponent(Graphics g) { // has a red line under paintComponent, but it works *shrugs*
        super.paintComponent(g);
        String contents = purse.outputString();

        String[] type = contents.split("\n");

        int vertGap = 15;
        int amt;

        for (int i = 0; i < type.length; i++) {
            String[] parts = type[i].split(" ");

            if (parts.length > 1)
                amt = Integer.parseInt(parts[0].trim());
            else
                amt = 1;

            g.drawString(type[i], 10, vertGap + 15);

            String denomination = type[i].replaceAll("\\d+ ","");

            for (int j = 0; j < amt; j++) {
                // Creates images for denominations
                ImageIcon img = new ImageIcon("NoteImages/" + denomination + ".png");
                img.setImage(img.getImage().getScaledInstance(90, 38, Image.SCALE_SMOOTH));

                JLabel imgLabel = new JLabel(img);

                // Position the imgLabel
                int xOffset = 185 + (j * 90);
                imgLabel.setBounds(xOffset, vertGap, 90, 55);
                this.add(imgLabel);
            }

            vertGap += 85;
        }
        this.repaint();
    }
}
