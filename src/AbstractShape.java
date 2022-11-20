
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public class AbstractShape implements Shape{
    private Point Position;
    private Color boarderColor;
    private Color fillColor;    

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
    public void draw(Graphics canvas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
