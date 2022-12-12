package shapes;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.math.BigDecimal;
import org.json.simple.JsonObject;


public class Oval extends AbstractShape{
    private int width;
    private int height;
    public Oval(){
        circles = new Point[4];
    }
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

    @Override
    public void moveTo(Point point) {
        
        Point dragginOffset = (new PointOperations()).sub(point ,getDraggingPoint());

        printpoint(circles[0]);
        printpoint(circles[1]);
        printpoint(circles[2]);
        printpoint(circles[3]);
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
    public int readyToMove(Point point) {
        Point p = getPosition();
        PointOperations  op = new PointOperations();

        Point pointt = getPosition();
        circles[0] = getPosition();
        circles[1] = new Point(pointt.x + 2*width, pointt.y);
        circles[2] =new Point(pointt.x,pointt.y + 2*height);
        circles[3] =new Point(pointt.x + 2*width , pointt.y + 2*height);
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

    private void printpoint(Point point){
        System.err.println(point);
        
    }
    
    
    
    @Override
    public int resize(Point point,int circleNum) {
 
        int nextStage = circleNum;
        System.err.println("circle num =  "+circleNum );
        switch (circleNum) {
            case 2 -> {
                if(point.x <= circles[2].x)
                {
                   // circles[0] = point;
                   // circles[1].y = point.y;
                   // circles[2].x = point.x;
                    nextStage =  1;
                }
               else if(point.y >= circles[2].y){
                //    circles[3] = point;
                  //  circles[1].x = point.x;
                //    circles[2].y = point.y;   
                    nextStage =  4;
                }
                else{
                circles[1] = point;
                circles[0].y = point.y;
                circles[3].x = point.x;
                }
       }
            case 1 -> {
                if( point.x >= circles[1].x)
                {
                //    circles[1] = point;
                //    circles[0].y =point.y;
                //    circles[3].x = point.x;
                    nextStage =  2;
                }
                else if(point.y >= circles[2].y){
                //   circles[2] = point;
                //  circles[0].x = point.x;
                //    circles[3].y=  point.y;
                    nextStage =  3;
                }
               else{
                    circles[1].y  =point.y;
                    circles[2].x = point.x;
                    circles[0] = point;
               }
            }
            case 3 -> {
                if( point.x >= circles[1].x)
                {
              //      circles[3] =point;
              //      circles[2].y = point.y;
              //      circles[1].x = point.x;
                    nextStage =  4;
                }
                else if(point.y <= circles[1].y){
            //       circles[0] = point;
            //        circles[1].y = point.y;
            //        circles[2].x = point.x;
                    nextStage =  1;
                }
                else{
               circles[2] = point;
               circles[0].x = point.x;
               circles[3].y = point.y;
                }
            }
            case 4 -> {
                 if( point.x <= circles[2].x)
                {
            //        circles[2] = point;
            //        circles[3].y =  point.y;
            //        circles[0].x =point.x;
                    nextStage =  3;
                }
                else if(point.y <= circles[1].y){
            //        circles[1] = point;
            //       circles[3].x =  point.x;
            //        circles[0].y =point.y;       
                    nextStage =  2;
                }
                else {
             circles[3] = point;
             circles[2].y = point.y;
             circles[1].x = point.x;
                }
            }
            default -> {}
        }
        setWidth( (circles[3].x - circles[0].x)/2);
        setheight( (circles[3].y -  circles[0].y)/2 );
        setPosition(circles[0]);
        return nextStage;
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

    @Override
    public JsonObject toJsonJSObject() {
        JsonObject temp;
        temp = new JsonObject(){};
        temp.put("key", 2);
        temp.put("x1",getPosition().x);
        temp.put("y1",getPosition().y);
        temp.put("width", width);
        temp.put("height", height);
        temp.put("borderColor", getColor());
        temp.put("fillColor", getFillColor());
        return temp;    }

    @Override
    public Shape fromJsonToShape(JsonObject object) {
        Oval oval = new Oval();
        oval.setColor((Color) object.get("borderColor"));
        oval.setFillColor((Color) object.get("fillColor"));
        oval.setPosition(new Point( ((BigDecimal)object.get("x1") ).intValue() , ( (BigDecimal)object.get("y1") ).intValue() ));
        oval.setWidth(((BigDecimal)object.get("width") ).intValue() );
        oval.setheight(((BigDecimal)object.get("height") ).intValue() );
        return oval;
    }
}
