
import java.awt.Graphics;
import java.awt.Point;


public class Square extends AbstractShape{

    private int length;
    
    public int getLength(){
        return this.length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawRect(getPosition().x,getPosition().y, length, length);
        canvas.setColor(getFillColor());
        canvas.fillRect(getPosition().x,getPosition().y, length, length);
    
    }

    @Override
    public void moveTo(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public boolean contains(Point point) { // what should it do
        return false;
    }
    
 
    
}
