package shapes;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;


public class Triangle extends AbstractShape{

    private Point position2;
    private Point position3;
    public Triangle(Point p1 , Point p2 , Point p3){
        setPosition(p1);
        this.position2 = p2;
        this.position3 = p3;
    }
    public Triangle (){}
    
    public Point getPosition2() {
        return position2;
    }

    public Point getPosition3() {
        return position3;
    }

    public void setPosition2(Point position2) {
        this.position2 = position2;
    }

    public void setPosition3(Point position3) {
        this.position3 = position3;
    }
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2d = (Graphics2D)canvas;
        g2d.setColor(getColor());
        g2d.drawPolygon(new int[]{getPosition().x , position2.x , position3.x} , new int[]{getPosition().y , position2.y , position3.y},3 );
        g2d.setColor(getFillColor());
        g2d.fillPolygon(new int[]{getPosition().x , position2.x , position3.x} , new int[]{getPosition().y , position2.y , position3.y},3 );
    }

    @Override
    public void moveTo(Point point) {
        PointOperations op = new PointOperations();
        Point offset = op.sub(point,getDraggingPoint());
        setPosition(new Point(getPosition().x + offset.x , getPosition().y + offset.y));
        setPosition2(new Point(getPosition2().x + offset.x , getPosition2().y + offset.y));
        setPosition3(new Point(getPosition3().x + offset.x , getPosition3().y + offset.y));
        setDraggingPoint(point);
    }
    @Override
    public boolean contains(Point point) { 
        double a1 = areaOfTriangle(point, getPosition(), position2);
        double a2 = areaOfTriangle(point,getPosition(),position3);  
        double a3 = areaOfTriangle(point, position2, position3);
        double aTotall = areaOfTriangle(getPosition(), position2, position3);
        if(a1+ a2+ a3 == aTotall)       
            return true;
        else return false;    
    } 
    private double areaOfTriangle(Point p1 , Point p2 , Point p3){
        return Math.abs((0.5)*(p1.x *(p2.y  - p3.y) + p2.x *(p3.y - p1.y) + p3.x *(p1.y - p2.y) ));
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

}
