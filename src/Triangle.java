
import java.awt.Graphics;
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
        canvas.setColor(getColor());
        canvas.drawPolygon(new int[]{getPosition().x , position2.x , position3.x} , new int[]{getPosition().y , position2.y , position3.y},3 );
        canvas.setColor(getFillColor());
        canvas.fillPolygon(new int[]{getPosition().x , position2.x , position3.x} , new int[]{getPosition().y , position2.y , position3.y},3 );
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
        //else return a1 == 0 || a2 == 0 || a3 == 0; //if one of a1,a2,a3 is zero then the point lie on that line so  technically is on the shape      
    } 
    public static double areaOfTriangle(Point p1 , Point p2 , Point p3){
        return Math.abs((0.5)*(p1.x *(p2.y  - p3.y) + p2.x *(p3.y - p1.y) + p3.x *(p1.y - p2.y) ));
    }
    public static void main(String[] args) {
        Point point = new Point(10,90);
        Point point1 = new Point(0,0);
        Point point2 = new Point(0,100);
        Point point3 = new Point(100,100);
        
        double a1 = areaOfTriangle(point, point1, point2);
        double a2 = areaOfTriangle(point,point1,point3);  
        double a3 = areaOfTriangle(point, point2, point3);
        double aTotall = areaOfTriangle(point1, point2, point3);

        System.err.println( "sum" + (a1+ a2 +a3) +  "\n");
        System.err.println("total"+aTotall);
    }
}
