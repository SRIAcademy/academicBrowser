/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draggablefileman;

import java.io.File;

/**
 *
 * @author aswathy
 */
public class FolderInfo {

    int x, y;
    String link;
    String name, fullPath;
    long id;

    FolderInfo(File file,int x,int y) {
        fullPath = file.getAbsolutePath();
        name = file.getName();
        this.x = x;
        this.y = y;
        link = "notset";
        id = 0;
    }

    @Override
    public String toString() {
        return "FolderInfo{" + "x=" + x + ", y=" + y + ", link=" + link + ", name=" + name + ", fullPath=" + fullPath + ", id=" + id + '}';
    }

}
