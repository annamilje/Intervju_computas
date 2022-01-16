package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileImport {
    public static String tekst;
    public static String fileimport() throws Exception{
        JFileChooser jfc = new javax.swing.JFileChooser();
        int result = jfc.showOpenDialog(new JFrame());
        if (result == JFileChooser.APPROVE_OPTION) {
            FileReader fr = new FileReader(jfc.getSelectedFile());

            try (BufferedReader reader = new BufferedReader(fr)) {
                StringBuilder sb = new StringBuilder();
                String line = reader.readLine();

                while (line != null) {
                    sb.append(line);

                    line = reader.readLine();
                }
                tekst = sb.toString();
            }

        }
        return tekst;
    }
}
