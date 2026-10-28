public class Main {
    public static void main(String[] args) {
        Person person = new Person("Олег", "Степанов", 1998);
        Car car = new Car("Toyota", 2003, 200.0);
        Book book = new Book("Унесенные ветром", "Маргарет Митчелл", 2000);

        person.message(car, book);

        person.print();
        car.print();
        book.print();
    }
}