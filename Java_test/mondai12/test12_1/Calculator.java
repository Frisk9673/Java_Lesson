package mondai12.test12_1;

class Calculator {
    
    //xとyを宣言する(プロパティ)
    int x;
    int y;

    //thisを使用する
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //合計値の処理
    public int CalcSum() {
        int sum = 0;
        sum = x + y;
        return sum;
    }

    //平均値の処理
    public int CalcAve() {
        int sum = 0;
        int avg = 0;
        sum = x + y;
        avg = sum / x;

        return avg;
    }
    
}
