/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draggablefileman;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author aswathy
 */
public class Folder extends JButton {

    private FolderInfo info;
    private OnSelection onSelection;

    public Folder() {
        setFont(new Font("Noto Sans Malayalam UI Regular", Font.PLAIN, 12));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e); //To change body of generated methods, choose Tools | Templates.
                Point location = getLocation();
                info.x = location.x;
                info.y = location.y;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e); //To change body of generated methods, choose Tools | Templates.
                onSelection.call(getFolderInfo(), e);

            }

        });
    }

    public Folder(FolderInfo folderInfo) {
        this();
        setFolderInfo(folderInfo);

    }

    Folder(File file, int x, int y) {
        this(new FolderInfo(file, x, y));
    }

    public FolderInfo getFolderInfo() {
        return info;
    }

    public final void setFolderInfo(FolderInfo folderInfo) {
        this.info = folderInfo;
        setText(folderInfo.name);
//        setLocation(folderInfo.x, folderInfo.y);
        setBounds(folderInfo.x, folderInfo.y, getPreferredSize().width, getPreferredSize().height);
    }

    void onSelection(OnSelection onSelection) {
        this.onSelection = onSelection;
    }

    void renameTo(File fileNew) {
        info.fullPath = fileNew.getAbsolutePath();
        info.name = fileNew.getName();
        setText( info.name);
    }

    
}
