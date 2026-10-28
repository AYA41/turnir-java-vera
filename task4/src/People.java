import java.util.Scanner;

public abstract class People implements User {

    String login;
    String password;
    String fullName;
    int age;
    String occupation;

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        if (scanner.nextLine().equals(password)) {
            System.out.println("Добро пожаловать, " + login);
        } else {
            System.out.println("Пароль неправильный");
        }
    }

    @Override
    public void logout() {
        System.out.println("Вы вышли из аккаунта");
    }
}
