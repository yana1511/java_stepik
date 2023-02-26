package java_stepik;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class grass {
    static JFrame frame = new JFrame();
    static int size=50;

    public static class AddTextura {
        public JLabel l;
        public AddTextura(BufferedImage im, int i, int j) {
            l = new JLabel(new ImageIcon(im));
            l.setBounds(i*size, j*size, size, size);
            frame.add(l);
        }
    }

    public static void main(String[] args) throws IOException {
        int width=800, height=600;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        BufferedImage im = ImageIO.read(new URL("https://st14.stpulscen.ru/images/product/428/172/950_original.png")).getSubimage(0,0,size,size);//скачиваем картинку с травой и обрезаем ее
        for (int i = 0; i <= width/size; i++)
            for (int j = 0; j <= height/size; j++)
                new AddTextura(im,i,j);
        frame.setVisible(true);
    }
}