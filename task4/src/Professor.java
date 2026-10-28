public class Professor extends People {

    public Professor(String login, String password, String fullName, int age) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.occupation = "Преподаватель";
    }
}
