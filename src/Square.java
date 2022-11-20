
import java.awt.Graphics;


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

    
 
    
}
