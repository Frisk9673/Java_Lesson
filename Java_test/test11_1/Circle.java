package test11_1;

class Circle {
    public static final double PI = 3.1415;
    public double radius;

    //radiusを宣言
    public Circle(double radius) {
        this.radius = radius;
    }

    //円周の長さ
    public double calculateC() {
        return 2 * PI * radius;
    }

    //面積
    public double calculateArea() {
        return PI * radius * radius;
    }
}


