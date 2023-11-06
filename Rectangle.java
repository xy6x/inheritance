public class Rectangle extends Shape {
    private  double width =1 ;
    private double length=1;
    public Rectangle(){

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double Area(){

        return this.length*this.width;
    }
    public double Perimeter(){

        return (this.length*2)+(this.width*2);
    }
    public String toString(){
        return "Width is: "+getWidth()+"Length is: " +getLength()+"Area is: "+Area()+" Perimeter is: "+Perimeter();
    }
}
