/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draggablefileman;

import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author aswathy
 */
public class Home extends javax.swing.JFrame {

    File fileCurrent, lastFile;
    File filePos;
    Map<String, Folder> map = new HashMap<>();

    public Home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        MakeDraggable.on(folder2);
        navigateTo("/store/PEOPLE/ayush/LDC/പൊതുവിജ്ഞാനം");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        folder2.setText("folder2");
        jPanel1.add(folder2);
        folder2.setBounds(36, 47, 84, 25);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBNack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBNack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        navigateTo(fileCurrent.getParent());
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabelBNackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBNackMousePressed
        navigateTo(lastFile.getAbsolutePath());
    }//GEN-LAST:event_jLabelBNackMousePressed

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
    private javax.swing.JLabel jLabelBNack;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void navigateTo(String path) {
        if (filePos != null) {
            saveMap(map, filePos);
        }
        lastFile = fileCurrent;
        fileCurrent = new File(path);

        if (fileCurrent.isFile()) {
            openFile(fileCurrent);
        } else {
            listDir(fileCurrent);
        }

    }

    private void close() {
        saveMap(map, filePos);
    }

    private void saveMap(Map<String, Folder> map, File file) {
        List<FolderInfo> folderInfos = new LinkedList<>();
        map.forEach((k, v) -> {
            folderInfos.add(v.getFolderInfo());
        });
        try (FileWriter fileWriter = new FileWriter(file)) {
            App.gson.toJson(folderInfos, fileWriter);
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
    }

    private void listDir(File f) {
        int y = 10;
        map.clear();
        jPanel1.removeAll();
        for (File subDir : fileCurrent.listFiles()) {
            if (isInAvoidableList(subDir)) {
                continue;
            }

            Folder folder = new Folder(subDir);
            MakeDraggable.on(folder);
            folder.setLocation(10, y += 20);
            jPanel1.add(folder);
            map.put(subDir.getName(), folder);
            folder.onSelection((FolderInfo folderInfo) -> {
                navigateTo(folderInfo.fullPath);
            });
        }
        filePos = new File(fileCurrent, "pos.txt");
        java.lang.reflect.Type type = new TypeToken<List<FolderInfo>>() {
        }.getType();
        if (filePos.exists()) {
            try {
                List<FolderInfo> folderInfos = App.gson.fromJson(new FileReader(filePos), type);
                folderInfos.forEach(folderInfo -> {
//                    System.out.println(" " + folderInfo.toString());
                    map.get(folderInfo.name).setFolderInfo(folderInfo);
                });
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                filePos.createNewFile();
                saveMap(map, filePos);

            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }

}