import java.util.Scanner;
import java.util.*;

class test9_1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        String school = stdIn.nextLine();
        String name = stdIn.nextLine();

        display(school, name);
    }    

    static void display(String[] args) {
        
        System.out.println("学校名：" + school);
        System.out.println("名前：" + name);
    }
}
