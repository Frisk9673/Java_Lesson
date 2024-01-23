package mondai12.test12_1;

class MoreCalc extends Calculator {
    //Calculatorからnum1とnum2を引き継ぐ
    public MoreCalc(int num1, int num2) {
        //superでnum1とnum2を引き継ぐ
        super(num1, num2);
    }

    //累乗の処理
    public int CalcPow() {
        int pow = 1;
        for (int i = 1; i <= num2; i++) {
        pow = pow * num1;
        }
        return pow;
    }
}