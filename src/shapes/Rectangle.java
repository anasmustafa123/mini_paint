package shapes;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Rectangle  extends AbstractShape{
    
    private int width;
    private int heigth;
   
    public Rectangle(){circles = new Point[4]; }
    public Rectangle(int width , int heigth){
        super();
        circles = new Point[4];
        this.heigth = heigth;
        this.width = width;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public int getHeigth(){
        return this.heigth;
    }
    
    public void setHeigth(int heigth){
        this.heigth = heigth;
    }
    
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2 = (Graphics2D) canvas;
        g2.setColor(getColor());
        g2.drawRect(getPosition().x, getPosition().y, width, heigth);
        g2.setColor(getFillColor());
        g2.fillRect(getPosition().x, getPosition().y, width, heigth);
    }

    @Override
    public void moveTo(Point point) {
        Point offset = new PointOperations().sub(point, getDraggingPoint());
        Point newPoint =  new Point (getPosition().x + offset.x , getPosition().y + offset.y);
        setPosition(newPoint);
        setDraggingPoint(point);
    }
    @Override
    public boolean contains(Point point) { // what should it do
        if(point.x <= getPosition().x+width && point.x >= getPosition().x && point.y <= getPosition().y+heigth && point.y >= getPosition().y)
            return true;
        else return false;
    }

    @Override
    public int readyToMove(Point point) {
        Point p = getPosition();
        PointOperations  op = new PointOperations();

        Point pointt = getPosition();
        circles[0] = getPosition();
        circles[1] = new Point(pointt.x + width, pointt.y);
        circles[2] =new Point(pointt.x,pointt.y + heigth);
        circles[3] =new Point(pointt.x + width , pointt.y + heigth);
        if(op.isPointInRange(point,circles[1] , getmoveRaduis())){
            return 2;
        }
        else if (op.isPointInRange(point,circles[2] , getmoveRaduis())) {
            return 3;
        }
        else if (op.isPointInRange(point,circles[3],getmoveRaduis())) {
            return 4;
        }
        else if(op.isPointInRange(point,circles[0], getmoveRaduis()) ) {
                return 1;
        }
        return -1;
    }

    @Override
    public void resize(Point point, int circleNum) {
        System.err.println("circle num =  "+circleNum );
        switch (circleNum) {
            case 2 -> {
                circles[1] = point;
                circles[0].y = point.y;
                circles[3].x = point.x;
       }
            case 1 -> {
                circles[0] = point;
            }
            case 3 -> {
               circles[2] = point;
               circles[0].x = point.x;
               circles[3].y = point.y;
            }
            case 4 -> {
             circles[3] = point;
             circles[2].y = point.y;
             circles[1].x = point.x;
            }
            default -> {}
        }
        setWidth( (circles[3].x - circles[0].x));
        setHeigth((circles[3].y -  circles[0].y) );
        setPosition(circles[0]);
    }

    @Override
    public void drawResizable(Graphics g) {
        
        Point p = getPosition();
        g.setColor(Color.BLACK);
        g.fillOval(p.x-10, p.y, getmoveRaduis(), getmoveRaduis());
        g.fillOval( p.x + width, p.y, getmoveRaduis(), getmoveRaduis());
        g.fillOval(p.x-10 , p.y + heigth, getmoveRaduis(), getmoveRaduis()); 
        g.fillOval(p.x + width, p.y + heigth, getmoveRaduis(), getmoveRaduis());
    }
    }

