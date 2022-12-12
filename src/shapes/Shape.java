package shapes;

import org.json.simple.JsonObject;

public interface Shape {
public void setPosition(java.awt.Point position);
public java.awt.Point getPosition();
public void setColor(java.awt.Color color);
public java.awt.Color getColor();
public void setFillColor(java.awt.Color color);
public java.awt.Color getFillColor();
public void draw(java.awt.Graphics canvas);
public JsonObject toJsonJSObject();
public Shape fromJsonToShape(JsonObject object);
}