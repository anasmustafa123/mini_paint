package FrontEnd;


import shapes.Shape;
import shapes.AbstractShape;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Graphics;

public class MyPanel extends JPanel implements DrawingEngine{
    private final ArrayList<AbstractShape> shapes;
    private AbstractShape current;
    private final PaintFrame machine;
    private AbstractShape preCurrent;
    private boolean ready = false;
    private int circleSelected;
    public MyPanel(PaintFrame machine) {
        preCurrent  = null;
        this.shapes = new ArrayList<>();
        current = null;
        this.addMouseListener(new MouseHandler());
        this.addMouseMotionListener(new MosueMotionHandler());
        this.machine = machine;
        this.circleSelected = -1 ;
    }
 
    public AbstractShape find( Point point ){
        for(int i = (shapes.size() -1); i >= 0; i--){
            AbstractShape s = shapes.get(i);
            if(s.contains(point) || s.readyToMove(point) != -1)
                return s;
        }
        return null;
    }    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (AbstractShape s : shapes){
              s.draw(g);
              if(s.getIfClicked())
                  s.drawResizable(g);
        }
    }
    private void toTop(AbstractShape current){
        shapes.remove(current);
        shapes.add(current);
    }  
    
    @Override
    public void addShape(Shape shape) {
        shapes.add((AbstractShape) shape);
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove((AbstractShape)shape);
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
            if(current != null )
            {
                machine.selectItemCompoBox(shapes.indexOf(current));
                repaint();
            }
            else {
                machine.selectItemCompoBox(-1); //to select the "Choose a Shape" if the user clicked not on any shape
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {
            preCurrent = current;
            current = find(e.getPoint());
            if(preCurrent != null && preCurrent != current){
                preCurrent.setIfClicked(false);
               repaint();
            }
                
            if(current != null ) {
                if((circleSelected = current.readyToMove(e.getPoint()) ) != -1){
                    System.err.println("current move panel"+ circleSelected);
                    current.setResizingPoint(e.getPoint());
                    ready = true;
                     repaint();
                }
                    
                else{
                   current.setIfClicked(true);
                   current.setDraggingPoint(e.getPoint());  
                   machine.selectItemCompoBox(-1);
                   machine.toTopOFCompoBox(shapes.indexOf(current));
                   toTop(current);  
                } 
                repaint();
            }
    }        
        @Override
        public void mouseReleased(MouseEvent e) {   
            machine.selectItemCompoBox(-1);
            ready  = false;
        }     
 }

    private class MosueMotionHandler implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
            if(current != null){
                System.err.println("next move "+circleSelected);
                if(ready){
                    System.err.println("next move true :"+circleSelected);
                current.resize(e.getPoint(),circleSelected);
                
                } 
                else
                    (current).moveTo(e.getPoint());
                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
           
            if(find(e.getPoint()) == null){
                System.err.println("nooooooooooo");
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
               }
            else{
                int select;
                if((select = find(e.getPoint()).readyToMove(e.getPoint()) ) != -1){
                    System.err.println(select);
                    switch (select) {
                        case 1 ->{ setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));}
                        case  2-> setCursor(Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR));
                        case 3 -> setCursor(Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR));
                        case 4 -> setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
                    }
                }
                else
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

