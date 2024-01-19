package mondai11.test11_2;

class test11_2 {
    public static void main(String[] args) {
        //クラス変数xとyに値を代入する
        Calculator1.CalculateValues(100, 200);
    
    //合計値を計算して算出
    int sum = Calculator1.calculateSum1();
    System.out.println(Calculator1.x + "から" + Calculator1.y + "までの合計値は" + sum + "です。");
}
}
