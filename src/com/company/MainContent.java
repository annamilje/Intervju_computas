package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.FileImport.*;
import static com.company.FileImport.fileimport;

import static com.company.Kryptering.kryptertTekst;
import static com.company.deKryptering.dekrypter;
import static com.company.deKryptering.dekryptertTekst;

public class MainContent extends JPanel {

    private Font bigFont = new Font("Calibri", Font.PLAIN, 20);

    final JFileChooser fc = new JFileChooser();

    private JButton fileButton = new JButton("Hent tekst fra fill");
    private JButton krypterButton = new JButton("Krypter tekst");
    private JButton dekrypterfileButton = new JButton("Dekrypter tekst");
    private JTextArea tekstForBruk = new JTextArea(24, 12);


    public MainContent() {
        super();
        setLayout(null);

        fileButton.setBounds(350, 25, 300, 30);
        fileButton.setFont(bigFont);
        add(fileButton);

        fileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    fileimport();
                    tekstForBruk.setText(tekst);
                } catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "klarer ikke hente fill");
                }

            }
        });

        tekstForBruk.setBounds(50, 125, 930, 200);
        tekstForBruk.setFont(bigFont);
        tekstForBruk.setLineWrap(true);
        tekstForBruk.setWrapStyleWord(true);
        add(tekstForBruk);



        krypterButton.setBounds(170, 350, 300, 30);
        krypterButton.setFont(bigFont);
        add(krypterButton);

        krypterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv in et tall for kryptering"));
                    String text = tekstForBruk.getText();
                    Kryptering.krypter(text, tall);
                    tekstForBruk.setText(kryptertTekst);
                    JOptionPane.showMessageDialog(null, kryptertTekst);
                } catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Klarer ikke kryptere tekst");
                }

            }
        });

        dekrypterfileButton.setBounds(530, 350, 300, 30);
        dekrypterfileButton.setFont(bigFont);
        add(dekrypterfileButton);

        dekrypterfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv in et tall for dekryptering"));
                    String text = tekstForBruk.getText();
                    dekrypter(text,tall);
                    tekstForBruk.setText(dekryptertTekst);
                    JOptionPane.showMessageDialog(null,  dekryptertTekst );
                } catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Klarer ikke dekryptere tekst");
                }

            }
        });
    }


}
