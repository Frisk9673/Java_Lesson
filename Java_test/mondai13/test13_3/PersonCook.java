package mondai13.test13_3;

public class PersonCook implements Person {

    private String name;
    private String job;
    private String specialities;
    
    public PersonCook(String name, String job, String specialities) {
        this.name = name;
        this.job = job;
        this.specialities = specialities;
    }

    @Override public void introduction() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialities);
    }
    
}
