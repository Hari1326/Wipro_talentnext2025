
class Box {
    double width;
    double height;
    double depth;  
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }  
    double getVolume() {
        return width * height * depth;
    }
}
public class oop1 {
    public static void main(String[] args) {     
        Box myBox = new Box(5.0, 4.0, 3.0);     
        double volume = myBox.getVolume();
        System.out.println("Volume of the box: " + volume);
    }
}

