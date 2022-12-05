
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle  extends AbstractShape{
    
    private int width;
    private int heigth;
   
    public Rectangle(int width , int heigth){
        super();
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
        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x, getPosition().y, width, heigth);
        canvas.setColor(getFillColor());
        canvas.fillRect(getPosition().x, getPosition().y, width, heigth);
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
}
