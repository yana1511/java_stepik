package java_stepik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class spinner {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("0");//создаем надпись
        JButton button = new JButton("Ответить");//создаем кнопку
        button.setAlignmentX(Component.CENTER_ALIGNMENT);//выравниваем ее по центру
        JSpinner spinner = new JSpinner();//создаем спиннер
        spinner.setMaximumSize(new Dimension(100,50));//задаем ему максимальный размер, чтобы не растягивался по всей форме
        button.addActionListener(new ActionListener() {//добавляем слушателя на кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(String.valueOf(spinner.getValue()));//считываем значение из спиннера
            }
        });

        frame.add(Box.createVerticalStrut(40));//между компонентами добавляем пустые промежутки
        frame.add(spinner);//добавляем спиннер
        frame.add(Box.createVerticalStrut(40));
        frame.add(button);//добавляем кнопку
        frame.add(Box.createVerticalStrut(40));
        frame.add(label);//добавляем надпись
        frame.add(Box.createVerticalStrut(40));
        frame.pack();
        frame.setVisible(true);
    }
}