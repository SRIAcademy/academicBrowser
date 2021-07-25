/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draggablefileman;

import java.awt.event.MouseEvent;

/**
 *
 * @author aswathy
 */
public interface OnSelection {



    public void call(FolderInfo folderInfo, MouseEvent e);
}
