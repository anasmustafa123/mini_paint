package shapes;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import static java.lang.Math.abs;


public class Oval extends AbstractShape{
    private int width;
    private int height;
    private int chapeNum;
    public int getWidth(){
        return this.width;    
    }
    public int getheight(){
        return this.height;    
    }
    public void setWidth(int width){
        this.width = width;    
    }
    public void setheight(int height){
        this.height = height;    
    }
    
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2 = (Graphics2D) canvas;
        
        g2.setColor(getColor());
        g2.drawOval(getPosition().x, getPosition().y, this.width*2, this.height*2);
        g2.setColor(getFillColor());
        g2.fillOval(getPosition().x, getPosition().y, this.width*2, this.height*2);
    }

      public void draw2(Graphics canvas) {
        Graphics2D g2 = (Graphics2D) canvas;
        
        g2.setColor(getColor());
        g2.drawOval(getPosition().x, getPosition().y, this.width*2, this.height*2);
        g2.setColor(getFillColor());
        g2.fillOval(getPosition().x, getPosition().y, this.width*2, this.height*2);
    }
    @Override
    public void moveTo(Point point) {
        
        Point dragginOffset = (new PointOperations()).sub(point ,getDraggingPoint());

        Point p = new Point(dragginOffset.x + getPosition().x , dragginOffset.y + getPosition().y);
        
       this.setPosition(p);
        setDraggingPoint(point);
    }
        
        @Override
    public boolean contains(Point point) {
        Point shift = new Point(getPosition().x+ width, getPosition().y + height);
        double i =  Math.pow(-1*shift.x + point.x,2) / (width*width) + Math.pow(-1*shift.y + point.y,2) / (height  * height); 
        return (i <= 1);
    }

    @Override
    public boolean readyToMove(Point point) {
        Point p = getPosition();
        if(isPointInRange(point,new Point(p.x + 2*width,p.y))){
            chapeNum = 2;
            return true;
        }
        else if (isPointInRange(point,new Point(p.x,p.y + 2*height))) {
            chapeNum = 3;
                return true;
        }
        else if (isPointInRange(point,new Point(p.x + 2*width,p.y + 2*height))) {
            chapeNum = 4;
                return true;
        }
        else if(isPointInRange(point,new Point(getPosition().x,getPosition().y)) ) {
                chapeNum = 1;
                return true;
       }
        return false;
    }

    @Override
    public void resize(Point point) {
        PointOperations op = new PointOperations();
        Point offset = op.sub(point,getResizeingPoint());
        switch (chapeNum) {
            case 2 -> {
                setWidth(width  + offset.x);
                setheight(height  - offset.y);
                setPosition(new Point(point.x - 2 * width , point.y));
            }
            case 1 -> {
                        setWidth( abs(width -= offset.x )); 
                        setheight( abs(height -= offset.y) );
                        setPosition(point );}
            case 3 -> throw new UnsupportedOperationException("chape 3 not allowd"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            case 4 -> throw new UnsupportedOperationException("chape 4 not allowd"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            default -> {
            }
        }
        setResizingPoint(point);
    }

    private boolean isPointInRange(Point point , Point centerPoint){
        PointOperations op = new PointOperations();
        return op.getDistancae(point, centerPoint) <= getmoveRaduis();
    }
    

    @Override
    public void drawResizable(Graphics g) {
        Point p = getPosition();
        g.setColor(Color.BLACK);
        g.fillOval(p.x-10, p.y, getmoveRaduis(), getmoveRaduis());
        g.fillOval( p.x + width*2, p.y, getmoveRaduis(), getmoveRaduis());
        g.fillOval(p.x-10 , p.y + height*2, getmoveRaduis(), getmoveRaduis()); 
        g.fillOval(p.x + width*2, p.y + height*2, getmoveRaduis(), getmoveRaduis());
        
    }
}
