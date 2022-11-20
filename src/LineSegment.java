
import java.awt.Graphics;
import java.awt.Point;

public class LineSegment extends AbstractShape{
    private Point position1;
    private Point position2;
    
    
    
    public void setPosition(Point position1 , Point positoin2) { //the first corrdinate 
        this.position1 = position1;
        this.position2 = positoin2;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.getColor());
        canvas.drawLine(position1.x,position1.y, position2.x, position2.y);
    }
}