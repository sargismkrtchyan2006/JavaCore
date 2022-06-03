package classwork.Lesson10;

public class Box {
    double height;
    double width;
    double depth;

    Box() {
        System.out.println("Box-i karucum");
        width = 10;
        height = 10;
        depth = 10;
    }

    void setdim(double w, double d, double h) {
        width = w;
        height = h;
        depth = d;
    }

    double vol() {
        return width * depth * height;
    }


}








