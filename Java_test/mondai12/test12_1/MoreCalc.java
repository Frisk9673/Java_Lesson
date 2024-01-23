package mondai12.test12_1;

class MoreCalc extends Calculator {

    public MoreCalc(int x, int y) {
        super(x, y);
    }

    //累乗の処理
    public int CalcPow() {
        int pow = 1;
        for (int i = 1; i <= y; i++) {
        pow = pow * x;
        }
        return pow;
    }
}