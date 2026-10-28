public class Person {
    private String name;
    private String surname;
    private int birthYear;

    public Person(String name, String surname, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear);
    }

    public void message(Car car, Book book) {
        System.out.println(this.name + " читает книгу " + '"' + book.getTitle() + '"' + " про машину " + car.getCarMake());
    }
}
