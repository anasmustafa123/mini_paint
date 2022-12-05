
import java.awt.Color;
import java.awt.Point;

public abstract class AbstractShape implements  Shape,Moveable {
    private Point Position;
    private Color boarderColor;
    private Color fillColor;    
    private Point draggingPoint ;
    @Override
    public void setPosition(Point position) {
        this.Position = position;
    }
    

    @Override
    public Point getPosition() {
        return this.Position;
    }
    @Override
    public void setColor(Color color) {
        this.boarderColor = color;
    }

    @Override
    public Color getColor() {
        return this.boarderColor;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }


    @Override
    public void setDraggingPoint(Point draggingPoint) {
          this.draggingPoint = draggingPoint;
    }

    @Override
    public Point getDraggingPoint() {
        return draggingPoint;
    }
}
