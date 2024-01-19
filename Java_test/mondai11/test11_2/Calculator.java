package mondai11.test11_2;

class Calculator {

    //変数の宣言
    private int x;
    private int y;

    //thisを使用する
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //合計値を求める
    public int calculateSum() {
        int sum = 0;
        for(int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}
