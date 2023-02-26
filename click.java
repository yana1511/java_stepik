package java_stepik;

import java.awt.FlowLayout;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;

public class click {

    private int count;
    private JLabel label;

    public click() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());//В режиме FlowLayout компоненты добавляются в окно контейнера  располагается вслед за предыдущим в направлении
        // слева направо и сверху вниз, при этом выполняется центровка компонент по горизонтали.

        JButton button = new JButton("Click me!");
        button.addActionListener(new ButtonListener());

        label = new JLabel("Number of clicks: 0");

        frame.add(button);
        frame.add(label);
        frame.pack();//Метод упаковки определяет размеры рамки таким образом, чтобы все ее содержимое соответствовало или превышало их предпочтительные размеры
        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("Number of clicks: " + count);
        }

    }

    public static void main(String[] args) {
        new click();
    }
}