package mondai12.test12_1;

class Calculator {
    
    //num1とnum2を宣言する(プロパティ)
    int num1;
    int num2;

    //thisを使用する
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //合計値の処理
    public int CalcSum() {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    //平均値の処理
    public int CalcAve() {
        //sumとabgを宣言してからnum1とnum2を使用して計算をする
        int sum = 0;
        int avg = 0;
        sum = num1 + num2;
        avg = sum / num1;

        return avg;
    }
    
}
