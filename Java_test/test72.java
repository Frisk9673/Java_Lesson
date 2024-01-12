class test72 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        do {
            num = num + 1;
            sum = sum + num;
        }
        while (num < 100);
        System.out.println("合計：" + sum);
    }
}
