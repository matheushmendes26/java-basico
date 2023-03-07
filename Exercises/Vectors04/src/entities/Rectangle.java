package entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return width*height;
    }
    public double Perimeter(){
        return 2*height + 2*width;
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }

    public String toString(){
        return "AREA = "+String.format("%.2f\n",Area())+
        "PERIMETER = "+String.format("%.2f\n",Perimeter())+
        "DIAGONAL = "+String.format("%.2f\n",Diagonal());
    }
}
