package mondai11.test11_2;

class test11_2 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        Calculator calculator = new Calculator(x, y);
        int sum = calculator.calculateSum();

        System.out.println(x + "から" + y +"までの合計値は" + sum + "です。");
    }
}
