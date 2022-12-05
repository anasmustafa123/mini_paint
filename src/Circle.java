
import java.awt.Graphics;
import java.awt.Point;

public class Circle extends AbstractShape{
    private int raduis;
    public int getRaduis(){
        return this.raduis;
    }
    public void setRaduis(int raduis){
        this.raduis = raduis;
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawOval(getPosition().x, getPosition().y,2*raduis, 2*raduis);   
        canvas.setColor(getFillColor());
        canvas.fillOval(getPosition().x, getPosition().y,2*raduis, 2*raduis); 
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
        if((new PointOperations()).getDistancae(point,new Point (getPosition().x+raduis,getPosition().y + raduis)) <= raduis)
            return true;
        else return false;
    }
}
