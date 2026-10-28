public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("mathProf", "password", "Гарпунов Макс Ильгизович", 40);
        Professor professor2 = new Professor("ayaCapi", "111111", "Алессандров Юрий Алексеевич", 23);
        Student student1 = new Student("fvik2009", "dontHackMePLZ", "Федяева Виктория Антоновна", 17);
        Student student2 = new Student("misterFist", "000", "Зуев Георгий Максимович", 17);

        professor1.login();
        professor1.logout();
        student2.login();
        student2.logout();
    }
}