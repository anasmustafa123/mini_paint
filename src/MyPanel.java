
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements DrawingEngine{
    private final ArrayList<AbstractShape> shapes;
    private AbstractShape current;
    private PaintFrame machine;
    public MyPanel(PaintFrame machine) {
        this.shapes = new ArrayList<>();
        current = null;
        this.addMouseListener(new MouseHandler());
        this.addMouseMotionListener(new MosueMotionHandler());
        this.machine = machine;
    }

 
    public AbstractShape find( Point point ){
        for(int i = (shapes.size() -1); i >= 0; i--){
            AbstractShape s = shapes.get(i);
            if(s.contains(point))
                return s;
        }
        return null;
    }    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes){
              s.draw(g);
        }
    }
            
    @Override
    public void addShape(Shape shape) {
        shapes.add((AbstractShape) shape);
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(Shape[]::new);
    }

    @Override 
    public void refresh(Graphics canvas) {
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
 private class MouseHandler extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            current = find(e.getPoint());  
            if(current != null && e.getClickCount()>= 1)
            {
                machine.selectItemCompoBox(shapes.indexOf(current) + 1);
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {
            current = find(e.getPoint());
            if(current != null) {
                current.setDraggingPoint(e.getPoint());
        }
    }        
        @Override
        public void mouseReleased(MouseEvent e) {
            current = null;            
        }     
 }

    private class MosueMotionHandler implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
            if(current != null){
                if(current instanceof Circle)
                    ((Circle)current).moveTo(e.getPoint());
                else if (current instanceof Rectangle)
                    ((Rectangle)current).moveTo(e.getPoint());
                else if (current instanceof LineSegment)
                    ((LineSegment)current).moveTo(e.getPoint());
                else if (current instanceof Triangle)
                    ((Triangle)current).moveTo(e.getPoint());
                    repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            if(find(e.getPoint()) == null){
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
            else{
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

