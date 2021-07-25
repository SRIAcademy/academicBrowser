/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malayalamkeyboard;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class KbdLogic {

    int x = 10, y = 1, WID = 50, HEI = 50;
    ArrayList extrachars;
    ArrayList charStrings;
    ArrayList removable;
    String charSeq = "";
    int ctrx = 0;
    Font customFont = null, customFontDisplay = null;
    Font font;
    JPanel jpanel;
    JTextArea ta;

    public KbdLogic(JPanel jpanel, JTextArea ta) {
        this.jpanel = jpanel;
        this.ta = ta;
        try {
            //           font = ta.getFont().deriveFont(ta.getFont()
//                .getSize() + 5f);
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("USER/fonts/malayalamKeyboard.ttf")).deriveFont(25f);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(KbdLogic.class.getName()).log(Level.SEVERE, null, ex);
        }

        loadExtraChars();
        for (Object extrachar : extrachars) {
            char a = (char) extrachar;
            JButton btn = new JButton(a + "");
            btn.setFont(customFont);
            btn.setPreferredSize(new Dimension(60, 50));
            x += 65;
            if (x > 800) {
                x = 10;
                y += 50;
            }
            btn.setBounds(x, y, WID, HEI);
            btn.setActionCommand(ctrx + "");
            btn.addActionListener((ActionEvent e) -> {
                ta.setText(ta.getText() + a);
                char[] chars = ta.getText().toCharArray();
            });
            btn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if (evt.getButton() == 3) {
                        char base = '\u0d4d';
                        ta.setText(ta.getText() + a + base + a);
                    }
                }
            });
            jpanel.add(btn);
            ctrx++;
        }
      
        
    }

  
    ActionListener actionBack = (ActionEvent ae) -> {
        try {
            ta.requestFocus();
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.keyRelease(KeyEvent.VK_BACK_SPACE);
        } catch (AWTException ex) {
            Logger.getLogger(keyboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    };
    ActionListener actionSpace = (ActionEvent ae) -> {
        try {
            ta.requestFocus();
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_SPACE);
            r.keyRelease(KeyEvent.VK_SPACE);
        } catch (AWTException ex) {
            Logger.getLogger(keyboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    };

    ActionListener actionSave = (ActionEvent ae) -> {
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(new StringSelection(ta.getText()), null);
        JOptionPane.showMessageDialog(null, "Copied To Clipboard");

    };

    final void loadExtraChars() {
        removable = new ArrayList<String>();
        removable.add("d11");
        removable.add("d0d");
        removable.add("d04");
        removable.add("d3b");
        removable.add("d3c");
        removable.add("d45");
        removable.add("d49");
        removable.add("d4f");
        removable.add("d50");
        removable.add("d51");
        removable.add("d52");
        removable.add("d53");
        removable.add("d54");
        removable.add("d55");
        removable.add("d56");
        removable.add("d58");
        removable.add("d59");
        removable.add("d5a");
        removable.add("d5b");
        removable.add("d5c");
        removable.add("d5d");
        removable.add("d5e");
        removable.add("d5f");
        removable.add("d64");
        removable.add("d65");
        removable.add("d76");
        removable.add("d77");
        removable.add("d78");
        removable.add("d29");
        removable.add("d4e");
        removable.add("d3a");
        removable.add("d70");
        removable.add("d71");
        removable.add("d72");
        removable.add("d73");
        removable.add("d74");
        removable.add("d75");
        removable.add("d79");
        removable.add("d3d");
        removable.add("d44");
        removable.add("d62");
        removable.add("d63");
        //Removing MALAYALAM NUMBERS 
        removable.add("d66");
        removable.add("d67");
        removable.add("d68");
        removable.add("d69");
        removable.add("d6a");
        removable.add("d6b");
        removable.add("d6c");
        removable.add("d6d");
        removable.add("d6e");
        removable.add("d6f");
        //Removed 
        //Extras Spacing 
        removable.add("d3e");
        removable.add("d3f");
        removable.add("d40");
        removable.add("d41");
        removable.add("d42");
        removable.add("d43");
        removable.add("d46");
        removable.add("d47");
        removable.add("d48");
        removable.add("d4a");
        removable.add("d4b");
        removable.add("d4c");
        removable.add("d4d");
        removable.add("d57");
        //Extra Removables 
        removable.add("d60");
        removable.add("d61");
        removable.add("d7f");
        removable.add("d7f");
        // 
        extrachars = new ArrayList<Character>();
        charStrings = new ArrayList<String>();
        Character a = '\u0D04';
        for (int i = 0; i < 123; i++) {
            if (removable.contains(Integer.toHexString(a))) {
                a++;
                continue;
            }
            extrachars.add(a);
            a++;
        }
        extrachars.add(('\u0D7A'));
        extrachars.add(('\u0D7B'));
        extrachars.add(('\u0D7C'));
        extrachars.add(('\u0D7D'));
        extrachars.add(('\u0D7E'));
        extrachars.add(('\u0D7F'));
        extrachars.add(('\u0D02'));
        extrachars.add(('\u0D03'));
        extrachars.add(('\u0D3E'));
        extrachars.add(('\u0D3F'));
        extrachars.add(('\u0D40'));
        extrachars.add(('\u0D41'));
        extrachars.add(('\u0D42'));
        extrachars.add(('\u0D43'));
        extrachars.add(('\u0D46'));
        extrachars.add(('\u0D47'));
        extrachars.add(('\u0D48'));
        extrachars.add(('\u0D4A'));
        extrachars.add(('\u0D4B'));
        extrachars.add(('\u0D4C'));
        extrachars.add(('\u0D4D'));
        extrachars.add(('\u0D57'));
    }

}
