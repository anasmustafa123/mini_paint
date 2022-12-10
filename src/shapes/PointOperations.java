package shapes;


import java.awt.Point;

public class PointOperations {
    public  int getDistancae(Point point1,Point point2){
        return ( (int)( Math.sqrt(Math.pow(point1.x  - point2.x, 2) + Math.pow(point1.y - point2.y, 2) ) ));
    }
    
    public Point sub(Point p1 ,Point p2){
        return new Point(p1.x - p2.x , p1.y - p2.y);
    }
}
