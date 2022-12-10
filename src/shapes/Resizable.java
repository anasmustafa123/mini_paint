/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shapes;

import java.awt.Graphics;
import java.awt.Point;


public interface Resizable{
    public int getmoveRaduis();
    public Point getResizeingPoint();
    public void setResizingPoint(Point movingPoint); // the point which we select to resize
    public boolean readyToMove(Point point);
    public void resize(Point point);
    public void drawResizable(Graphics g);
    public void setIfClicked(boolean isClicked);
    public boolean getIfClicked();
}
