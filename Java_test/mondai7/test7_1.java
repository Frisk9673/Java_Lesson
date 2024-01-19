package mondai7;
class test7_1 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while (num < 100) {
            num = num + 1;
            sum = sum + num;
        }
        System.out.println("合計：" + sum);
    }
}
