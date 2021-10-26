package PotokiMnogopotochnost.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public Component label;
    private JButton FIRE;
    JLabel resh;
    public MainFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(null);

        resh = new JLabel("#");
        resh.setSize(30,30);
        resh.setLocation(150,150);
        add(resh);

        FIRE = new JButton("FIRE");
        FIRE.setSize(70,70);
        FIRE.setLocation(10,10);
        FIRE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            for (int i = 0;i<300;i++){
                GGG ggg = new GGG();
                ggg.start();
            }
            }
        });add(FIRE);
    }
}