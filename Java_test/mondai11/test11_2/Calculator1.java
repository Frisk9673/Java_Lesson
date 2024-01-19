package mondai11.test11_2;

class Calculator1 {
    //変数の宣言
    static int x;
    static int y;

    //代入用のものを用意する
    public static void CalculateValues(int newX, int newY) {
        x = newX;
        y = newY;
    }

    //合計値を求める
    public static int calculateSum1() {
        int sum = 0;
        for(int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}

