
public class MethodOverloadingDifferentParameters {
    static int area(int side) {
        return side * side;
    }

    static int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Square area = " + area(5));
        System.out.println("Rectangle area = " + area(5, 10));
    }
}
