package inflearn.basic1.object_programming.question;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        RectangleProcedural rectangleProcedural = new RectangleProcedural();

        int a = rectangleProcedural.calculateArea(5, 7);
        int b = rectangleProcedural.calculatePerimeter(5, 7);
        boolean c = rectangleProcedural.isSquare(7, 5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class RectangleProcedural {
    int width;
    int height;
    int area;

    Integer calculateArea(int width, int height) {
        return width * height;
    }
    Integer calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
    boolean isSquare(int width , int height) {
        return width == height;
    }
}

