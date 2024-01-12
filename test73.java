import java.util.Scanner;
class test73 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        do{
            System.out.print("整数値を入力：");
            no = stdIn.nextInt();
        } while(no < 0);

        int dig = 0;
        do{
            System.out.printf("%d", no % 10);
            no = no / 10;
            dig++;
        } while(no > 0);

    }
}

