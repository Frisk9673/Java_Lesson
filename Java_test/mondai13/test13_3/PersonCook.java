package mondai13.test13_3;

public class PersonCook implements Person {
    private int id;
    private static int count = 0;

    private String name = "大原太郎";
    private String job = "シェフ";
    private String specialities = "オムライス";
    
    public PersonCook() {
        id = ++count;
    }

    @Override public void introduction() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialities);
    }
    public void printInfo() {
        System.out.println("++この教員の教員番号は[" + id + "]です。");
    }
}
