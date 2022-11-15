public class Circle {
	
    private double radius;
    private String color;
    
    public Circle() {
        this(1.0, "red");
    }
    
    public Circle(double r) {
        this(r, "red");
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color =  color;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle's radius = " + radius + "\nCircle's color : " + color;
    }
}
