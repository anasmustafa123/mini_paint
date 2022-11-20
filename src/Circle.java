
import java.awt.Graphics;


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
}
