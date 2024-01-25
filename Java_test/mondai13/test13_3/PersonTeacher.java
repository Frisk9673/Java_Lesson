package mondai13.test13_3;

public class PersonTeacher implements Person {

    private String name;
    private String job;
    private String subject;
    
    public PersonTeacher(String name, String job, String subject) {
        this.name = name;
        this.job = job;
        this.subject = subject;
    }

    @Override public void introduction() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }

}
