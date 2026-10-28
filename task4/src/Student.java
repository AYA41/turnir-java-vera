public class Student extends People {

    public Student(String login, String password, String fullName, int age) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.occupation = "Студент";
    }
}
