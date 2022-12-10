package shapes;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class LineSegment extends AbstractShape{
    //private Point position1;
    private Point position2;
    
    public Point getPosition2(){
        return this.position2;
    }
    
    public void setPosition(Point position1 , Point positoin2) { //the first corrdinate 
        setPosition(position1);
        this.position2 = positoin2;
    }

    private double slope(Point p1 , Point p2){
        return Math.abs(p1.x-p2.x)/Math.abs(p1.y-p2.y);
    }
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2 = (Graphics2D)canvas;     
        g2.setColor(this.getColor());
        g2.drawLine(getPosition().x,getPosition().y, position2.x, position2.y);
    }


    @Override
    public void moveTo(Point point) {
        Point offset = new PointOperations().sub(point, getDraggingPoint());
        Point newPoint1  = new Point(getPosition().x + offset.x , getPosition().y + offset.y);
        Point newPoint2  = new Point(getPosition2().x + offset.x , getPosition2().y + offset.y);
        setPosition(newPoint1, newPoint2);
        setDraggingPoint(point);
    }
    
        @Override
    public boolean contains(Point point) { // what should it do
        PointOperations op = new PointOperations();
        Point d1 = getPosition();
        Point d2 = getPosition2();
        if(op.getDistancae(point, d1) + op.getDistancae(point, d2) ==  op.getDistancae(d1, d2)) 
            return true;
        else return false;
            
    }

    @Override
    public boolean readyToMove(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void resize(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void drawResizable(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Point getResizeingPoint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setResizingPoint(Point movingPoint) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}