public class Square extends  Rectangle{
    public Square(){

    }

    public Square(double width, double length) {
        super(width, length);
    }


    public Square(double side){
setWidth(side);
setLength(side);
    }

    public Square(double side ,String color, boolean filled) {
        super(color, filled, side, side);
    }
    public double getSide(){

        return getWidth();
    }
    public void setSide(double side){
    setWidth(side);
    setLength(side);
    }
    public String toString(){
        return "Side:"+ getSide();
    }
}

