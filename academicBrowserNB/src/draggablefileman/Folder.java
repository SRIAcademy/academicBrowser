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

    private FolderInfo folderInfo;
    private OnSelection onSelection;

    public Folder() {
        setFont(new Font("Noto Sans Malayalam UI Regular", Font.PLAIN, 12));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e); //To change body of generated methods, choose Tools | Templates.
                Point location = getLocation();
                folderInfo.x = location.x;
                folderInfo.y = location.y;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e); //To change body of generated methods, choose Tools | Templates.
                if (!e.isControlDown()) {
                    onSelection.call(getFolderInfo());
                }
                
                if(e.getButton()==3){
                App.thunar(new File(folderInfo.fullPath));
                }
                
            }

        });
    }

    public Folder(FolderInfo folderInfo) {
        this();
        setFolderInfo(folderInfo);

    }

    Folder(File file) {
        this(new FolderInfo(file));
    }

    public FolderInfo getFolderInfo() {
        return folderInfo;
    }

    public final void setFolderInfo(FolderInfo folderInfo) {
        this.folderInfo = folderInfo;
        setText(folderInfo.name);
//        setLocation(folderInfo.x, folderInfo.y);
        setBounds(folderInfo.x, folderInfo.y, getPreferredSize().width, getPreferredSize().height);
    }

    void onSelection(OnSelection onSelection) {
        this.onSelection = onSelection;
    }

}
