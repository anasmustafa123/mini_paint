
import java.awt.Graphics;

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
    
}
