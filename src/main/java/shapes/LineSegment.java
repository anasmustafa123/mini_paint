package shapes;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.math.BigDecimal;
import org.json.simple.JsonObject;

public class LineSegment extends AbstractShape{
    private Point position2;

    public LineSegment(){
        circles = new Point[2];
    }
    
    public Point getPosition2(){
        return this.position2;
    }
    
    public void setPosition(Point position1 , Point position2) { //the first corrdinate 
        setPosition(position1);
        setPosition2(position2);
    }
    public void setPosition2( Point position2){
        this.position2 = position2;
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
    public int readyToMove(Point point) {
        PointOperations  op = new PointOperations();
        circles[0] = getPosition();
        circles[1] = getPosition2();
        if(op.isPointInRange(point,circles[1] , getmoveRaduis())){
            return 2;
        }
        else if(op.isPointInRange(point,circles[0], getmoveRaduis()) ) {
                return 1;
        }
        return -1;
    }

    @Override
    public int resize(Point point, int circleNum) {
        System.err.println("circle num =  "+circleNum );
        circles[circleNum-1] = point;
        setPosition(circles[0],circles[1]);
        return circleNum;
    }


    @Override
    public void drawResizable(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(getPosition().x, getPosition().y, getmoveRaduis(), getmoveRaduis());
        g.fillOval( getPosition2().x,getPosition2().y, getmoveRaduis(), getmoveRaduis());
    }

    @Override
    public JsonObject toJsonJSObject() {
        JsonObject temp;
        temp = new JsonObject(){};
        temp.put("key", 1);
        temp.put("x1",getPosition().x);
        temp.put("y1",getPosition().y);
        temp.put("x2",getPosition2().x);
        temp.put("y2",getPosition2().y);
        temp.put("borderColor", getColor());
        
        return temp;
    }

    @Override
    public Shape fromJsonToShape(JsonObject object) {
        LineSegment line = new LineSegment();
        line.setColor((Color) object.get("borderColor"));
        line.setPosition(new Point( ((BigDecimal)object.get("x1") ).intValue() , ( (BigDecimal)object.get("y1") ).intValue() ));
        line.setPosition2(new Point( ((BigDecimal)object.get("x2") ).intValue() , ( (BigDecimal)object.get("y2") ).intValue() ));
        return line;
    }
}
