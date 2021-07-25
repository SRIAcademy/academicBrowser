/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draggablefileman;

import com.google.gson.reflect.TypeToken;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author aswathy
 */
public class Home extends javax.swing.JFrame {

    File currentDir, prevDir, currentSelection;
    File filePos;
    Map<String, FolderInfo> mapInfo = new HashMap<>();
    Map<String, Folder> folderMap = new HashMap<>();
    
    int y = 10;

    public Home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        MakeDraggable.on(folder2);
        navigateTo("USER/LDC/പൊതുവിജ്ഞാനം");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        folder2 = new draggablefileman.Folder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelBNack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCurrFolder = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        folder2.setText("folder2");
        jPanel1.add(folder2);
        folder2.setBounds(36, 47, 83, 27);

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setToolTipText("close");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("up");
        jLabel2.setToolTipText("up");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabelBNack.setBackground(new java.awt.Color(204, 255, 204));
        jLabelBNack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBNack.setText("<-");
        jLabelBNack.setToolTipText("back");
        jLabelBNack.setOpaque(true);
        jLabelBNack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBNackMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 255, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jTextFieldCurrFolder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCurrFolderKeyReleased(evt);
            }
        });

        jLabel4.setText("+syl");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBNack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCurrFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBNack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCurrFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        close();
        dispose();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        navigateTo(currentDir.getParent());
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabelBNackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBNackMousePressed
        navigateTo(prevDir.getAbsolutePath());
    }//GEN-LAST:event_jLabelBNackMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        newFolder();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jTextFieldCurrFolderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCurrFolderKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String newName = jTextFieldCurrFolder.getText().trim();
            File fileNew = new File(currentSelection.getParentFile(), newName);
            if (fileNew.exists()) {
                App.infoDialog(newName+" exists" );
            } else {
                
                currentSelection.renameTo(fileNew);
                      
            folderMap.get(currentSelection.getName()).renameTo(fileNew);
                refresh();
            }
        }
    }//GEN-LAST:event_jTextFieldCurrFolderKeyReleased

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        try {
            new File(currentSelection,"syllabus.txt").createNewFile();
            refresh();
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private draggablefileman.Folder folder2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBNack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCurrFolder;
    // End of variables declaration//GEN-END:variables

    private void navigateTo(String path) {
        if (filePos != null) {
            saveMap(mapInfo, filePos);
        }
        prevDir = currentDir;
        currentDir = new File(path);

        if (currentDir.isFile()) {
            openFile(currentDir);
        } else {
            listDir(currentDir);
        }

    }

    private void close() {
        saveMap(mapInfo, filePos);
    }

    private void saveMap(Map<String, FolderInfo> map, File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            App.gson.toJson(map, fileWriter);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean isInAvoidableList(File f) {
        String name = f.getName();

        if (name.startsWith("pos.txt")) {
            return true;
        } else {
            return false;
        }
    }

    private void openFile(File f) {
        System.out.println("not implx");
        App.thunar(f);
    }

    private void listDir(File f) {
        y = 0;
        mapInfo.clear();
        folderMap.clear();
        filePos = new File(currentDir, "pos.txt");
        java.lang.reflect.Type type = new TypeToken<Map<String, FolderInfo>>() {
        }.getType();
        if (filePos.exists()) {
            try {
                mapInfo = App.gson.fromJson(new FileReader(filePos), type);
//              map.forEach((k,v)->{
//              
//              });

                jPanel1.removeAll();
                for (File subDir : currentDir.listFiles()) {
                    if (isInAvoidableList(subDir)) {
                        continue;
                    }
                    addFolderToJpanel(subDir);

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                filePos.createNewFile();
                saveMap(mapInfo, filePos);

            } catch (IOException ex) {
                System.out.println(""+filePos.getAbsolutePath());
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        refresh();
    }

    private void newFolder() {
        File subFolder = new File(currentDir, "new"+System.currentTimeMillis());
        subFolder.mkdir();
        addFolderToJpanel(subFolder);
        
        try {
            new File(subFolder,"syllabus.txt").createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        refresh();
    }

    private void refresh() {
        jPanel1.revalidate();
        jPanel1.repaint();

    }

    private void addFolderToJpanel(File subDir) {
        Folder folder = new Folder(subDir, 200, 10);
        if (mapInfo.containsKey(subDir.getName())) {
            FolderInfo infoGot = mapInfo.get(subDir.getName());
            folder.setFolderInfo(infoGot);
            
        } else {
            folder.setFolderInfo(new FolderInfo(subDir, 200, y += 20));
            mapInfo.put(subDir.getName(), folder.getFolderInfo());
        }

        MakeDraggable.on(folder);

        folder.onSelection((FolderInfo folderInfo, MouseEvent e) -> {
            setCurrentSelection(folderInfo);
            if (!e.isControlDown()) {
                navigateTo(folderInfo.fullPath);
            }

            if (e.getButton() == 3) {
                App.thunar(new File(folderInfo.fullPath));
            }

        });
        folderMap.put(subDir.getName(),folder);
        jPanel1.add(folder);
    }

    private void setCurrentSelection(FolderInfo folderInfo) {
        jTextFieldCurrFolder.setText(folderInfo.name);
        currentSelection = new File(folderInfo.fullPath);
    }

   

}
