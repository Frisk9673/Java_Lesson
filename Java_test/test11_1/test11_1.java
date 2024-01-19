package test11_1;
import java.util.Scanner;



class test11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //半径を整数値で入力させる
        System.out.print("半径を整数値で入力：");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        
        double c = circle.calculateC();
        double area = circle.calculateArea();

        System.out.printf("円周の長さは%.3fです。\n", c);
        System.out.printf("円の面積は%.3fです。\n", area);
    }
}