package mondai13.test13_3;

public class PersonTeacher implements Person {
    private int id;
    private static int count = 0;

    private String name = "竹井一馬";
    private String job = "教員";
    private String subject = "情報処理";
    
    public PersonTeacher() {
        id = ++count;
    }

    @Override public void introduction() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }
    public void printInfo() {
        System.out.println("++この教員の教員番号は[" + id + "]です。");
    }

}
