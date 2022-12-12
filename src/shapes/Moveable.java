package shapes;


import java.awt.Point;


public interface Moveable {
    public abstract void setDraggingPoint(Point point);
    public abstract Point getDraggingPoint();
    public abstract boolean contains(Point point);
    public abstract void moveTo(Point point);
}
