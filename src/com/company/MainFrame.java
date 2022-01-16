package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {



    private MainContent content = new MainContent();

    public MainFrame() {

            setTitle("Kryptering av Cæsar kode");
            setSize(1030, 800);
            setLocationRelativeTo(null);
            setLayout(new GridLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            add(content);

            setResizable(false);
            setVisible(true);

    }


}
