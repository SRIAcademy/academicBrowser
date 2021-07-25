/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draggablefileman;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;

public class MakeDraggable {

    static Point p, off;

    static void on(JComponent c) {
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e); //To change body of generated methods, choose Tools | Templates.
                off = e.getPoint();
                if (c.getParent() != null) {
                    p = c.getParent().getLocationOnScreen();
                }
            }

        });

        c.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e); //To change body of generated methods, choose Tools | Templates.
                if (e.isControlDown()) {
                    c.setLocation(diff(e.getLocationOnScreen(), p, off));
                }

            }

        });

    }

    static Point diff(Point p, Point q, Point r) {
        p.x = p.x - q.x - r.x;
        p.y = p.y - q.y - r.y;
        return p;
    }

}
