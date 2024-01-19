package mondai11.test11_3;

class test11_3 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        Calculator2 calculator = new Calculator2(x, y);
        int sum = calculator.calculateSum2();

        System.out.println(x + "から" + y +"までの合計値は" + sum + "です。");
    }
}
