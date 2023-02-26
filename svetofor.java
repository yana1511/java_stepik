package java_stepik;
import javax.swing.*;
import java.awt.*;

public class svetofor extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");
        frame.setSize(600,600);
        frame.getContentPane().add(new svetofor());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawRect(100,90,100,385);
        g.fillRect(100,90,100,385);
        g.setColor(Color.red);
        g.drawOval(115,150,70,70);
        g.fillOval(115,150,70,70);
        g.setColor(Color.yellow);
        g.drawOval(115,250,70,70);
        g.fillOval(115,250,70,70);
        g.setColor(Color.green);
        g.drawOval(115,350,70,70);
        g.fillOval(115,350,70,70);
        g.setColor(Color.BLACK);
        g.drawRect(119,485,60,70);
        g.fillRect(119,485,60,70);
    }
}