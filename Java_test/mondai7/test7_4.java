package mondai7;
class test7_4 {
    public static void main(String[] args) {

        //nとsum(合計)の初期値を設定
        int n = 0;
        int sum = 0;

        //合計が100000になる時に処理が終わるよう設定する
        while (sum < 100000) {
            //nを1ずつ増やす
            n = n + 1;
            //sumにnを足していく
            sum = sum + n;
        }
        //処理が終わった際のnの値を出力する
        System.out.println("合計が100000を超えるnは" + n + "です");
    }
}