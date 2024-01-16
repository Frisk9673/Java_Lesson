import java.util.Scanner;

class test83 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hairetu = new int [10];

        int i;

        for (i = 1; i < 10; i++) {
            System.out.println(i + "件目：整数を入力 = ");
            hairetu[i] = scan.nextInt();
        }
        System.out.print( "\n奇数：" );
			for( int n : hairetu )
			    if( ( n % 2 ) != 0 )
			        System.out.print( n  + "," );

	    System.out.print( "\n偶数：" );
		    for( int n : hairetu )
			    if( ( n % 2 ) == 0 )
			        System.out.print( n + "," );
    }
}
